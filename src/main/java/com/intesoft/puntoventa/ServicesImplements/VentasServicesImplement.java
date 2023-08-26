/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.ServicesImplements;

import com.intesoft.puntoventa.Services.VentasServices;
import com.intesoft.puntoventa.dao.VentasDao;
import com.intesoft.puntoventa.entity.Operacion;
import java.util.Date;

/**
 *
 * @author alejo
 */
public class VentasServicesImplement implements VentasServices {

    @Override
    public int saveVentas(double venta, String nombre, String operacion) {
        Operacion ventas = new Operacion();
        ventas.setFecha(new Date());
        ventas.setValor(venta);
        ventas.setUsuario(nombre);
        ventas.setOperacion(operacion);
        VentasDao ventasDao = new VentasDao();
        int idVenta = ventasDao.crearVenta(ventas);
        return idVenta;
    }

    @Override
    public Operacion getVentaById(int numeroVenta) {
        VentasDao ventasDao = new VentasDao();
        return ventasDao.getById(numeroVenta);
    }
    
}
