/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.ServicesImplements;

import com.intesoft.puntoventa.Services.CreditoServices;
import com.intesoft.puntoventa.dao.CreditoDao;
import com.intesoft.puntoventa.entity.Credito;

/**
 *
 * @author alejo
 */
public class CreditoServicesImplements implements CreditoServices{

    public CreditoDao creditoDao;
    
     public CreditoServicesImplements (){
        this.creditoDao = new CreditoDao();
    }
    @Override
    public int saveCredito(Credito credito) {
        
        return creditoDao.create(credito);
    }
    
}
