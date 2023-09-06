/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.dto.InventarioDto;
import com.intesoft.puntoventa.entity.Inventario;
import com.intesoft.puntoventa.entity.Maestro;
import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author alejo
 */
public class InventarioDaoTest {
    
    
    @InjectMocks
    private InventarioDao inventarioDao;
    

    @BeforeEach
    public void setUp() {
        inventarioDao = new InventarioDao("testPersistenceUnit");
        
    
    }

    @Test
    public void testGetAll() {
        inventarioDao = new InventarioDao("testPersistenceUnit");
        List<Inventario> inventarios = inventarioDao.getAll();
        assertEquals(1, inventarios.size());
    }

    @Test
    public void testSearchByCodigo() {
        inventarioDao = new InventarioDao("myPersistenceUnit2");
        List<InventarioDto> inventarioDtos = inventarioDao.searchByCodigo(1);
        
        assertTrue("mayor o igual a 1", inventarioDtos.size() >= 1);
    }

    @Test
    public void testProductoById() {
        inventarioDao = new InventarioDao("testPersistenceUnit");
        Inventario inventario = inventarioDao.productoById(1);
        assertNotNull(inventario);
    }

    @Test
    public void testUpdate() {
        inventarioDao = new InventarioDao("testPersistenceUnit");
        Inventario inventario = new Inventario();
        inventario.setId(1);
        inventario.setCantidad(20);
        inventarioDao.update(inventario);

        Inventario inventarioActual = inventarioDao.productoById(1);
        assertEquals(20, inventarioActual.getCantidad());
    }

    @Test
    public void testCreate() {
        MaestroDao maestroDao = new MaestroDao("testPersistenceUnit");
        inventarioDao = new InventarioDao("testPersistenceUnit");
        Inventario inventario = new Inventario();
        Maestro maestro =new Maestro();
        maestro.setCodigo("101");
        maestro.setColor("color");
        maestro.setDescripcion("descripcion");
        maestro.setTalla("talla");
        maestroDao.create(maestro);
        inventario.setCodigo(maestro);
        inventario.setCantidad(10);
        inventario.setValorCompra(1000);
        inventario.setIva(100);
        inventario.setTotalCompra(1100);
        inventario.setPorcentajeGanancia(10);
        inventario.setValorVenta(1210);
        inventarioDao.create(inventario);

        Inventario inventarioActual = inventarioDao.productoById(inventario.getId());
        assertEquals(inventario.getId(), inventarioActual.getId());
    }
}
    

