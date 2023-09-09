/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dto;

import java.util.Date;

/**
 *
 * @author alejo
 */
public class IngresosDto {
    private int id;
    private int idOperacion;
    private String codigo;
    private String descripcion;
    private String talla;
    private String color;
    private String tipoOperacion;
    private Date fecha;
    private String usuario;
    private int cantidad;
    private double valorCompra;
    private double valorVenta;

    public IngresosDto() {
    }

    public IngresosDto(int id, int idOperacion, String codigo, String descripcion, String talla, String color, String tipoOperacion, Date fecha, String usuario, int cantidad, double valorCompra, double valorVenta) {
        this.id = id;
        this.idOperacion = idOperacion;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.talla = talla;
        this.color = color;
        this.tipoOperacion = tipoOperacion;
        this.fecha = fecha;
        this.usuario = usuario;
        this.cantidad = cantidad;
        this.valorCompra = valorCompra;
        this.valorVenta = valorVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(int idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String Codigo) {
        this.codigo = Codigo;
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

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

}
