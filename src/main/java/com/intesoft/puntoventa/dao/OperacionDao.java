/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.entity.Operacion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alejo
 */
public class OperacionDao {
    private final  EntityManagerFactory entityManagerFactory;
    
    public OperacionDao() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
    }
    
    public void  close(){
        entityManagerFactory.close();
    }
    public int crearVenta(Operacion operacion) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(operacion);
        entityManager.flush();
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

    public List<Operacion> getAllEgresos() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
       
       List<Operacion> listOpeacion = entityManager.createQuery
        ("SELECT o FROM Operacion o WHERE o.valor<0", Operacion.class)
               .getResultList();
       
       entityManager.getTransaction().commit();
       entityManager.close();
       return listOpeacion;
    }
    
}
