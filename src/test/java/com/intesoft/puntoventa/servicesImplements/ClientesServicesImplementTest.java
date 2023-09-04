/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.servicesImplements;
import com.intesoft.puntoventa.ServicesImplements.ClientesServicesImplement;
import com.intesoft.puntoventa.ServicesImplements.InventarioServicesImplement;
import com.intesoft.puntoventa.dao.ClientesDao;
import com.intesoft.puntoventa.dao.InventarioDao;
import com.intesoft.puntoventa.entity.Clientes;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
/**
 *
 * @author alejo
 */
public class ClientesServicesImplementTest {
    @InjectMocks
    private ClientesServicesImplement clientesServices;

    @Mock
    private ClientesDao clientesDao;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllClientes() {
        // Definir el comportamiento del mock del DAO
        List<Clientes> mockClientesList = new ArrayList<>(); // Puedes crear una lista de clientes de ejemplo
        when(clientesDao.getAll()).thenReturn(mockClientesList);

        // Llamar al método que deseas probar
        List<Clientes> result = clientesServices.getAllClientes();

        // Verificar que el método del DAO se haya llamado una vez
        verify(clientesDao, times(1)).getAll();

        // Puedes agregar más aserciones según sea necesario para verificar el resultado
        // Ejemplo: assertEquals(mockClientesList.size(), result.size());
    }

    @Test
    public void testGuardarCliente() {
        // Crear un cliente de ejemplo
        Clientes cliente = new Clientes();

        // Llamar al método que deseas probar
        clientesServices.guardarCliente(cliente);

        // Verificar que el método del DAO se haya llamado una vez
        verify(clientesDao, times(1)).create(cliente);
    }

    @Test
    public void testActualizarCliente() {
        // Crear un cliente de ejemplo
        Clientes cliente = new Clientes();

        // Llamar al método que deseas probar
        clientesServices.actualizarCliente(cliente);

        // Verificar que el método del DAO se haya llamado una vez
        verify(clientesDao, times(1)).merge(cliente);
    }
}
