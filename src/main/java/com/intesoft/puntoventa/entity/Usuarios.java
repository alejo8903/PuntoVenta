/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 *
 * @author alejo
 */
@Entity
@Table(name = "usuarios")
public class Usuarios implements java.io.Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int idUsuario;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "contraseña")
    private String contraseña;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "p_productos")
    private boolean pProdcuctos;
    @Column(name = "P_ADMIN_USER")
    private boolean pAdminUser;
    
    

    public Usuarios() {
    }

    public Usuarios(String usuario, String contraseña, String nombres, String apellidos, boolean pProdcuctos, boolean pAdminUser) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.pProdcuctos = pProdcuctos;
        this.pAdminUser = pAdminUser;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public boolean ispProdcuctos() {
        return pProdcuctos;
    }

    public void setpProdcuctos(boolean pProdcuctos) {
        this.pProdcuctos = pProdcuctos;
    }

    public boolean ispAdminUser() {
        return pAdminUser;
    }

    public void setpAdminUser(boolean pAdminUser) {
        this.pAdminUser = pAdminUser;
    }

    
    
}
