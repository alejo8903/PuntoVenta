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
@Table(name = "credito")
public class Credito {
    @Id
    @Column(name = "id_credito")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCredito;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idoperacion")
    Operacion operacion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    Clientes clientes;
    @Column(name = "total_credito")
    private double totalCredito;
    @Column(name = "total_abonado")
    private double totalAbonado;
    @Column(name = "pagado")
    private boolean pagado;
    

    public Credito() {
    }

    public Credito(int idCredito, Operacion operacion, Clientes clientes, double totalCredito, double totalAbonado, boolean pagado) {
        this.idCredito = idCredito;
        this.operacion = operacion;
        this.clientes = clientes;
        this.totalCredito = totalCredito;
        this.totalAbonado = totalAbonado;
        this.pagado = pagado;
    }

    public int getIdCredito() {
        return idCredito;
    }

    public void setIdCredito(int idCredito) {
        this.idCredito = idCredito;
    }

    public Operacion getOperacion() {
        return operacion;
    }

    public void setOperacion(Operacion Operacion) {
        this.operacion = Operacion;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public double getTotalCredito() {
        return totalCredito;
    }

    public void setTotalCredito(double totalCredito) {
        this.totalCredito = totalCredito;
    }

    public double getTotalAbonado() {
        return totalAbonado;
    }

    public void setTotalAbonado(double totalAbonado) {
        this.totalAbonado = totalAbonado;
    }
    
    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    

    
    
    
}

