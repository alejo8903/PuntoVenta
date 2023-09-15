/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.intesoft.puntoventa;

import com.intesoft.puntoventa.formularios.Login;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author alejo
 */
public class PuntoVenta {

    public static void main(String[] args) {
        URL jarUrl = PuntoVenta.class.getProtectionDomain().getCodeSource().getLocation();
        String jarPath = "";
        try {
            jarPath = jarUrl.toURI().getPath();
        } catch (URISyntaxException ex) {
            Logger.getLogger(PuntoVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        String configFilePath = jarPath + "config.properties";
        try {
            configFilePath = URLDecoder.decode(configFilePath, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PuntoVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        File jarFile = new File(jarPath);
        String parentDirectory = jarFile.getParent();
        if (!(parentDirectory == null)) {
            configFilePath = parentDirectory + File.separator + "config.properties";
        }
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        Properties properties = new Properties();
        try (InputStream input = new FileInputStream(configFilePath)) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        // Establecer las propiedades del persistence.xml
        System.setProperty("config.database.url", properties.getProperty("database.url"));
        System.setProperty("config.database.username", properties.getProperty("database.username"));
        System.setProperty("config.database.password", properties.getProperty("database.password"));
        


        Login login = new Login();
        try {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");

            EntityManager em = emf.createEntityManager();

            em.close();
            emf.close(); 
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos", "Advertencia", 0);

        }
        SwingUtilities.invokeLater(() -> {

            login.setVisible(true);

        });
    }

}
