/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.intesoft.puntoventa.Services;

import com.intesoft.puntoventa.dto.CreditoDto;
import com.intesoft.puntoventa.entity.Credito;
import java.util.List;

/**
 *
 * @author alejo
 */
public interface CreditoServices {

    public int saveCredito(Credito credito);

    public List<CreditoDto> getListaCreditos(String tipoCredito);

    public Credito getCreditById(int id);

    public void updateCredit(Credito credito);
    
}
