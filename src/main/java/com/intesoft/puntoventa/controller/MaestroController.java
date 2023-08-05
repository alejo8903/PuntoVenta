/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.controller;

import com.intesoft.puntoventa.Services.MaestroServices;
import com.intesoft.puntoventa.ServicesImplements.MaestroServicesImplement;
import com.intesoft.puntoventa.entity.Maestro;
import java.util.List;

/**
 *
 * @author alejo
 */
public class MaestroController {

    public List<Maestro> getAllProductos() {
        MaestroServices maestroServices = new MaestroServicesImplement();
        return maestroServices.listarProductos();
    }
    
}
