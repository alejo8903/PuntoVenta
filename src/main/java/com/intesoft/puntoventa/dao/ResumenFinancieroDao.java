/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.dao;

import com.intesoft.puntoventa.entity.ResumenFinanciero;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author alejo
 */
public class ResumenFinancieroDao {

    private final EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private final String jdbcUrl = System.getProperty("config.database.url");
    private final String jdbcUsername = System.getProperty("config.database.username");
    private final String jdbcPassword = System.getProperty("config.database.password");

    public ResumenFinancieroDao(String persistence) {
        this.entityManagerFactory = Persistence.createEntityManagerFactory(persistence);
    }

    public void actualizarVistaResumen() {
        Connection connection = null;
        Statement statement = null;

        try {
            // Paso 1: Conectar a la base de datos
            connection = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);

            // Paso 2: Crear una declaración SQL
            statement = connection.createStatement();

            // Tu sentencia SQL para crear o reemplazar la vista
            String sql = "CREATE OR REPLACE VIEW resumen_financiero AS "
            + "SELECT "
            + "    ROW_NUMBER() OVER () AS id, " // Agregamos una columna de identificación (id)
            + "    (SELECT IFNULL(SUM(total_abonado), 0) FROM Credito WHERE pagado = false) AS totalAbonosNoPagado, "
            + "    (SELECT IFNULL(SUM(total_credito), 0) FROM Credito WHERE pagado = true) AS totalCreditosPagados, "
            + "    (SELECT IFNULL(SUM(valor), 0) FROM Operacion WHERE operacion NOT IN ('SEPARADO', 'VENTACREDITO')) AS totalCajaVenta;";

            // Paso 3: Ejecutar la sentencia SQL
            statement.executeUpdate(sql);

            // Paso 4: Cerrar la conexión y la declaración
            statement.close();
            connection.close();
        } catch (SQLException e) {
            // Manejar cualquier error que pueda ocurrir al ejecutar la sentencia SQL
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public ResumenFinanciero getResumenFinaciero() {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        List<ResumenFinanciero> listresumenFinanciero = entityManager.createQuery("SELECT r FROM ResumenFinanciero r", ResumenFinanciero.class
        )
                .getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();
        if (listresumenFinanciero.isEmpty()){
            return new ResumenFinanciero();
        } else {
        return listresumenFinanciero.get(0);
        }

    }
}
