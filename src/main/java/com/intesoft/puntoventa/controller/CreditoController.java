/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.controller;

import com.intesoft.puntoventa.Services.CreditoServices;
import com.intesoft.puntoventa.ServicesImplements.CreditoServicesImplements;
import com.intesoft.puntoventa.dto.CreditoDto;
import com.intesoft.puntoventa.entity.Credito;
import com.intesoft.puntoventa.entity.Operacion;
import java.util.List;

/**
 *
 * @author alejo
 */
public class CreditoController {

    CreditoServices creditoServices = new CreditoServicesImplements();
    public int saveCredito(Credito credito) {
        return creditoServices.saveCredito(credito);
    }

    public List<CreditoDto> getListaCreditos(String tipoCredito) {
        return creditoServices.getListaCreditos(tipoCredito);
    }

    public Credito getCreditById(int id) {
        return creditoServices.getCreditById(id);
    }

    public void updateCredito(Credito credito) {
        creditoServices.updateCredit(credito);
    }

    public double getTotalCajaCredito() {
        return creditoServices.getTotalCajaCredito();
    }

    public Credito getCreditByOperation(int idOperacion) {
        return creditoServices.getCreditByOperation(idOperacion);
    }

    public void removeCredito(Credito credito) {
        creditoServices.removeCredito(credito);
    }
    
}
