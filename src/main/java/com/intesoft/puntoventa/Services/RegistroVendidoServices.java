/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.intesoft.puntoventa.Services;

import com.intesoft.puntoventa.dto.IngresosDto;
import com.intesoft.puntoventa.entity.RegistroVendido;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alejo
 */
public interface RegistroVendidoServices {

    public void saveProductosVenta(List<RegistroVendido> listRegistroVendidos);

    public List<IngresosDto> getIngresosByDateRange(Date startDate, Date endDate);
    
}
