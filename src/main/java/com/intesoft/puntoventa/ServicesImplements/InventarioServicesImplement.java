/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.ServicesImplements;

import com.intesoft.puntoventa.Services.InventarioServices;
import com.intesoft.puntoventa.dao.InventarioDao;
import com.intesoft.puntoventa.dto.InventarioDto;
import com.intesoft.puntoventa.entity.Inventario;
import com.intesoft.puntoventa.entity.Maestro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejo
 */
public class InventarioServicesImplement implements InventarioServices {

    @Override
    public List<InventarioDto> searchProdcto(int codigo) {
        InventarioDao inventarioDao = new InventarioDao();
        List<InventarioDto> listInventarioDto = inventarioDao.searchByCodigo(codigo);
        return listInventarioDto;
        
    }

    @Override
    public Inventario getProductoById(int id) {
        InventarioDao inventarioDao = new InventarioDao();
        return inventarioDao.productoById(id);
    }

    @Override
    public void updateInventario(int id, int cantidad) {
        Inventario inventario = new  Inventario();
        inventario = getProductoById(id);
        int actualQuantity = inventario.getCantidad();
        inventario.setCantidad(actualQuantity - cantidad);
        InventarioDao inventarioDao = new InventarioDao();
        inventarioDao.update(inventario);
    }
    
}
