/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.controller;

import com.intesoft.puntoventa.Services.ClientesServices;
import com.intesoft.puntoventa.ServicesImplements.ClientesServicesImplement;
import com.intesoft.puntoventa.entity.Clientes;
import java.util.List;

/**
 *
 * @author alejo
 */

public class ClientesController {
    private ClientesServices clientesServices;
    
    public  void guardarCliente(Clientes cliente) {
         clientesServices = new ClientesServicesImplement();
         clientesServices.guardarCliente(cliente);
         
    }
    
    public List<Clientes> getAllClientes() {
        clientesServices = new ClientesServicesImplement();
        return clientesServices.getAllClientes();
    }

    public void actualizarCliente(Clientes cliente) {
        clientesServices = new ClientesServicesImplement();
         clientesServices.actualizarCliente(cliente);
    }
    
}
