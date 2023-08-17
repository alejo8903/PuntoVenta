/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.intesoft.puntoventa.formularios;

import com.intesoft.puntoventa.controller.MaestroController;
import com.intesoft.puntoventa.entity.Maestro;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alejo
 */
public class Productos extends javax.swing.JInternalFrame {

    /**
     * Creates new form IngresoProductos
     */
    public Productos() {
        initComponents();
        this.listarProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBAgregarP = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Productos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "TIPO", "DESCRIPCION", "TALLA", "COLOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Codigo");

        jBAgregarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-producto.png"))); // NOI18N
        jBAgregarP.setText("Agregar Producto");
        jBAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarPActionPerformed(evt);
            }
        });

        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        jBEliminar.setText("Eliminar Producto");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dibujo.png"))); // NOI18N
        jBModificar.setText("Modificar Producto");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBActualizar.setText("Actualizar Tabla");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAgregarP)
                        .addGap(18, 18, 18)
                        .addComponent(jBModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBActualizar)
                .addGap(391, 391, 391))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBActualizar)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBModificar)
                    .addComponent(jBAgregarP)
                    .addComponent(jBEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarPActionPerformed
        IngresoProductos ingresoProductos = new IngresoProductos("ingresar");
        ingresoProductos.setModal(true);
        ingresoProductos.setVisible(true);
    }//GEN-LAST:event_jBAgregarPActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        this.listarProductos();
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        int rowIndex = this.jTable1.getSelectedRow();
        if(rowIndex >=0 ){
            Maestro maestro = new Maestro();
            maestro.setCodigo( (jTable1.getValueAt(rowIndex,0).toString()+jTable1.getValueAt(rowIndex,1).toString()));
            maestro.setDescripcion(jTable1.getValueAt(rowIndex,2).toString());
            maestro.setTalla(jTable1.getValueAt(rowIndex,3).toString());
            maestro.setColor(jTable1.getValueAt(rowIndex,4).toString());
            IngresoProductos ingresoProductos = new IngresoProductos(maestro, "modificar");
            ingresoProductos.setModal(true);
            ingresoProductos.setVisible(true);
            
            
        }else{
            JOptionPane.showMessageDialog(null, "No ha selecionado ningun producto para modificar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int rowIndex = this.jTable1.getSelectedRow();
        if(rowIndex >=0 ){
            
            String codigo = (jTable1.getValueAt(rowIndex,0).toString()+jTable1.getValueAt(rowIndex,1).toString());
            MaestroController maestroController = new MaestroController();
            maestroController.deleteProducto(codigo);
            
            
        }else{
            JOptionPane.showMessageDialog(null, "No ha selecionado ningun producto para modificar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarActionPerformed
    
    private void listarProductos(){
        MaestroController maestroController = new MaestroController();
        List<Maestro> listaProductos = maestroController.getAllProductos();
        DefaultTableModel model =  (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        for (Maestro producto : listaProductos) {
            String codigo = producto.getCodigo();
            String codigoSinUltimosDigitos = (codigo).substring(0, (codigo).length() - 2);
            String codigoString = (producto.getCodigo());
            int longitud = codigoString.length();
            String ultimosDigitos = codigoString.substring(longitud - 2);
            Object[] rowData = {
                codigoSinUltimosDigitos,
                ultimosDigitos,
                producto.getDescripcion(),
                producto.getTalla(),
                producto.getColor()
            };
            model.addRow(rowData);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBAgregarP;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCodigo;
    // End of variables declaration//GEN-END:variables
}
