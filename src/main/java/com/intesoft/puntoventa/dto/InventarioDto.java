/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dto;

/**
 *
 * @author alejo
 */
public class InventarioDto {
    int id;
    String codigo;
    String descripcion;
    String talla;
    String color;
    int cantidad;
    double valorCompra;
    float iva;
    double totalCompra;
    float porcentajeGanancia;
    double valorVenta;

    public InventarioDto() {
    }

    public InventarioDto(int id, String codigo, String descripcion, String talla, String color, int cantidad, double valorCompra, float iva, double totalCompra, float porcentajeGanancia, double valorVenta) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.talla = talla;
        this.color = color;
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
