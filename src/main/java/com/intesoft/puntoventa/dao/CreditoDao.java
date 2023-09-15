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

    public int create(Credito credito) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(credito);
        int idVenta = credito.getIdCredito();
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return idVenta;
    }

    public Credito findById(int idCredito) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Credito credito = entityManager.find(Credito.class, idCredito);

        entityManager.close();
        entityManagerFactory.close();
        return credito;
        

    }

    public List<CreditoDto> getListaCreditos(String tipoCredito) {
        try {
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
            return listCreditoDto;
        } finally {

            entityManager.close();
            entityManagerFactory.close();
        }

    }

    public void merge(Credito credito) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(credito);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
    @Transactional
    public double getTotalCreditosPagados() {
        try{
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
        return totalCreditosPagados;
        }finally{

           entityManager.close(); 
           entityManagerFactory.close();
        }
        

        
    }
    @Transactional
    public double getTotalAbonosNoPagado() {
        
        try {
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
        

        return totalAbonosPendientes;
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        
    }

}
