/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.controller;

import com.intesoft.puntoventa.Services.VentasServices;
import com.intesoft.puntoventa.ServicesImplements.VentasServicesImplement;
import com.intesoft.puntoventa.entity.Venta;


/**
 *
 * @author alejo
 */
public class VentasController {

    public int saveVentas(double venta) {
        VentasServices ventasServices = new VentasServicesImplement();
        int idVenta = ventasServices.saveVentas(venta);
        return idVenta;
                
    }

    public Venta getVentaById(int numeroVenta) {
        VentasServices ventasServices = new VentasServicesImplement();
        return ventasServices.getVentaById(numeroVenta);
    }
    
}
