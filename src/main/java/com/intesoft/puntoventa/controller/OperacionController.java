/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.controller;

import com.intesoft.puntoventa.ServicesImplements.OperacionServicesImplement;
import com.intesoft.puntoventa.entity.Operacion;
import com.intesoft.puntoventa.Services.OperacionServices;


/**
 *
 * @author alejo
 */
public class OperacionController {

    public int saveOperacion(Operacion operacion) {
        OperacionServices ventasServices = new OperacionServicesImplement();
        int idVenta = ventasServices.saveOperacion(operacion);
        return idVenta;
                
    }

    public Operacion getOperacionById(int numeroOperacion) {
        OperacionServices ventasServices = new OperacionServicesImplement();
        return ventasServices.getOperacionById(numeroOperacion);
    }
    
}
