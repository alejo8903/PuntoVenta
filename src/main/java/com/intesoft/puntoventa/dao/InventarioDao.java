/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.entity.Inventario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alejo
 */
@Stateless
public class InventarioDao {
    private final EntityManagerFactory entityManagerFactory;

    public InventarioDao() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
    }
    
    public void  close(){
        entityManagerFactory.close();
    }
    
    public List<Inventario> getAll(){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Inventario> usuariosList = entityManager
                .createQuery("SELECT i FROM Inventario i",Inventario.class)
                .getResultList();
        
        entityManager.getTransaction().commit();
        entityManager.close();
        return usuariosList;  
    }
}
