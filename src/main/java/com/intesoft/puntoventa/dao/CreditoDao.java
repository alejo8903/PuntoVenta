/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.dto.CreditoDto;
import com.intesoft.puntoventa.entity.Credito;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 *
 * @author alejo
 */
public class CreditoDao {

    private final EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public CreditoDao(String persitencia) {
        this.entityManagerFactory = Persistence.createEntityManagerFactory(persitencia);
    }

    public void close() {
        entityManagerFactory.close();
    }

    public int create(Credito credito) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(credito);
        int idVenta = credito.getIdCredito();
        entityManager.getTransaction().commit();

        entityManager.close();
        return idVenta;
    }

    public Credito findById(int idCredito) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Credito credito = entityManager.find(Credito.class, idCredito);

        entityManager.close();
        return credito;

    }

    public List<CreditoDto> getListaCreditos(String tipoCredito) {

        entityManager = entityManagerFactory.createEntityManager();
        List<CreditoDto> listCreditoDto = new ArrayList<>();
        entityManager.getTransaction().begin();

        // Escribe una consulta JPQL para recuperar los datos
        String jpql = "SELECT NEW com.intesoft.puntoventa.dto.CreditoDto("
                + "c.id, c.clientes.nombre, c.clientes.apellido, c.operacion.valor, c.totalAbonado) "
                + "FROM Credito c "
                + "WHERE c.pagado = false " // Cambiado de "FAlSE" a "false"
                + "AND EXISTS (SELECT o FROM Operacion o WHERE o.idOperacion = c.operacion.idOperacion AND o.operacion = :tipoCredito)";

        TypedQuery<CreditoDto> query = entityManager.createQuery(jpql, CreditoDto.class);
        query.setParameter("tipoCredito", tipoCredito);

        listCreditoDto = query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return listCreditoDto;

    }

    public void merge(Credito credito) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(credito);
        entityManager.getTransaction().commit();

        entityManager.close();

    }

    @Transactional
    public double getTotalCreditosPagados() {

        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        // Sumar el valor de créditos pagados
        Double totalCreditosPagados = entityManager.createQuery(
                "SELECT SUM(c.totalCredito) FROM Credito c WHERE c.pagado = true", Double.class)
                .getSingleResult();

        if (totalCreditosPagados == null) {
            totalCreditosPagados = 0.0;
        }

        entityManager.getTransaction().commit();
        entityManager.close();
        return totalCreditosPagados;

    }

    public double getTotalAbonosNoPagado() {

        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        // Sumar los abonos pendientes (donde pagado es igual a false)
        Double totalAbonosPendientes = entityManager.createQuery(
                "SELECT SUM(c.totalAbonado) FROM Credito c WHERE c.pagado = false", Double.class)
                .getSingleResult();

        if (totalAbonosPendientes == null) {
            totalAbonosPendientes = 0.0;
        }

        entityManager.getTransaction().commit();
        entityManager.close();
        return totalAbonosPendientes;

    }

    public Credito getCreditByOperation(int idOperacion) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        // Escribe una consulta JPQL para recuperar los datos
        String jpql = "SELECT c FROM Credito c "
                + "WHERE c.operacion.idOperacion = :idOperacion";

        TypedQuery<Credito> query = entityManager.createQuery(jpql, Credito.class);
        query.setParameter("idOperacion", idOperacion);

        Credito credito = query.getSingleResult();

        entityManager.getTransaction().commit();
        entityManager.close();
        return credito;

    }

    public void remove(Credito credito) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Credito creditoConectado = entityManager.merge(credito);
        entityManager.remove(creditoConectado);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
