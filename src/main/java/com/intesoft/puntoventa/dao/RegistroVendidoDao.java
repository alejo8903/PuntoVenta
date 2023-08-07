/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.entity.RegistroVendido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author alejo
 */
public class RegistroVendidoDao {
    private final EntityManagerFactory entityManagerFactory;
    
    public RegistroVendidoDao() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
    }
    
    public void  close(){
        entityManagerFactory.close();
    }
    public void batchCreateRgistrosVenta(List<RegistroVendido> listRegistroVendidos) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
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
    
}
