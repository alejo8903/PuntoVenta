/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.entity.Credito;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


/**
 *
 * @author alejo
 */
public class CreditoDaoTest {
    


    @Test
    public void testCreateAndRetrieveCredito() {
        // Crear una instancia de CreditoDao con la unidad de persistencia adecuada
        CreditoDao creditoDao = new CreditoDao("testPersistenceUnit");

        // Crear un objeto de tipo Credito para la prueba
        Credito credito = new Credito();
        credito.setTotalAbonado(1000.0); // Asegúrate de configurar los detalles según tus necesidades

        // Insertar el crédito en la base de datos
        int idCredito = creditoDao.create(credito);

        // Verificar que el ID del crédito retornado sea mayor que 0 (indicando que se creó correctamente)
        Assertions.assertTrue(idCredito > 0);

        // Recuperar el crédito recién insertado de la base de datos
        Credito creditoRecuperado = creditoDao.findById(idCredito);

        // Verificar que el crédito recuperado no sea nulo
        Assertions.assertNotNull(creditoRecuperado);

        // Verificar que los detalles del crédito recuperado coincidan con los datos de prueba
        Assertions.assertEquals(credito.getTotalAbonado(), creditoRecuperado.getTotalAbonado());

        // Puedes realizar más verificaciones según la estructura y lógica de tu DAO y entidad Credito
    }
}
