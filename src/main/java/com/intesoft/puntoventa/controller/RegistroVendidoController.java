/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.controller;

import com.intesoft.puntoventa.Services.RegistroVendidoServices;
import com.intesoft.puntoventa.ServicesImplements.RegistroVendidoServicesImplement;
import com.intesoft.puntoventa.entity.RegistroVendido;
import java.util.List;

/**
 *
 * @author alejo
 */
public class RegistroVendidoController {

    RegistroVendidoServices registroVendidoServices;
    
    public void saveProductosVenta(List<RegistroVendido> listRegistroVendidos) {
        registroVendidoServices = new RegistroVendidoServicesImplement();
        registroVendidoServices.saveProductosVenta(listRegistroVendidos);
    }
    
}
