/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dto;

/**
 *
 * @author alejo
 */
public class CreditoDto {
    private int id;
    private String nombre;
    private String apellido;
    private double totalCredito;
    private double totalAbonos;

    public CreditoDto() {
    }

    public CreditoDto(int id, String nombre, String apellido, double totalCredito, double totalAbonos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.totalCredito = totalCredito;
        this.totalAbonos = totalAbonos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public double getTotalCredito() {
        return totalCredito;
    }

    public void setTotalCredito(double totalCredito) {
        this.totalCredito = totalCredito;
    }

    public double getTotalAbonos() {
        return totalAbonos;
    }

    public void setTotalAbonos(double totalAbonos) {
        this.totalAbonos = totalAbonos;
    }
    
    
}
