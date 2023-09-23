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
    private RegistroVendido registroVendido;
    
    
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

    @Override
    public List<IngresosDto> getIngresosByIdOperation(int idOperatcion) {
        listIngresosDto = registroVendidoDao.getIngresosByIdOperation(idOperatcion);
        return listIngresosDto;
    }

    @Override
    public RegistroVendido getRegistroVendidoByIdOperation(int idRegistroVendido) {
        registroVendido = registroVendidoDao.getRegistroVendidoByIdOperation(idRegistroVendido);
        return registroVendido;
    }

    @Override
    public void removeRegistroVendido(RegistroVendido registroVendido) {
        registroVendidoDao.remove(registroVendido);
    }

    
    
}
