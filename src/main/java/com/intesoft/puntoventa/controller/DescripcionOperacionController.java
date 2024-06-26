/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.controller;

import com.intesoft.puntoventa.Services.DescripcionOperacionServices;
import com.intesoft.puntoventa.ServicesImplements.DescripcionOperacionServicesImplement;
import com.intesoft.puntoventa.entity.DescripcionOperacion;
import com.intesoft.puntoventa.entity.Operacion;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alejo
 */
public class DescripcionOperacionController {
    
    private DescripcionOperacionServices descripcionOperacionServices;

    public void saveDescripcionOperacion(DescripcionOperacion descripcionOperacion) {
        descripcionOperacionServices = new DescripcionOperacionServicesImplement();
        descripcionOperacionServices.saveDescripcionOperacion(descripcionOperacion);  
    }

    public List<DescripcionOperacion> getAllEgresos(Date starDate, Date endDate) {
        descripcionOperacionServices = new DescripcionOperacionServicesImplement();
        return descripcionOperacionServices.getAllEgresos(starDate, endDate);
    }

    public void deleteDescripcionOperacion(Operacion operacion) {
        descripcionOperacionServices = new DescripcionOperacionServicesImplement();
        descripcionOperacionServices.deleteDescripcionOperacion(operacion); 
    }

    public void updateDescripcionOperacion(DescripcionOperacion descripcionOperacion) {
        descripcionOperacionServices = new DescripcionOperacionServicesImplement();
        descripcionOperacionServices.updateDescripcionOperacion(descripcionOperacion);  
    }

    public DescripcionOperacion getDescripcionOperacionByOperacion(Operacion operacion) {
        descripcionOperacionServices = new DescripcionOperacionServicesImplement();
        return descripcionOperacionServices.getDescripcionOperacionByOperacion(operacion);
    }
    
    
    
}
