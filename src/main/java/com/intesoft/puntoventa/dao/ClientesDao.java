/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.entity.Clientes;
import java.sql.Connection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alejo
 */
public class ClientesDao {

    private final EntityManagerFactory entityManagerFactory;

  
    public ClientesDao() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("testPersistenceUnit");
    }
    
    public List<Clientes> getAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Clientes> listClientes = entityManager
                .createQuery("SELECT c FROM Clientes c", Clientes.class ).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return listClientes;
    }

    public void create(Clientes cliente) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void merge(Clientes cliente) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();
        entityManager.close();
        
    }
    
}
