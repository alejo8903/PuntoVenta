/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.dto.IngresosDto;
import com.intesoft.puntoventa.entity.RegistroVendido;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 *
 * @author alejo
 */
public class RegistroVendidoDao {

    private final EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public RegistroVendidoDao(String persistence) {
        this.entityManagerFactory = Persistence.createEntityManagerFactory(persistence);
    }

    public void close() {
        entityManagerFactory.close();
    }

    public void batchCreateRgistrosVenta(List<RegistroVendido> listRegistroVendidos) {
        entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            int batchSize = 200; // Elige el tamaño del lote adecuado según tus necesidades.
            int count = 0;

            for (RegistroVendido registroVendido : listRegistroVendidos) {
                entityManager.persist(registroVendido);
                count++;

                if (count % batchSize == 0) {
                    entityManager.flush();
                    entityManager.clear();
                    transaction.commit();

                }

            }

            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            ex.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    @Transactional
    public List<IngresosDto> getIngresosEntreFechas(Date fechaInicio, Date fechaFin) {
        entityManager = entityManagerFactory.createEntityManager();
        List<IngresosDto> listIngresosDto = new ArrayList<>();
        try {
            // Escribe una consulta JPQL para recuperar los datos
            String jpql = "SELECT NEW com.intesoft.puntoventa.dto.IngresosDto("
                    + "rv.id, rv.operacion.idOperacion, rv.codigo, rv.descripcion, rv.talla, rv.color, "
                    + "o.operacion, o.fecha, o.usuario, rv.cantidad, rv.valorCompra, "
                    + "rv.valorVenta) "
                    + "FROM RegistroVendido rv "
                    + "JOIN rv.operacion o "
                    + "WHERE o.fecha BETWEEN :fechaInicio AND :fechaFin "
                    + "AND NOT EXISTS (SELECT c FROM Credito c WHERE c.operacion.idOperacion = rv.operacion.idOperacion AND c.pagado = false)";

            TypedQuery<IngresosDto> query = entityManager.createQuery(jpql, IngresosDto.class);
            query.setParameter("fechaInicio", fechaInicio);
            query.setParameter("fechaFin", fechaFin);

            listIngresosDto = query.getResultList();
            return listIngresosDto;
        } finally {
            entityManager.close();
        }

    }

    public List<IngresosDto> getIngresosByIdOperation(int idOperatcion) {
        entityManager = entityManagerFactory.createEntityManager();
        List<IngresosDto> listIngresosDto = new ArrayList<>();
        try {
            // Escribe una consulta JPQL para recuperar los datos
            String jpql = "SELECT NEW com.intesoft.puntoventa.dto.IngresosDto("
                    + "rv.id, rv.operacion.idOperacion, rv.codigo, rv.descripcion, rv.talla, rv.color, "
                    + "rv.operacion.operacion, rv.operacion.fecha, rv.operacion.usuario, rv.cantidad, rv.valorCompra, "
                    + "rv.valorVenta) "
                    + "FROM RegistroVendido rv "
                    + "WHERE rv.operacion.idOperacion = :idOperacion";

            TypedQuery<IngresosDto> query = entityManager.createQuery(jpql, IngresosDto.class);
            query.setParameter("idOperacion", idOperatcion);

            listIngresosDto = query.getResultList();
            return listIngresosDto;
        } finally {
            entityManager.close();
        }

    }

    public RegistroVendido getRegistroVendidoByIdOperation(int idRegistroVendido) {
        entityManager = entityManagerFactory.createEntityManager();
        
        try {
            // Escribe una consulta JPQL para recuperar los datos
            String jpql = "SELECT rv FROM RegistroVendido rv "
                    + "WHERE rv.id = :idRegistroVendido";

            TypedQuery<RegistroVendido> query = entityManager.createQuery(jpql, RegistroVendido.class);
            query.setParameter("idRegistroVendido", idRegistroVendido);

            RegistroVendido registroVendido  = query.getSingleResult();
            return registroVendido;
        } finally {
            entityManager.close();
        }

    }

    public void remove(RegistroVendido registroVendido) {
        entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        
        RegistroVendido entidadConectada = entityManager.merge(registroVendido);

        entityManager.remove(entidadConectada);

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
