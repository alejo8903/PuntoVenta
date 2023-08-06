/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.entity;

import java.io.Serializable;
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
@Table(name = "inventario")
public class Inventario implements Serializable {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo")
    private Maestro codigo;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "valorcompra")
    private double valorCompra;
    @Column(name = "iva")
    private float iva;
    @Column(name = "totalcompra")
    private double totalCompra;
    @Column(name = "porcentajeganancia")
    private float porcentajeGanancia;
    @Column(name = "valorventa")
    private double valorVenta;

    public Inventario() {
    }

    public Inventario(Maestro codigo, int cantidad, double valorCompra, float iva, double totalCompra, float porcentajeGanancia, double valorVenta) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.valorCompra = valorCompra;
        this.iva = iva;
        this.totalCompra = totalCompra;
        this.porcentajeGanancia = porcentajeGanancia;
        this.valorVenta = valorVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Maestro getCodigo() {
        return codigo;
    }

    public void setCodigo(Maestro maestro) {
        this.codigo = maestro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public float getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    public void setPorcentajeGanancia(float porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }
    
    
}
