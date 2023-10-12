/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package com.intesoft.puntoventa.formularios;

import com.intesoft.puntoventa.controller.OperacionController;
import com.intesoft.puntoventa.entity.Usuarios;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author alejo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    private Usuarios usuarios;
    private SeparadosCreditos separadosCreditos;
    private Ventas venta;
    private ControlInventario inventario;
    private Productos productos;
    private ClientesWindow clientes;
    private Egresos egresos;
    private Ingresos ingresos;
    private boolean estadoSeparadosCreditos = true;
    private boolean estadoVentas = true;
    private boolean estadoInventario = true;
    private boolean estadoClientes = true;
    private boolean estadoProductos = true;
    private boolean estadoEgresos = true;
    private boolean estadoIngresos = true;

    public Principal() {
        initComponents();
    }

    public Principal(Usuarios usuarios) {
        this.usuarios = usuarios;
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/tienda.png")).getImage());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        if(!usuarios.ispAdminUser()){
            this.menuProductos.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        menuProductos = new javax.swing.JMenu();
        menuInventario = new javax.swing.JMenu();
        menuVentas = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setBorder(null);
        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivador.png"))); // NOI18N
        fileMenu.setText("Archivo");

        jMenuItem1.setText("Cerrar Sesión");
        fileMenu.add(jMenuItem1);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        menuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-producto.png"))); // NOI18N
        menuProductos.setText("Productos");
        menuProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProductosMouseClicked(evt);
            }
        });
        menuBar.add(menuProductos);

        menuInventario.setBorder(null);
        menuInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista.png"))); // NOI18N
        menuInventario.setText("Inventario");
        menuInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInventarioMouseClicked(evt);
            }
        });
        menuBar.add(menuInventario);

        menuVentas.setBorder(null);
        menuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bolsa-de-la-compra.png"))); // NOI18N
        menuVentas.setText("Ventas");
        menuVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVentasMouseClicked(evt);
            }
        });
        menuBar.add(menuVentas);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clasificacion.png"))); // NOI18N
        jMenu7.setText("Clientes");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        menuBar.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tarjeta-de-debito.png"))); // NOI18N
        jMenu8.setText("Creditos & Separados");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        menuBar.add(jMenu8);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gastos.png"))); // NOI18N
        jMenu9.setText("Egresos ");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        menuBar.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crecimiento-del-dinero.png"))); // NOI18N
        jMenu10.setText("Ingresos");
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        menuBar.add(jMenu10);

        helpMenu.setBorder(null);
        helpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesa-de-ayuda.png"))); // NOI18N
        helpMenu.setText("Ayuda");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Contactos");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void menuVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVentasMouseClicked
        if (this.estadoVentas) {
            venta = new Ventas(this.usuarios, this);
            this.desktopPane.add(this.venta);
            try {
                venta.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.venta.setVisible(true);
            this.estadoVentas = false;
        } else {
            JOptionPane.showMessageDialog(null, "La ventana Ventas ya esta abierta ", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_menuVentasMouseClicked

    private void menuInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInventarioMouseClicked
        if (this.estadoInventario) {
            this.inventario = new ControlInventario(this.usuarios, this);
            this.desktopPane.add(this.inventario);
            this.inventario.setVisible(true);
            this.estadoInventario = false;
        } else {
            JOptionPane.showMessageDialog(null, "La ventana Inventario ya esta abierta ","Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_menuInventarioMouseClicked

    private void menuProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosMouseClicked
        if (this.estadoProductos) {
            this.productos = new Productos(this);
            this.desktopPane.add(this.productos);
            this.productos.setVisible(true);
            this.estadoProductos = false;
        } else {
            JOptionPane.showMessageDialog(null, "La ventana Productos ya esta abierta ", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_menuProductosMouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        if (this.estadoClientes) {
            this.clientes = new ClientesWindow(this);
            this.desktopPane.add(this.clientes);
            this.clientes.setVisible(true);
            this.estadoClientes = false;
        } else {
            JOptionPane.showMessageDialog(null, "La ventana Clientes ya esta abierta ", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        if (this.estadoEgresos) {
            egresos = new Egresos(this.usuarios, this);
            this.desktopPane.add(this.egresos);
            this.egresos.setVisible(true);
            this.estadoEgresos = false;
        } else {
            JOptionPane.showMessageDialog(null, "La ventana Egresos ya esta abierta ", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
        if (this.estadoIngresos) {
            this.ingresos = new Ingresos(this,this.usuarios);
            this.desktopPane.add(this.ingresos);
            this.ingresos.setVisible(true);
            this.estadoIngresos = false;
        } else {
            JOptionPane.showMessageDialog(null, "La ventana Ingresos ya esta abierta ", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jMenu10MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        if (this.estadoSeparadosCreditos) {
            this.separadosCreditos = new SeparadosCreditos(usuarios, this);
            this.desktopPane.add(separadosCreditos);
            this.separadosCreditos.setVisible(true);
            this.estadoSeparadosCreditos = false;
        } else {
            JOptionPane.showMessageDialog(null, "La ventana Creditos y separados ya esta abierta ", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenu8MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public void liberarInstancia(String instancia) {
        switch (instancia) {
            case "separadosCreistos":
                estadoSeparadosCreditos = true;
                break;
            case "ingresos":
                estadoIngresos = true;
                break;

            case "egresos":
                estadoEgresos = true;
                break;
            case "ventas":
                estadoVentas = true;
                break;

            case "productos":
                estadoProductos = true;
                break;
            case "inventario":
                estadoInventario = true;
                break;
            case "clientes":
                estadoClientes = true;
                break;
            default:
                throw new AssertionError();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuInventario;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuVentas;
    // End of variables declaration//GEN-END:variables

}
