/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.intesoft.puntoventa.Services;

import com.intesoft.puntoventa.entity.Clientes;
import java.util.List;

/**
 *
 * @author alejo
 */
public interface ClientesServices {

    public List<Clientes> getAllClientes();

    public void guardarCliente(Clientes cliente);

    public void actualizarCliente(Clientes cliente);
    
}
