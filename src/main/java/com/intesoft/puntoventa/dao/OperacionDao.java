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
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 *
 * @author alejo
 */
public class OperacionDao {

    private final EntityManagerFactory entityManagerFactory;

    public OperacionDao(String persistence) {
        this.entityManagerFactory = Persistence.createEntityManagerFactory(persistence);
    }

    public void close() {
        entityManagerFactory.close();
    }

    public int crearVenta(Operacion operacion) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(operacion);
        int idVenta = operacion.getIdOperacion();
        entityManager.getTransaction().commit();

        entityManager.close();
        return idVenta;
    }

    public Operacion getById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Operacion venta = entityManager.find(Operacion.class, id);
        entityManager.getTransaction().commit();

        entityManager.close();
        return venta;
    }

    @Transactional
    public List<Operacion> getAllEgresos(Date fechaInicio, Date fechaFin) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();

            List<Operacion> listOperacion;

            String jpql = "SELECT o FROM Operacion o "
                    + "WHERE o.fecha BETWEEN :fechaInicio AND :fechaFin "
                    + "AND o.valor < 0";

            TypedQuery<Operacion> query = entityManager.createQuery(jpql, Operacion.class);
            query.setParameter("fechaInicio", fechaInicio);
            query.setParameter("fechaFin", fechaFin);

            listOperacion = query.getResultList();
            entityManager.getTransaction().commit();
            entityManager.close();

            return listOperacion;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }

    public double getTotalCajaVenta() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
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

    public void remove(Operacion operacion) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Operacion operacionConectada = entityManager.merge(operacion);
        entityManager.remove(operacionConectada);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void update(Operacion operacion) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(operacion);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
