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
@Table(name = "resumen_financiero")
public class ResumenFinanciero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id; 
    
    @Column(name = "totalAbonosNoPagado")
    private Double totalAbonosNoPagado;

    @Column(name = "totalCreditosPagados")
    private Double totalCreditosPagados;

    @Column(name = "totalCajaVenta")
    private Double totalCajaVenta;

    public ResumenFinanciero() {
    }

    public ResumenFinanciero(Long id, Double totalAbonosNoPagado, Double totalCreditosPagados, Double totalCajaVenta) {
        this.totalAbonosNoPagado = totalAbonosNoPagado;
        this.totalCreditosPagados = totalCreditosPagados;
        this.totalCajaVenta = totalCajaVenta;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    

    public Double getTotalAbonosNoPagado() {
        return totalAbonosNoPagado;
    }

    public void setTotalAbonosNoPagado(Double totalAbonosNoPagado) {
        this.totalAbonosNoPagado = totalAbonosNoPagado;
    }

    public Double getTotalCreditosPagados() {
        return totalCreditosPagados;
    }

    public void setTotalCreditosPagados(Double totalCreditosPagados) {
        this.totalCreditosPagados = totalCreditosPagados;
    }

    public Double getTotalCajaVenta() {
        return totalCajaVenta;
    }

    public void setTotalCajaVenta(Double totalCajaVenta) {
        this.totalCajaVenta = totalCajaVenta;
    }
    
    
}
