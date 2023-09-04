/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.ServicesImplements;

import com.intesoft.puntoventa.Services.UsuariosServices;
import com.intesoft.puntoventa.dao.UsuariosDao;
import com.intesoft.puntoventa.entity.Usuarios;

/**
 *
 * @author alejo
 */
public class UsuariosServicesImplement  implements UsuariosServices{
    
    private UsuariosDao usuariosDao;
    public UsuariosServicesImplement(){
        usuariosDao = new UsuariosDao();
    }
    @Override
    public Usuarios getUserByUsuario(String Usuario) {
        Usuarios usuarios = usuariosDao.getByUser(Usuario);
     
     return usuarios;
    }
    
}
