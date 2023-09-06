/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.intesoft.puntoventa.dao;



import com.intesoft.puntoventa.entity.Clientes;
import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;

/**
 *
 * @author alejo
 */
public class ClientesDaoTest {
    
    @Test
    @Order(0)
    public void testGetAll() {
        ClientesDao clientesDao = new ClientesDao("testPersistenceUnit");

        // Crea dos clientes
        Clientes cliente1 = new Clientes();
        cliente1.setNombre("Alejo");
        cliente1.setApellido("Pérez");
        

        Clientes cliente2 = new Clientes();
        cliente2.setNombre("Juan");
        cliente2.setApellido("López");
        

        // Los inserta en la base de datos
        clientesDao.create(cliente1);
        clientesDao.create(cliente2);

        // Obtiene la lista de todos los clientes
        List<Clientes> clientes = clientesDao.getAll();

        // Verifica que la lista tenga dos elementos
        Assertions.assertEquals(4, clientes.size());

        // Verifica que el primer elemento sea el cliente 1
        Assertions.assertEquals(cliente1.getNombre(), clientes.get(2).getNombre());

        // Verifica que el segundo elemento sea el cliente 2
        Assertions.assertEquals(cliente2.getNombre(), clientes.get(3).getNombre());
    }

    @Test
    @Order(2)
    public void testCreate() {
        ClientesDao clientesDao = new ClientesDao("testPersistenceUnit");

        // Crea un nuevo cliente
        Clientes cliente = new Clientes();
        cliente.setNombre("José");
        cliente.setApellido("García");
        

        // Lo inserta en la base de datos
        clientesDao.create(cliente);

        // Verifica que el cliente exista en la base de datos
        Assertions.assertNotNull(clientesDao.findById(cliente.getIdCliente()));
    }

    @Test
    @Order(3)
    public void testMerge() {
        ClientesDao clientesDao = new ClientesDao("testPersistenceUnit");

        // Crea un nuevo cliente
        Clientes cliente = new Clientes();
        cliente.setNombre("Luisa");
        cliente.setApellido("Martínez");

        // Lo inserta en la base de datos
        clientesDao.create(cliente);

        // Actualiza el nombre del cliente
        cliente.setNombre("María");

        // Lo fusiona con la base de datos
        clientesDao.merge(cliente);

        // Verifica que el nombre del cliente haya sido actualizado
        Assertions.assertEquals("María", clientesDao.findById(cliente.getIdCliente()).getNombre());
    }
}
