/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.entity.Operacion;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alejo
 */
public class VentasDao {
    private final  EntityManagerFactory entityManagerFactory;
    
    public VentasDao() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
    }
    
    public void  close(){
        entityManagerFactory.close();
    }
    public int crearVenta(Operacion ventas) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(ventas);
        entityManager.flush();
        int idVenta = ventas.getIdOperacion();
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
    
}
