/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.dto.InventarioDto;
import com.intesoft.puntoventa.entity.Inventario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

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

    public List<InventarioDto> searchByCodigo(int codigo) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        
        String queryString = "SELECT NEW com.intesoft.puntoventa.dto.InventarioDto(i.id, m.codigo, m.descripcion, m.talla, m.color, i.cantidad,"+
                " i.valorCompra, i.iva, i.totalCompra, i.porcentajeGanancia, i.valorVenta) " +
                "FROM Inventario i " +
                "JOIN i.codigo m " +
                "WHERE 1=1 ";

        if (codigo != 0 ) {
            queryString += " AND m.codigo LIKE :codigo";
        }
        queryString += " AND i.cantidad <> 0";
   

        TypedQuery<InventarioDto> query = entityManager.createQuery(queryString, InventarioDto.class);
        
        if (codigo != 0) {
            query.setParameter("codigo", "%" + Integer.toString(codigo) + "%");
        }

        List<InventarioDto> resultList = query.getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();

        return resultList;
    }

    public Inventario productoById(int id) {
        
       EntityManager entityManager = entityManagerFactory.createEntityManager();
       entityManager.getTransaction().begin();
       Inventario inventario = entityManager.find(Inventario.class, id);
       entityManager.getTransaction().commit();
       entityManager.close();
       return inventario;
    
    }
}
