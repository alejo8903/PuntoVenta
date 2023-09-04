/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.ServicesImplements;

import com.intesoft.puntoventa.Services.ClientesServices;
import com.intesoft.puntoventa.dao.ClientesDao;
import com.intesoft.puntoventa.entity.Clientes;
import java.util.List;

/**
 *
 * @author alejo
 */
public class ClientesServicesImplement implements ClientesServices {
    private ClientesDao clientesDao;
    
    public ClientesServicesImplement() {
        this.clientesDao = new ClientesDao();
    }

    @Override
    public List<Clientes> getAllClientes() {
        return clientesDao.getAll();
    }

    @Override
    public void guardarCliente(Clientes cliente) {
        clientesDao.create(cliente);
    }

    @Override
    public void actualizarCliente(Clientes cliente) {
        clientesDao.merge(cliente);
    }
}
