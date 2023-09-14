/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.controller;

import com.intesoft.puntoventa.Services.ResumenFinancieroServices;
import com.intesoft.puntoventa.ServicesImplements.ResumenFinancieroServiceImplements;
import com.intesoft.puntoventa.entity.ResumenFinanciero;

/**
 *
 * @author alejo
 */
public class ResumenFinancieroController {

    private ResumenFinancieroServices resumenFinancieroSevices;
    public ResumenFinanciero getTotalCaja() {
        resumenFinancieroSevices = new ResumenFinancieroServiceImplements();
        return resumenFinancieroSevices.getTotalCaja();
    }
    
}
