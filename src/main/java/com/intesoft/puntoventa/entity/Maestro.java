/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alejo
 */
@Entity
@Table(name = "maestro")
public class Maestro implements Serializable {
    @Id
    @Column(name = "codigo")
    private int codigo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "talla")
    private String talla;
    @Column(name = "color")
    private String color;

    public Maestro() {
    }

    public Maestro(int codigo, String descripcion, String talla, String color) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.talla = talla;
        this.color = color;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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
    
    
    
}
