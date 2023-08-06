/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.intesoft.puntoventa.Services;

import com.intesoft.puntoventa.dto.InventarioDto;
import com.intesoft.puntoventa.entity.Inventario;
import java.util.List;

/**
 *
 * @author alejo
 */
public interface InventarioServices {

    public List<InventarioDto> searchProdcto(int codigo);

    public Inventario getProductoById(int codigo);
    
}
