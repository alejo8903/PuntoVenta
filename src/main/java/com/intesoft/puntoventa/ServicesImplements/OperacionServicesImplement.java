/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.ServicesImplements;

import com.intesoft.puntoventa.dao.OperacionDao;
import com.intesoft.puntoventa.entity.Operacion;
import java.util.Date;
import com.intesoft.puntoventa.Services.OperacionServices;

/**
 *
 * @author alejo
 */
public class OperacionServicesImplement implements OperacionServices {

    @Override
    public int saveOperacion(Operacion operacion) {
        OperacionDao ventasDao = new OperacionDao();
        int idVenta = ventasDao.crearVenta(operacion);
        return idVenta;
    }

    @Override
    public Operacion getOperacionById(int numeroVenta) {
        OperacionDao ventasDao = new OperacionDao();
        return ventasDao.getById(numeroVenta);
    }
    
}
