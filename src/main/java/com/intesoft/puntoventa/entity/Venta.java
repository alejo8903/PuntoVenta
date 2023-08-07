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
@Table(name = "venta")
public class Venta {
    @Id
    @Column(name = "idventa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idVenta;
    @Column(name = "fecha")
    Date fecha;
    @Column(name = "valor")
    double valor;

    public Venta() {
    }

    public Venta(int idVenta, Date fecha, double valor) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.valor = valor;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
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
    
    
}
