/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.entity.Usuarios;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author alejo
 */
@Stateless
public class UsuariosDao {

    private final EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public UsuariosDao(String persistence) {
        this.entityManagerFactory = Persistence.createEntityManagerFactory(persistence);
    }

    public void close() {
        entityManagerFactory.close();
    }

    public List<Usuarios> getAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Usuarios> usuariosList = entityManager
                .createQuery("SELECT u FROM Usuarios u", Usuarios.class)
                .getResultList();

        entityManager.getTransaction().commit();
        entityManager.flush();
        entityManager.close();
        entityManagerFactory.close();
        return usuariosList;
    }

    public Usuarios getById(int idUsuario) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Usuarios usuarios = entityManager
                .find(Usuarios.class, idUsuario);
        entityManager.getTransaction().commit();
        entityManager.flush();
        entityManager.close();
        entityManagerFactory.close();
        return usuarios;
    }

    public Usuarios getByUser(String user) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Usuarios usuario = entityManager
                    .createQuery("SELECT u FROM Usuarios u WHERE u.usuario = :user", Usuarios.class)
                    .setParameter("user", user)
                    .getSingleResult();
            entityManager.getTransaction().commit();
            entityManager.close();
            return usuario;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Usuario no encontrado \n" + e, "Advertencia", JOptionPane.WARNING_MESSAGE);
            Usuarios usuario = null;
            return usuario;
        } finally {

            
            entityManagerFactory.close();
        }

    }

    public void update(Usuarios usuarios) {
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.merge(usuarios);
            entityManager.getTransaction().commit();
        } finally {
            
            

        entityManager.close();
                entityManagerFactory.close();
            }

        }

    

    public void create(Usuarios usuarios) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(usuarios);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }

    public void delete(int id) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Usuarios usuarios = entityManager.find(Usuarios.class, id);

        if (usuarios != null) {
            entityManager.remove(usuarios);
            entityManager.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}
