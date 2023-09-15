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
        creditoDao.close();
        return idCredito;
    }

    @Override
    public List<CreditoDto> getListaCreditos(String tipoCredito) {
        List<CreditoDto> listCreditoDto = creditoDao.getListaCreditos(tipoCredito);
        creditoDao.close();
        return listCreditoDto;
    }

    @Override
    public Credito getCreditById(int id) {
        this.credito = creditoDao.findById(id);
        creditoDao.close();
        return this.credito;
    }

    @Override
    public void updateCredit(Credito credito) {
        creditoDao.merge(credito);
        creditoDao.close();
    }

    @Override
    public double getTotalCajaCredito() {
        double totalCajaCredito =creditoDao.getTotalAbonosNoPagado() + creditoDao.getTotalCreditosPagados();
        creditoDao.close();
        return totalCajaCredito;
    }

}
