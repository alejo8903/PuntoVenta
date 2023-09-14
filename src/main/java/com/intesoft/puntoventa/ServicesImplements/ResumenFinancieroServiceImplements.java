/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.ServicesImplements;

import com.intesoft.puntoventa.Services.ResumenFinancieroServices;
import com.intesoft.puntoventa.dao.ResumenFinancieroDao;
import com.intesoft.puntoventa.entity.ResumenFinanciero;

/**
 *
 * @author alejo
 */
public class ResumenFinancieroServiceImplements implements ResumenFinancieroServices{

    
    private ResumenFinancieroDao resumenFinancieroDao;
    
    @Override
    public ResumenFinanciero getTotalCaja() {
        resumenFinancieroDao = new ResumenFinancieroDao("myPersistenceUnit");
        resumenFinancieroDao.actualizarVistaResumen();
        return resumenFinancieroDao.getResumenFinaciero();
                
    }
    
}
