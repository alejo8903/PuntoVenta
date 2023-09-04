/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.ServicesImplements;

import com.intesoft.puntoventa.Services.RegistroVendidoServices;
import com.intesoft.puntoventa.dao.RegistroVendidoDao;
import com.intesoft.puntoventa.entity.RegistroVendido;
import java.util.List;

/**
 *
 * @author alejo
 */
public class RegistroVendidoServicesImplement implements RegistroVendidoServices {

    RegistroVendidoDao registroVendidoDao;
    
    public  RegistroVendidoServicesImplement(){
        registroVendidoDao = new RegistroVendidoDao();
    }
    @Override
    public void saveProductosVenta(List<RegistroVendido> listRegistroVendidos) {
        registroVendidoDao.batchCreateRgistrosVenta(listRegistroVendidos);
    }
    
}
