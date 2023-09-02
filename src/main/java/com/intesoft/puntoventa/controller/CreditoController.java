/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.controller;

import com.intesoft.puntoventa.Services.CreditoServices;
import com.intesoft.puntoventa.ServicesImplements.CreditoServicesImplements;
import com.intesoft.puntoventa.entity.Credito;

/**
 *
 * @author alejo
 */
public class CreditoController {

    CreditoServices creditoServices = new CreditoServicesImplements();
    public int saveCredito(Credito credito) {
        return creditoServices.saveCredito(credito);
    }
    
}
