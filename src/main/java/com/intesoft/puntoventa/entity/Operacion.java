/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alejo
 */
@Entity
@Table(name = "operacion")
public class Operacion {
    @Id
    @Column(name = "idoperacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idOperacion;
    @Column(name = "fecha")
    Date fecha;
    @Column(name = "valor")
    double valor;
    @Column(name = "usuario")
    String usuario;
    @Column(name = "operacion")
    String operacion;

    public Operacion() {
    }

    public Operacion(int idVenta, Date fecha, double valor, String usuario, String operacion) {
        this.idOperacion = idVenta;
        this.fecha = fecha;
        this.valor = valor;
        this.usuario = usuario;
        this.operacion = operacion;
    }

   

    public int getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(int idOperacion) {
        this.idOperacion = idOperacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    
}
