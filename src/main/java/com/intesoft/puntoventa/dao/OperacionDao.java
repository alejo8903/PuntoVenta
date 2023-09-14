/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.entity.Operacion;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author alejo
 */
public class OperacionDao {

    private final EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public OperacionDao(String persistence) {
        this.entityManagerFactory = Persistence.createEntityManagerFactory(persistence);
    }

    public void close() {
        entityManagerFactory.close();
    }

    public int crearVenta(Operacion operacion) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(operacion);
        entityManager.flush();
        int idVenta = operacion.getIdOperacion();
        entityManager.getTransaction().commit();
        entityManager.close();
        return idVenta;
    }

    public Operacion getById(int id) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Operacion venta = entityManager.find(Operacion.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return venta;
    }

    public List<Operacion> getAllEgresos(Date fechaInicio, Date fechaFin) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        List<Operacion> listOperacion = new ArrayList<>();

        try {
            String jpql = "SELECT o FROM Operacion o "
                    + "WHERE o.fecha BETWEEN :fechaInicio AND :fechaFin "
                    + "AND o.valor < 0";

            TypedQuery<Operacion> query = entityManager.createQuery(jpql, Operacion.class);
            query.setParameter("fechaInicio", fechaInicio);
            query.setParameter("fechaFin", fechaFin);

            listOperacion = query.getResultList();
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }

        return listOperacion;
    }

    public double getTotalCajaVenta() {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        // Sumar el valor de operaciones SEPARADO y VENTACREDITO
        Double totalCaja = entityManager.createQuery(
                "SELECT SUM(o.valor) FROM Operacion o WHERE o.operacion NOT IN ('SEPARADO', 'VENTACREDITO')", Double.class)
                .getSingleResult();

        if (totalCaja == null) {
            totalCaja = 0.0;
        }

        entityManager.getTransaction().commit();
        entityManager.close();

        return totalCaja;
    }

}
