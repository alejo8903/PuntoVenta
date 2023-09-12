/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.controller;

import com.intesoft.puntoventa.ServicesImplements.OperacionServicesImplement;
import com.intesoft.puntoventa.entity.Operacion;
import com.intesoft.puntoventa.Services.OperacionServices;
import java.util.Date;
import java.util.List;


/**
 *
 * @author alejo
 */
public class OperacionController {

    

    public int saveOperacion(Operacion operacion) {
        OperacionServices operacionServices = new OperacionServicesImplement();
        int idVenta = operacionServices.saveOperacion(operacion);
        return idVenta;
                
    }

    public Operacion getOperacionById(int numeroOperacion) {
        OperacionServices operacionServices = new OperacionServicesImplement();
        return operacionServices.getOperacionById(numeroOperacion);
    }

    public List<Operacion> getAllEgresos(Date fechaInicio, Date fechaFin) {
        OperacionServices operacionServices = new OperacionServicesImplement();
        return operacionServices.getAllEgresos(fechaInicio, fechaFin);
    }

    public double getTotalCajaVentas() {
        OperacionServices operacionServices = new OperacionServicesImplement();
        return operacionServices.getTotalCajaVentas();
    }
    
}
