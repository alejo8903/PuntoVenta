/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.controller;

import com.intesoft.puntoventa.Services.RegistroVendidoServices;
import com.intesoft.puntoventa.ServicesImplements.RegistroVendidoServicesImplement;
import com.intesoft.puntoventa.dto.IngresosDto;
import com.intesoft.puntoventa.entity.RegistroVendido;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alejo
 */
public class RegistroVendidoController {

    private RegistroVendidoServices registroVendidoServices;
    private List<IngresosDto> listIngresosDto;
    private RegistroVendido registroVendido;
    
    public void saveProductosVenta(List<RegistroVendido> listRegistroVendidos) {
        registroVendidoServices = new RegistroVendidoServicesImplement();
        registroVendidoServices.saveProductosVenta(listRegistroVendidos);
    }

    public List<IngresosDto> getIngresosByDateRange(Date  startDate, Date  endDate) {
        registroVendidoServices = new RegistroVendidoServicesImplement();
        listIngresosDto = registroVendidoServices.getIngresosByDateRange(startDate, endDate);
        return listIngresosDto;
    }

    public List<IngresosDto> getIngresosByIdOperation(int idOperacion) {
        registroVendidoServices = new RegistroVendidoServicesImplement();
        listIngresosDto = registroVendidoServices.getIngresosByIdOperation(idOperacion);
        return listIngresosDto;
    }

    public RegistroVendido getRegistroVendidoByIdOperation(int idRegistroVendido) {
        registroVendidoServices = new RegistroVendidoServicesImplement();
        registroVendido = registroVendidoServices.getRegistroVendidoByIdOperation(idRegistroVendido);
        return registroVendido;
    }

    public void removeRegistroVendido(RegistroVendido registroVendido) {
        registroVendidoServices = new RegistroVendidoServicesImplement();
        registroVendidoServices.removeRegistroVendido(registroVendido);
        
    }

    
    
}
