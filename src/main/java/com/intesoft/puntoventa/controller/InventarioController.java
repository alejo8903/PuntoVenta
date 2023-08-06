/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.controller;

import com.intesoft.puntoventa.Services.InventarioServices;
import com.intesoft.puntoventa.ServicesImplements.InventarioServicesImplement;
import com.intesoft.puntoventa.dto.InventarioDto;
import com.intesoft.puntoventa.entity.Inventario;
import java.util.List;

/**
 *
 * @author alejo
 */
public class InventarioController {

    public List<InventarioDto> searchProducto(int codigo) {
        InventarioServices inventarioServices = new InventarioServicesImplement();
        return inventarioServices.searchProdcto(codigo);
    }

    public Inventario getProductoById(int id) {
        InventarioServices inventarioServices = new InventarioServicesImplement();
        return inventarioServices.getProductoById(id);
    }

    
    
}
