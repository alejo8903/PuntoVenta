package com.intesoft.puntoventa.formularios;

import com.intesoft.puntoventa.controller.ClientesController;
import com.intesoft.puntoventa.entity.Clientes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author alejo
 */
public class ClientesWindow extends javax.swing.JInternalFrame {

    /**
     * Creates new form Clientes
     */
    private Clientes cliente;
    private List<Clientes> listClientes;
    public ClientesWindow() {
        initComponents();
        updateTable();
        
        
    }
    public ClientesWindow(String Search) {
        initComponents();
        updateTable();
              
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        jTextDireccion = new javax.swing.JTextField();
        jTextLimCredito = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Creacion Clientes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clasificacion.png"))); // NOI18N
        setName(""); // NOI18N

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Telefono");

        jLabel4.setText("Direccion");

        jLabel5.setText("Limite credito");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Telefono", "Direccion", "Limite credito", "Deuda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jButton1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextNombre)
                        .addComponent(jTextApellido)
                        .addComponent(jTextTelefono)
                        .addComponent(jTextDireccion)
                        .addComponent(jTextLimCredito, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextLimCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String operacion = jButton1.getText();
        
        String limCredito = jTextLimCredito.getText();
        this.cliente.setNombre(jTextNombre.getText());
        this.cliente.setApellido(jTextApellido.getText());
        this.cliente.setTelefono(jTextTelefono.getText());
        this.cliente.setDireccion(jTextDireccion.getText());
        if (limCredito.isBlank() || limCredito == "0" ) {
            this.cliente.setLimiteCredito(0);
        }else{
            this.cliente.setLimiteCredito(Double.parseDouble(jTextLimCredito.getText()));
        }
        if(operacion == "Agregar"){
            ClientesController clientesController = new ClientesController();
            clientesController.guardarCliente(this.cliente);
            
        }else if(operacion == "Modificar"){
            ClientesController clientesController = new ClientesController();
            clientesController.actualizarCliente(this.cliente);
            this.jButton1.setText("Agregar");
        }
        
        jTextNombre.setText("");
        jTextApellido.setText("");
        jTextTelefono.setText("");
        jTextDireccion.setText("");
        jTextLimCredito.setText("");
        updateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row = this.jTable1.getSelectedRow();
        if (row >= 0) {
            this.cliente.setIdCliente(Integer.parseInt(this.jTable1.getValueAt(row, 0).toString()));
            this.cliente.setNombre(this.jTable1.getValueAt(row, 1).toString());
            this.cliente.setApellido(this.jTable1.getValueAt(row, 2).toString());
            this.cliente.setTelefono(this.jTable1.getValueAt(row, 3).toString());
            this.cliente.setDireccion(this.jTable1.getValueAt(row, 4).toString());
            this.cliente.setLimiteCredito(Double.parseDouble(this.jTable1.getValueAt(row, 5).toString()));
            this.cliente.setDeuda(Double.parseDouble(this.jTable1.getValueAt(row, 6).toString()));
            this.jTextNombre.setText(this.cliente.getNombre());
            this.jTextApellido.setText(this.cliente.getApellido());
            this.jTextTelefono.setText(this.cliente.getTelefono());
            this.jTextDireccion.setText(this.cliente.getDireccion());
            this.jTextLimCredito.setText(String.valueOf(this.cliente.getLimiteCredito()));
            this.jButton1.setText("Modificar");
        }else{
            JOptionPane.showMessageDialog(null, "No ha seleccionado un registro para cambiar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
    private void updateTable(){
        this.cliente = new Clientes();
        this.listClientes = new ArrayList<>();
        ClientesController clientesController = new ClientesController();
        this.listClientes = clientesController.getAllClientes();
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        model.setNumRows(0);
        for (Clientes cliente : listClientes) {
            Object[] rowData = {
                cliente.getIdCliente(),
                cliente.getNombre(),
                cliente.getApellido(),
                cliente.getTelefono(),
                cliente.getDireccion(),
                cliente.getLimiteCredito(),
                cliente.getDeuda()
            };
            model.addRow(rowData);
        }
    }
    public Clientes asignarCliente(){
        
        return this.cliente;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextLimCredito;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
}
