/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.intesoft.puntoventa.formularios;

import com.intesoft.puntoventa.controller.CreditoController;
import com.intesoft.puntoventa.controller.DescripcionOperacionController;
import com.intesoft.puntoventa.controller.OperacionController;
import com.intesoft.puntoventa.controller.ResumenFinancieroController;
import com.intesoft.puntoventa.entity.DescripcionOperacion;
import com.intesoft.puntoventa.entity.Operacion;
import com.intesoft.puntoventa.entity.ResumenFinanciero;
import com.intesoft.puntoventa.entity.Usuarios;
import com.intesoft.puntoventa.util.MonedaTransform;
import com.intesoft.puntoventa.util.NumericValidator;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Usuario
 */
public class Egresos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Egresos
     */
    TableRowSorter<DefaultTableModel> sorter;
    DefaultTableModel model;
    private List<Operacion> listOperacion;
    private Usuarios usuarios;
    private OperacionController operacionController;
    private MonedaTransform monedaTransform;
    private NumericValidator numericValidator;
    private ResumenFinancieroController resumenFinancieroController;
    private ResumenFinanciero resumenFinanciero;
    private List<DescripcionOperacion> listDescripcionOperacion;
    private DescripcionOperacionController descripcionOperacionController;
    private Principal principal;
    private boolean flag1 = false;
    private boolean flag2 = false;

    public Egresos() {
        initComponents();

    }

    public Egresos(Usuarios usuarios, Principal principal) {
        initComponents();
        this.usuarios = usuarios;
        this.listOperacion = new ArrayList<>();

        this.model = (DefaultTableModel) jTable1.getModel();
        this.jTable1.setModel(model);
        this.jTable1.setAutoCreateRowSorter(true);
        sorter = new TableRowSorter<>(model);
        this.jTable1.setRowSorter(sorter);
        operacionController = new OperacionController();
        // Obtén la fecha actual
        Calendar calendar = Calendar.getInstance();
        
        // Resta 7 días a la fecha actual
        calendar.add(Calendar.DAY_OF_YEAR, -7);
          Date nuevaFecha = calendar.getTime();
        monedaTransform = new MonedaTransform();
        jDateChooser1.setDate(nuevaFecha);
        jDateChooser2.setDate(new Date());
        numericValidator = new NumericValidator();
        this.principal = principal;
        this.descripcionOperacionController = new DescripcionOperacionController();
       

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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Jt_Gastos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Jf_TotalGastod = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        valorCajaTextField = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDescripcion = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Egresos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gastos.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idDescripcion", "Id", "Tipo de Gasto", "Descripcion", "Fecha", "Reporta", "Valor"
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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel1.setText("Costos:");

        Jt_Gastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jt_GastosActionPerformed(evt);
            }
        });
        Jt_Gastos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_GastosKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contabilidad.png"))); // NOI18N
        jButton1.setText("Ingresar Gastos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo Gasto:");

        jLabel3.setText("Total Gastos:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "SERVICIOS", "ALIMENTACION", "NOMINA", "MANTENIMIENTO" }));

        jLabel4.setText("inicial");

        jLabel5.setText("Final");

        jLabel6.setText("Total en Caja:");

        jToggleButton1.setText("Buscar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Descripcion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Jt_Gastos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(valorCajaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Jf_TotalGastod, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(Jt_Gastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jf_TotalGastod, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(valorCajaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void dispose(){
        principal.liberarInstancia("egresos");
        super.dispose();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String gasto = Jt_Gastos.getText();
        String descripcion = jTextFieldDescripcion.getText();
        int tipoGasto = jComboBox1.getSelectedIndex();
        
        if (!gasto.isEmpty() && tipoGasto != 0 && !descripcion.isEmpty()) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres guardar este gasto? \n"
                    + jComboBox1.getSelectedItem().toString() + " por valor de " + gasto, "Confirmación", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                double gastoNum = monedaTransform.transfrormMoneda(gasto);
            gastoNum = gastoNum * -1;
            Operacion operacion = new Operacion();
            DescripcionOperacion descripcionOperacion = new DescripcionOperacion();
            operacion.setFecha(new Date());
            operacion.setOperacion(jComboBox1.getSelectedItem().toString());
            operacion.setUsuario(this.usuarios.getNombres() + " " + this.usuarios.getApellidos());
            operacion.setValor(gastoNum);
            int id = operacionController.saveOperacion(operacion);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Egresos.class.getName()).log(Level.SEVERE, null, ex);
                }
            descripcionOperacion.setOperacion(operacion);
            descripcionOperacion.setDescripcion(descripcion);
            descripcionOperacionController.saveDescripcionOperacion(descripcionOperacion);
            jDateChooser2.setDate(new Date());
            updateTable();
            JOptionPane.showMessageDialog(null, "El egreso " + id + " ha sido registrado con exito", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar el tipo de gasto y el valor del mismo", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void Jt_GastosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_GastosKeyTyped
        String gastos = Jt_Gastos.getText();
        numericValidator.validation(evt);
        if (numericValidator.getFlag()) {
            return;
        }
        String monedalimpia = String.valueOf(monedaTransform.transfrormMoneda(gastos + evt.getKeyChar()));
        double monedaDouble = Double.parseDouble(monedalimpia);
        this.Jt_Gastos.setText(monedaTransform.formatMoneda(monedaDouble));
        evt.consume();
    }//GEN-LAST:event_Jt_GastosKeyTyped

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        updateTable();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void Jt_GastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jt_GastosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jt_GastosActionPerformed

    private void updateTable() {
        DescripcionOperacionController descripcionOperacionController = new DescripcionOperacionController();
        Date starDate = jDateChooser1.getDate();
        Date endDate = jDateChooser2.getDate();
        listDescripcionOperacion = descripcionOperacionController.getAllEgresos(starDate, endDate);
        this.model.setNumRows(0);
        double totalGastos = 0;
        for (DescripcionOperacion descripcionOperacion : listDescripcionOperacion) {
            Object[] rowData = {
                descripcionOperacion.getId(),
                descripcionOperacion.getOperacion().getIdOperacion(),
                descripcionOperacion.getOperacion().getOperacion(),
                descripcionOperacion.getDescripcion(),
                descripcionOperacion.getOperacion().getFecha(),
                descripcionOperacion.getOperacion().getUsuario(),
                monedaTransform.formatMoneda(descripcionOperacion.getOperacion().getValor())
            };
            totalGastos -= descripcionOperacion.getOperacion().getValor();
            this.model.addRow(rowData);

        }
        Jf_TotalGastod.setText(monedaTransform.formatMoneda(totalGastos*-1));
        totalizarCaja();
    }
    private void totalizarCaja(){
        try {
        resumenFinancieroController  = new ResumenFinancieroController();
        resumenFinanciero = resumenFinancieroController.getTotalCaja();
        valorCajaTextField.setText(monedaTransform.formatMoneda(resumenFinanciero.getTotalAbonosNoPagado() 
                + resumenFinanciero.getTotalCajaVenta()+ resumenFinanciero.getTotalCreditosPagados()));
        } catch(Exception e){
            System.err.println(e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Jf_TotalGastod;
    private javax.swing.JTextField Jt_Gastos;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField valorCajaTextField;
    // End of variables declaration//GEN-END:variables
}
