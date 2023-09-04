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
    
    private InventarioDao inventarioDao;
    public InventarioServicesImplement(){
        this.inventarioDao = new InventarioDao();
    }
    @Override
    public List<InventarioDto> searchProdcto(int codigo) {
        List<InventarioDto> listInventarioDto = inventarioDao.searchByCodigo(codigo);
        return listInventarioDto;
        
    }

    @Override
    public Inventario getProductoById(int id) {
        return inventarioDao.productoById(id);
    }

    @Override
    public void updateInventario(int id, int cantidad) {
        Inventario inventario = new  Inventario();
        inventario = getProductoById(id);
        int actualQuantity = inventario.getCantidad();
        inventario.setCantidad(actualQuantity - cantidad);
        inventarioDao.update(inventario);
    }

    @Override
    public List<Inventario> getInventarioTotal() {
        return inventarioDao.getAll();
    }

    @Override
    public void insertInventario(Inventario inventario) {
        inventarioDao.create(inventario);
    }
    
}
