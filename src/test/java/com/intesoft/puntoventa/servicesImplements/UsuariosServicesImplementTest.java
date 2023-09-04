/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.intesoft.puntoventa.servicesImplements;

import com.intesoft.puntoventa.ServicesImplements.UsuariosServicesImplement;
import com.intesoft.puntoventa.dao.UsuariosDao;
import com.intesoft.puntoventa.entity.Usuarios;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author alejo
 */
public class UsuariosServicesImplementTest {
    
    @InjectMocks
    private UsuariosServicesImplement usuariosServices;

    @Mock
    private UsuariosDao usuariosDao;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetUserByUsuario() {
        // Definir el nombre de usuario de ejemplo
        String usuario = "nombredeusuario";

        // Crear un objeto Usuarios de ejemplo
        Usuarios usuarioEjemplo = new Usuarios();
        usuarioEjemplo.setUsuario(usuario);

        // Definir el comportamiento del mock del DAO
        when(usuariosDao.getByUser(usuario)).thenReturn(usuarioEjemplo);

        // Llamar al método que deseas probar
        Usuarios result = usuariosServices.getUserByUsuario(usuario);

        // Verificar que el método del DAO se haya llamado una vez
        verify(usuariosDao, times(1)).getByUser(usuario);

        // Puedes agregar más aserciones según sea necesario para verificar el resultado
        // Ejemplo: assertEquals(usuarioEjemplo, result);
    }
    
}
