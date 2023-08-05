/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.entity.Maestro;
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
public class MaestroDao {
    private final EntityManagerFactory entityManagerFactory;

    public MaestroDao() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
    }
    
    public void  close(){
        entityManagerFactory.close();
    }
    
     public Maestro findById(String codigo){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
       entityManager.getTransaction().begin();
       Maestro master = entityManager.find(Maestro.class, codigo);
       entityManager.getTransaction().commit();
       entityManager.close();
       return master;
    }

   public List<Maestro> getAll(){
       EntityManager entityManager = entityManagerFactory.createEntityManager();
       entityManager.getTransaction().begin();
       
       List<Maestro> master = entityManager.createQuery
        ("SELECT m FROM Maestro m", Maestro.class)
               .getResultList();
       
       entityManager.getTransaction().commit();
       entityManager.close();
       return master;
   }
   
   public void merge(Maestro maestro){
       EntityManager entityManager = entityManagerFactory.createEntityManager();
       
       entityManager.getTransaction().begin();
       
       entityManager.merge(maestro);
       
       entityManager.getTransaction().commit();
       
       entityManager.close();
       
   }
   
   public void create(Maestro maestro){
       EntityManager entityManager = entityManagerFactory.createEntityManager();
       entityManager.getTransaction().begin();
       
       entityManager.persist(maestro);
       
       entityManager.getTransaction().commit();
       entityManager.close();
   }
}
