/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.intesoft.puntoventa.Services;

import com.intesoft.puntoventa.entity.Operacion;

/**
 *
 * @author alejo
 */
public interface OperacionServices {

    public int saveOperacion(Operacion operacion);

    public Operacion getOperacionById(int numeroVenta);
    
}
