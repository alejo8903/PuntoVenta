/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.entity.DescripcionOperacion;
import com.intesoft.puntoventa.entity.Operacion;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 *
 * @author alejo
 */
public class DescripcionOperacionDao {

    private final EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public DescripcionOperacionDao(String persistencia) {
        this.entityManagerFactory = Persistence.createEntityManagerFactory(persistencia);
    }

    public void create(DescripcionOperacion descripcionOperacion) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(descripcionOperacion);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public List<DescripcionOperacion> getAllEgresos(Date fechaInicio, Date fechaFin) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        List<DescripcionOperacion> listDescripcionOperacion;

        String jpql = "SELECT d FROM DescripcionOperacion d "
                + "WHERE d.operacion.valor < 0 "
                + "AND d.operacion.fecha BETWEEN :fechaInicio AND :fechaFin";

        TypedQuery<DescripcionOperacion> query = entityManager.createQuery(jpql, DescripcionOperacion.class);
        query.setParameter("fechaInicio", fechaInicio);
        query.setParameter("fechaFin", fechaFin);

        listDescripcionOperacion = query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();

        return listDescripcionOperacion;

    }

    public void delete(Operacion operacion) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        int idOperacion = operacion.getIdOperacion();
        try {
            entityManager.getTransaction().begin();

            // Buscar la descripción de operación asociada a la operación dada
            String jpql = "SELECT d FROM DescripcionOperacion d WHERE d.operacion.idOperacion = :idOperacion";
            TypedQuery<DescripcionOperacion> query = entityManager.createQuery(jpql, DescripcionOperacion.class);
            query.setParameter("idOperacion", idOperacion);

            DescripcionOperacion descripcionOperacion = query.getSingleResult();

            // Eliminar la descripción de operación
            if (descripcionOperacion != null) {
                entityManager.remove(descripcionOperacion);
            }

            entityManager.getTransaction().commit();
        } catch (NoResultException e) {
            // Maneja aquí la situación en la que no se encuentra ninguna DescripcionOperacion
            e.printStackTrace(); // O maneja el error de acuerdo a tu lógica
        } finally {
            entityManager.close();
        }
    }

    public void update(DescripcionOperacion descripcionOperacion) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(descripcionOperacion);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public DescripcionOperacion getDescripcionOperacionByOperacion(Operacion operacion) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();

            String jpql = "SELECT d FROM DescripcionOperacion d WHERE d.operacion = :operacion";
            TypedQuery<DescripcionOperacion> query = entityManager.createQuery(jpql, DescripcionOperacion.class);
            query.setParameter("operacion", operacion);

            DescripcionOperacion descripcionOperacion = query.getSingleResult();

            entityManager.getTransaction().commit();

            return descripcionOperacion;
        } finally {
            entityManager.close();
        }
    }
}
