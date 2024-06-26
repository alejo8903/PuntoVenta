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
    private OperacionDao operacionDao;
    public OperacionServicesImplement(){
        operacionDao = new OperacionDao("myPersistenceUnit");
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
    public List<Operacion> getAllEgresos(Date fechaInicio, Date fechaFin) {
        List<Operacion> listOperacion = operacionDao.getAllEgresos(fechaInicio, fechaFin);
        return listOperacion;
        
    }

    @Override
    public double getTotalCajaVentas() {
        return operacionDao.getTotalCajaVenta();
    }

    @Override
    public void removeOperacion(Operacion operacion) {
        operacionDao.remove(operacion);
    }

    @Override
    public void updateOperacion(Operacion operacion) {
        operacionDao.update(operacion);
    }
    
}
