/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.servicesImplements;

import com.intesoft.puntoventa.Services.CreditoServices;
import com.intesoft.puntoventa.ServicesImplements.CreditoServicesImplements;
import com.intesoft.puntoventa.dao.CreditoDao;
import com.intesoft.puntoventa.entity.Credito;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author alejo
 */
public class CreditoServiceImplementsTest {
    @InjectMocks
    private CreditoServicesImplements creditoServices;

    @Mock
    private CreditoDao creditoDao;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveCredito() {
        // Crear un objeto Credito de ejemplo
        Credito credito = new Credito();

        // Definir el comportamiento del mock del DAO
        when(creditoDao.create(credito)).thenReturn(1); // Supongamos que el método create devuelve un valor positivo

        // Llamar al método que deseas probar
        int result = creditoServices.saveCredito(credito);

        // Verificar que el método del DAO se haya llamado una vez
        verify(creditoDao, times(1)).create(credito);

        // Puedes agregar más aserciones según sea necesario para verificar el resultado
        // Ejemplo: assertEquals(1, result);
    }
}
