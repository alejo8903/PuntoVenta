/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.ServicesImplements;

import com.intesoft.puntoventa.Services.DescripcionOperacionServices;
import com.intesoft.puntoventa.dao.DescripcionOperacionDao;
import com.intesoft.puntoventa.entity.DescripcionOperacion;
import com.intesoft.puntoventa.entity.Operacion;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alejo
 */
public class DescripcionOperacionServicesImplement implements DescripcionOperacionServices {
    
    public DescripcionOperacionDao descripcionOperacionDao;
    

    public DescripcionOperacionServicesImplement() {
        this.descripcionOperacionDao = new DescripcionOperacionDao("myPersistenceUnit");
    }
    
    @Override
    public void saveDescripcionOperacion(DescripcionOperacion descripcionOperacion) {
        descripcionOperacionDao.create(descripcionOperacion);
    }

    @Override
    public List<DescripcionOperacion> getAllEgresos(Date fechaInicio, Date fechaFin) {
        return descripcionOperacionDao.getAllEgresos(fechaInicio, fechaFin);
    }

    @Override
    public void deleteDescripcionOperacion(Operacion operacion) {
        descripcionOperacionDao.delete(operacion);
    }

    @Override
    public void updateDescripcionOperacion(DescripcionOperacion descripcionOperacion) {
        descripcionOperacionDao.update(descripcionOperacion);
    }

    @Override
    public DescripcionOperacion getDescripcionOperacionByOperacion(Operacion operacion) {
        return descripcionOperacionDao.getDescripcionOperacionByOperacion(operacion);
    }
    
}
