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
    
    public MaestroServicesImplement(){
        maestroDao = new MaestroDao();
    }
    @Override
    public List<Maestro> listarProductos() {
        return maestroDao.getAll();
    }

    @Override
    public Maestro getMaxCodigo() {
        return maestroDao.getMaxCodigo();
    }

    @Override
    public void crearProducto(Maestro maestro) {
        maestroDao.create(maestro);
    }

    @Override
    public void modificarProducto(Maestro maestro) {
        maestroDao.merge(maestro);
    }

    @Override
    public void deleteMaestro(String codigo) {
        maestroDao.delete(codigo);
    }

    @Override
    public Maestro getProducto(String codigo) {
        return maestroDao.findById(codigo);
    }
            
 
    
}
