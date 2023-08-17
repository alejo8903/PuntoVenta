/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.ServicesImplements;

import com.intesoft.puntoventa.Services.MaestroServices;
import com.intesoft.puntoventa.dao.MaestroDao;
import com.intesoft.puntoventa.entity.Maestro;
import java.util.List;

/**
 *
 * @author alejo
 */
public class MaestroServicesImplement implements MaestroServices {
    private MaestroDao maestroDao;

    @Override
    public List<Maestro> listarProductos() {
        maestroDao = new MaestroDao();
        return maestroDao.getAll();
    }

    @Override
    public Maestro getMaxCodigo() {
        maestroDao = new MaestroDao();
        return maestroDao.getMaxCodigo();
    }

    @Override
    public void crearProducto(Maestro maestro) {
        maestroDao = new MaestroDao();
        maestroDao.create(maestro);
    }

    @Override
    public void modificarProducto(Maestro maestro) {
        maestroDao = new MaestroDao();
        maestroDao.merge(maestro);
    }

    @Override
    public void deleteMaestro(String codigo) {
        maestroDao = new MaestroDao();
        maestroDao.delete(codigo);
    }

    @Override
    public Maestro getProducto(String codigo) {
        maestroDao = new MaestroDao();
        return maestroDao.findById(codigo);
    }
            
 
    
}
