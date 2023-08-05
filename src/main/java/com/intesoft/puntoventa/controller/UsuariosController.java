/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.controller;

import com.intesoft.puntoventa.Services.UsuariosServices;
import com.intesoft.puntoventa.ServicesImplements.UsuariosServicesImplement;
import com.intesoft.puntoventa.entity.Usuarios;

/**
 *
 * @author alejo
 */
public class UsuariosController {

    private UsuariosServices usuariosServices;
    
     public UsuariosController() {
       usuariosServices = new UsuariosServicesImplement();
   }
    public Usuarios login(String usuario){
       Usuarios usuarios = usuariosServices.getUserByUsuario(usuario);
      
       return  usuarios;
   }
    
}
