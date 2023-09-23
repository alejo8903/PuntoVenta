/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.ServicesImplements;

import com.intesoft.puntoventa.Services.CreditoServices;
import com.intesoft.puntoventa.dao.CreditoDao;
import com.intesoft.puntoventa.dto.CreditoDto;
import com.intesoft.puntoventa.entity.Credito;
import java.util.List;

/**
 *
 * @author alejo
 */
public class CreditoServicesImplements implements CreditoServices {

    public CreditoDao creditoDao;
    public Credito credito;

    public CreditoServicesImplements() {
        this.creditoDao = new CreditoDao("myPersistenceUnit");
    }

    @Override
    public int saveCredito(Credito credito) {
        int idCredito = creditoDao.create(credito);
        return idCredito;
    }

    @Override
    public List<CreditoDto> getListaCreditos(String tipoCredito) {
        List<CreditoDto> listCreditoDto = creditoDao.getListaCreditos(tipoCredito);
        return listCreditoDto;
    }

    @Override
    public Credito getCreditById(int id) {
        creditoDao = new CreditoDao("myPersistenceUnit");
        this.credito = creditoDao.findById(id);
        return this.credito;
    }

    @Override
    public void updateCredit(Credito credito) {
        creditoDao.merge(credito);
    }

    @Override
    public double getTotalCajaCredito() {
        double totalCajaCredito =creditoDao.getTotalAbonosNoPagado() + creditoDao.getTotalCreditosPagados();
        return totalCajaCredito;
    }

    @Override
    public Credito getCreditByOperation(int idOperacion) {
        Credito credito = creditoDao.getCreditByOperation(idOperacion);
        return credito;
    }

    @Override
    public void removeCredito(Credito credito) {
        creditoDao.remove(credito);
    }

}
