/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.ServicesImplements;

import com.intesoft.puntoventa.Services.RegistroVendidoServices;
import com.intesoft.puntoventa.dao.RegistroVendidoDao;
import com.intesoft.puntoventa.dto.IngresosDto;
import com.intesoft.puntoventa.entity.RegistroVendido;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alejo
 */
public class RegistroVendidoServicesImplement implements RegistroVendidoServices {

    private RegistroVendidoDao registroVendidoDao;
    private List<IngresosDto> listIngresosDto;
    
    
    public  RegistroVendidoServicesImplement(){
        registroVendidoDao = new RegistroVendidoDao("myPersistenceUnit");
    }
    @Override
    public void saveProductosVenta(List<RegistroVendido> listRegistroVendidos) {
        registroVendidoDao.batchCreateRgistrosVenta(listRegistroVendidos);
    }

    @Override
    public List<IngresosDto> getIngresosByDateRange(Date startDate, Date endDate) {
        listIngresosDto = registroVendidoDao.getIngresosEntreFechas(startDate, endDate);
        return listIngresosDto;
    }
    
}
