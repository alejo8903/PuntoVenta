/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.intesoft.puntoventa.servicesImplements;

import com.intesoft.puntoventa.ServicesImplements.RegistroVendidoServicesImplement;
import com.intesoft.puntoventa.dao.OperacionDao;
import com.intesoft.puntoventa.dao.RegistroVendidoDao;
import com.intesoft.puntoventa.entity.Operacion;
import com.intesoft.puntoventa.entity.RegistroVendido;
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
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author alejo
 */
public class RegistroVendidoServicesImplementTest {
    
    @InjectMocks
    private RegistroVendidoServicesImplement registroVendidoServices;

    @Mock
    private RegistroVendidoDao registroVendidoDao;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveProductosVenta() {
        // Crear una lista de registros vendidos de ejemplo
        List<RegistroVendido> listRegistroVendidos = new ArrayList<>();

        // Definir el comportamiento del mock del DAO
        doNothing().when(registroVendidoDao).batchCreateRgistrosVenta(listRegistroVendidos);

        // Llamar al método que deseas probar
        registroVendidoServices.saveProductosVenta(listRegistroVendidos);

        // Verificar que el método del DAO se haya llamado una vez
        verify(registroVendidoDao, times(1)).batchCreateRgistrosVenta(listRegistroVendidos);

        // Puedes agregar más aserciones según sea necesario para verificar el resultado
    }
    
}
