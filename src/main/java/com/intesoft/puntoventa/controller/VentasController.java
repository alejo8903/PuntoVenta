/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.controller;

import com.intesoft.puntoventa.Services.VentasServices;
import com.intesoft.puntoventa.ServicesImplements.VentasServicesImplement;
import com.intesoft.puntoventa.entity.Operacion;


/**
 *
 * @author alejo
 */
public class VentasController {

    public int saveVentas(double venta, String nombre, String operacion) {
        VentasServices ventasServices = new VentasServicesImplement();
        int idVenta = ventasServices.saveVentas(venta, nombre, operacion);
        return idVenta;
                
    }

    public Operacion getVentaById(int numeroVenta) {
        VentasServices ventasServices = new VentasServicesImplement();
        return ventasServices.getVentaById(numeroVenta);
    }
    
}
