/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.intesoft.puntoventa.servicesImplements;

import com.intesoft.puntoventa.ServicesImplements.InventarioServicesImplement;
import com.intesoft.puntoventa.dao.InventarioDao;
import com.intesoft.puntoventa.dto.InventarioDto;
import com.intesoft.puntoventa.entity.Inventario;
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
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author alejo
 */
public class InventarioServicesImplementTest {
    
   @InjectMocks
    private InventarioServicesImplement inventarioServices;

    @Mock
    private InventarioDao inventarioDao;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSearchProducto() {
        int codigo = 123; // Código de ejemplo
        List<InventarioDto> inventarioDtoList = new ArrayList<>();
        // Agrega elementos a inventarioDtoList según tus necesidades

        // Configura el comportamiento del inventarioDao mock
        Mockito.when(inventarioDao.searchByCodigo(codigo)).thenReturn(inventarioDtoList);

        // Llama al método que deseas probar
        List<InventarioDto> result = inventarioServices.searchProdcto(codigo);

        // Verifica que el resultado sea el esperado
        assertEquals(inventarioDtoList, result);
    }

    @Test
    public void testGetProductoById() {
        int id = 456; // ID de ejemplo
        Inventario inventario = new Inventario();
        // Configura el comportamiento del inventarioDao mock
        Mockito.when(inventarioDao.productoById(id)).thenReturn(inventario);

        // Llama al método que deseas probar
        Inventario result = inventarioServices.getProductoById(id);

        // Verifica que el resultado sea el esperado
        assertEquals(inventario, result);
    }

    @Test
    public void testUpdateInventario() {
        int id = 789; // ID de ejemplo
        int cantidad = 5; // Cantidad de ejemplo
        Inventario inventario = new Inventario();
        inventario.setCantidad(10); // Cantidad inicial de ejemplo

        // Configura el comportamiento del inventarioDao mock
        Mockito.when(inventarioDao.productoById(id)).thenReturn(inventario);

        // Llama al método que deseas probar
        inventarioServices.updateInventario(id, cantidad);

        // Verifica que la cantidad se haya actualizado correctamente
        assertEquals(5, inventario.getCantidad());
    }

    @Test
    public void testGetInventarioTotal() {
        List<Inventario> inventarioList = new ArrayList<>();
        // Agrega elementos a inventarioList según tus necesidades

        // Configura el comportamiento del inventarioDao mock
        Mockito.when(inventarioDao.getAll()).thenReturn(inventarioList);

        // Llama al método que deseas probar
        List<Inventario> result = inventarioServices.getInventarioTotal();

        // Verifica que el resultado sea el esperado
        assertEquals(inventarioList, result);
    }

    @Test
    public void testInsertInventario() {
        Inventario inventario = new Inventario(); // Inventario de ejemplo

        // Llama al método que deseas probar
        inventarioServices.insertInventario(inventario);

        // Verifica que se haya llamado al método create del inventarioDao mock
        Mockito.verify(inventarioDao).create(inventario);
    }
    
}
