/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.intesoft.puntoventa.Services;

import com.intesoft.puntoventa.entity.Venta;

/**
 *
 * @author alejo
 */
public interface VentasServices {

    public int saveVentas(double venta);

    public Venta getVentaById(int numeroVenta);
    
}
