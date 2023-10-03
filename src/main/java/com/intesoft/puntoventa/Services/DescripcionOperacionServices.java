/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.intesoft.puntoventa.Services;

import com.intesoft.puntoventa.entity.DescripcionOperacion;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alejo
 */
public interface DescripcionOperacionServices {
    
    public void saveDescripcionOperacion(DescripcionOperacion descripcionOperacion);
    
    public List<DescripcionOperacion> getAllEgresos(Date fechaInicio, Date fechaFin);
    
}
