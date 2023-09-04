/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.intesoft.puntoventa.servicesImplements;

import com.intesoft.puntoventa.ServicesImplements.MaestroServicesImplement;
import com.intesoft.puntoventa.dao.MaestroDao;
import com.intesoft.puntoventa.entity.Maestro;
import java.util.ArrayList;
import java.util.List;
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
public class MaestroServicesImplementTest {
    
    @InjectMocks
    private MaestroServicesImplement maestroServices;

    @Mock
    private MaestroDao maestroDao;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testListarProductos() {
        // Definir el comportamiento del mock del DAO
        List<Maestro> mockProductos = new ArrayList<>(); // Puedes crear una lista de productos de ejemplo
        when(maestroDao.getAll()).thenReturn(mockProductos);

        // Llamar al método que deseas probar
        List<Maestro> result = maestroServices.listarProductos();

        // Verificar que el método del DAO se haya llamado una vez
        verify(maestroDao, times(1)).getAll();

        // Puedes agregar más aserciones según sea necesario para verificar el resultado
        // Ejemplo: assertEquals(mockProductos.size(), result.size());
    }

    @Test
    public void testGetMaxCodigo() {
        // Crear un objeto Maestro de ejemplo
        Maestro mockMaxCodigo = new Maestro();

        // Definir el comportamiento del mock del DAO
        when(maestroDao.getMaxCodigo()).thenReturn(mockMaxCodigo);

        // Llamar al método que deseas probar
        Maestro result = maestroServices.getMaxCodigo();

        // Verificar que el método del DAO se haya llamado una vez
        verify(maestroDao, times(1)).getMaxCodigo();

        // Puedes agregar más aserciones según sea necesario para verificar el resultado
        // Ejemplo: assertEquals(mockMaxCodigo, result);
    }

    @Test
    public void testCrearProducto() {
        // Crear un objeto Maestro de ejemplo
        Maestro maestro = new Maestro();

        // Llamar al método que deseas probar
        maestroServices.crearProducto(maestro);

        // Verificar que el método del DAO se haya llamado una vez
        verify(maestroDao, times(1)).create(maestro);
    }

    @Test
    public void testModificarProducto() {
        // Crear un objeto Maestro de ejemplo
        Maestro maestro = new Maestro();

        // Llamar al método que deseas probar
        maestroServices.modificarProducto(maestro);

        // Verificar que el método del DAO se haya llamado una vez
        verify(maestroDao, times(1)).merge(maestro);
    }

    @Test
    public void testDeleteMaestro() {
        // Definir un código de ejemplo
        String codigo = "12345";

        // Llamar al método que deseas probar
        maestroServices.deleteMaestro(codigo);

        // Verificar que el método del DAO se haya llamado una vez con el código de ejemplo
        verify(maestroDao, times(1)).delete(codigo);
    }

    @Test
    public void testGetProducto() {
        // Definir un código de ejemplo
        String codigo = "12345";
        
        // Crear un objeto Maestro de ejemplo
        Maestro mockProducto = new Maestro();

        // Definir el comportamiento del mock del DAO
        when(maestroDao.findById(codigo)).thenReturn(mockProducto);

        // Llamar al método que deseas probar
        Maestro result = maestroServices.getProducto(codigo);

        // Verificar que el método del DAO se haya llamado una vez con el código de ejemplo
        verify(maestroDao, times(1)).findById(codigo);

        // Puedes agregar más aserciones según sea necesario para verificar el resultado
        // Ejemplo: assertEquals(mockProducto, result);
    }
    
}
