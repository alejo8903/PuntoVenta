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
@Table(name = "registrovendido")
public class RegistroVendido {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idoperacion")
    private Operacion operacion;
    @Column(name = "codigo")
    String codigo;
    @Column(name = "descripcion")
    String descripcion;
    @Column(name = "talla")
    String talla;
    @Column(name = "color")
    String color;
    @Column(name = "cantidad")
    int cantidad;
    @Column(name = "valorCompra")
    double valorCompra;
    @Column(name = "iva")
    float iva;
    @Column(name = "totalcompra")
    double totalCompra;
    @Column(name = "porcentajegananciae")
    float porcentajeGananciaE;
    @Column(name = "porcentajegananciar")
    float porcentajeGananciaR;
    @Column(name = "descuento")
    double descuento;
    @Column(name = "valorventa")
    double valorVenta;

    public RegistroVendido() {
    }

    public RegistroVendido(int id, Operacion operacion, String codigo, String descripcion, String talla, String color, int cantidad, double valorCompra, float iva, double totalCompra, float porcentajeGananciaE, float porcentajeGananciaR, double descuento, double valorVenta) {
        this.id = id;
        this.operacion = operacion;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.talla = talla;
        this.color = color;
        this.cantidad = cantidad;
        this.valorCompra = valorCompra;
        this.iva = iva;
        this.totalCompra = totalCompra;
        this.porcentajeGananciaE = porcentajeGananciaE;
        this.porcentajeGananciaR = porcentajeGananciaR;
        this.descuento = descuento;
        this.valorVenta = valorVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Operacion getVenta() {
        return operacion;
    }

    public void setVenta(Operacion ventas) {
        this.operacion = ventas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public float getPorcentajeGananciaE() {
        return porcentajeGananciaE;
    }

    public void setPorcentajeGananciaE(float porcentajeGananciaE) {
        this.porcentajeGananciaE = porcentajeGananciaE;
    }

    public float getPorcentajeGananciaR() {
        return porcentajeGananciaR;
    }

    public void setPorcentajeGananciaR(float porcentajeGananciaR) {
        this.porcentajeGananciaR = porcentajeGananciaR;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    
}
