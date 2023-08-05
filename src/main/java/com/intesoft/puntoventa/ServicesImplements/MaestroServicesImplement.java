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
            
 
    
}
