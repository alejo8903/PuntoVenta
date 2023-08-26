/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.entity;

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
@Table(name = "credito")
public class Credito {
    @Id
    @Column(name = "id_credito")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCredito;
    @Column(name = "toatal_credito")
    private double totalCredito;
    @Column(name = "total_abonado")
    private double totalAbonado;
    @Column(name = "tipo_credito")
    private String tipoCredito;
    @Column(name = "pagado")
    private boolean pagado;
}

