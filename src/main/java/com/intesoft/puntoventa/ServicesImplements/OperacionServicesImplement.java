/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.ServicesImplements;

import com.intesoft.puntoventa.dao.OperacionDao;
import com.intesoft.puntoventa.entity.Operacion;
import java.util.Date;
import com.intesoft.puntoventa.Services.OperacionServices;
import java.util.List;

/**
 *
 * @author alejo
 */
public class OperacionServicesImplement implements OperacionServices {
    OperacionDao operacionDao;
    public OperacionServicesImplement(){
        operacionDao = new OperacionDao();
    }
    
    @Override
    public int saveOperacion(Operacion operacion) {
        int idVenta = operacionDao.crearVenta(operacion);
        return idVenta;
    }

    @Override
    public Operacion getOperacionById(int numeroVenta) {
        return operacionDao.getById(numeroVenta);
    }

    @Override
    public List<Operacion> getAllEgresos() {
        return operacionDao.getAllEgresos();
    }
    
}
