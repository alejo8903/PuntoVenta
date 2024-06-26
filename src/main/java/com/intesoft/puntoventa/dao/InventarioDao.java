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
    EntityManager entityManager;

    public InventarioDao(String pesristence) {
        this.entityManagerFactory = Persistence.createEntityManagerFactory(pesristence);
    }

    public void close() {
        entityManagerFactory.close();
    }

    public List<Inventario> getAll() {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Inventario> listInventarios = entityManager
                .createQuery("SELECT i FROM Inventario i "
                        + "WHERE i.cantidad <> 0 ", Inventario.class)
                .getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();
        return listInventarios;
    }

    public List<InventarioDto> searchByCodigo(int codigo) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        String queryString = "SELECT NEW com.intesoft.puntoventa.dto.InventarioDto(i.id, m.codigo, m.descripcion, m.talla, m.color, i.cantidad,"
                + " i.valorCompra, i.iva, i.totalCompra, i.porcentajeGanancia, i.valorVenta) "
                + "FROM Inventario i "
                + "JOIN i.codigo m "
                + "WHERE 1=1 ";

        if (codigo != 0) {
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
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Inventario inventario = entityManager.find(Inventario.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return inventario;

    }

    public void update(Inventario inventario) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(inventario);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void create(Inventario inventario) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(inventario);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void modify(Inventario inventario) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Inventario existingInventario = entityManager.find(Inventario.class, inventario.getId());

        if (existingInventario != null) {
            existingInventario.setCantidad(inventario.getCantidad());
            existingInventario.setValorCompra(inventario.getValorCompra());
            existingInventario.setIva(inventario.getIva());
            existingInventario.setTotalCompra(inventario.getTotalCompra());
            existingInventario.setPorcentajeGanancia(inventario.getPorcentajeGanancia());
            existingInventario.setValorVenta(inventario.getValorVenta());
            entityManager.merge(existingInventario);
            entityManager.getTransaction().commit();
        } else {
            // Manejo de error: El inventario no existe
            entityManager.getTransaction().rollback();
        }

        entityManager.close();
    }

    public void delete(int id) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Inventario inventario = entityManager.find(Inventario.class, id);

        if (inventario != null) {
            entityManager.remove(inventario);
            entityManager.getTransaction().commit();
        } else {
            // Manejo de error: El inventario no existe
            entityManager.getTransaction().rollback();
        }

        entityManager.close();
    }

}
