/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.entity.Credito;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
        return idVenta;
    }

    public Credito findById(int idCredito) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        return  entityManager.find(Credito.class, idCredito);
       
        
        }
    
}
