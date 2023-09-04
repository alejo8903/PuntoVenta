/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.intesoft.puntoventa.servicesImplements;

import com.intesoft.puntoventa.ServicesImplements.OperacionServicesImplement;
import com.intesoft.puntoventa.dao.OperacionDao;
import com.intesoft.puntoventa.entity.Operacion;
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
public class OperacionServicesImplementTest {
    
    @InjectMocks
    private OperacionServicesImplement operacionServices;

    @Mock
    private OperacionDao operacionDao;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveOperacion() {
        // Crear una operación de ejemplo
        Operacion operacion = new Operacion();

        // Definir el comportamiento del mock del DAO
        when(operacionDao.crearVenta(operacion)).thenReturn(1); // Supongamos que el método crearVenta devuelve un valor positivo

        // Llamar al método que deseas probar
        int result = operacionServices.saveOperacion(operacion);

        // Verificar que el método del DAO se haya llamado una vez
        verify(operacionDao, times(1)).crearVenta(operacion);

        // Puedes agregar más aserciones según sea necesario para verificar el resultado
        // Ejemplo: assertEquals(1, result);
    }

    @Test
    public void testGetOperacionById() {
        // Crear una operación de ejemplo
        int numeroVenta = 1;
        Operacion operacion = new Operacion();
        when(operacionDao.getById(numeroVenta)).thenReturn(operacion);

        // Llamar al método que deseas probar
        Operacion result = operacionServices.getOperacionById(numeroVenta);

        // Verificar que el método del DAO se haya llamado una vez
        verify(operacionDao, times(1)).getById(numeroVenta);

        // Puedes agregar más aserciones según sea necesario para verificar el resultado
        // Ejemplo: assertNotNull(result);
    }

    @Test
    public void testGetAllEgresos() {
        // Definir el comportamiento del mock del DAO
        List<Operacion> mockEgresosList = new ArrayList<>(); // Puedes crear una lista de egresos de ejemplo
        when(operacionDao.getAllEgresos()).thenReturn(mockEgresosList);

        // Llamar al método que deseas probar
        List<Operacion> result = operacionServices.getAllEgresos();

        // Verificar que el método del DAO se haya llamado una vez
        verify(operacionDao, times(1)).getAllEgresos();

        // Puedes agregar más aserciones según sea necesario para verificar el resultado
        // Ejemplo: assertEquals(mockEgresosList.size(), result.size());
    }
    
}
