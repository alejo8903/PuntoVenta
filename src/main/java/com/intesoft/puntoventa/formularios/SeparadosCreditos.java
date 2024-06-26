/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.intesoft.puntoventa.formularios;

import com.intesoft.puntoventa.controller.CreditoController;
import com.intesoft.puntoventa.controller.RegistroVendidoController;
import com.intesoft.puntoventa.dto.CreditoDto;
import com.intesoft.puntoventa.entity.Credito;
import com.intesoft.puntoventa.entity.RegistroVendido;
import com.intesoft.puntoventa.entity.Usuarios;
import com.intesoft.puntoventa.util.ModelarTabla;
import com.intesoft.puntoventa.util.MonedaTransform;
import com.intesoft.puntoventa.util.NumericValidator;
import com.intesoft.puntoventa.util.Operaciones;
import java.awt.Dialog;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class SeparadosCreditos extends javax.swing.JInternalFrame {

    /**
     * Creates new form SeparadosCreditos
     */
    private static SeparadosCreditos instancia;
    private Usuarios usuario;
    private ModelarTabla modelarTablaCredito;
    private ModelarTabla modelarTablaSeparado;
    private DefaultTableModel modelCredito;
    private DefaultTableModel modelSeparado;
    private List<CreditoDto> listCreditoDtoCredito;
    private List<CreditoDto> listCreditoDtoSeparado;
    private CreditoController creditoController;
    private MonedaTransform monedaTransform;
    private NumericValidator numericValidator;
    private Principal principal;
    private boolean activo = true;

    public SeparadosCreditos(Usuarios usuario, Principal principal) {
        initComponents();
        modelarTablaCredito = new ModelarTabla(jTable1);
        modelarTablaSeparado = new ModelarTabla(jTable2);
        modelCredito = modelarTablaCredito.getModel();
        modelSeparado = modelarTablaSeparado.getModel();
        listCreditoDtoCredito = new ArrayList<>();
        listCreditoDtoSeparado = new ArrayList<>();
        creditoController = new CreditoController();
        monedaTransform = new MonedaTransform();
        numericValidator = new NumericValidator();
        this.principal = principal;
        this.usuario = usuario;
        updateTableCreditos();
        updateTableSeparados();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        searchJTextrField = new javax.swing.JTextField();
        Jb_creditos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Tj_abonos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Jb_Separados = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        search1JTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Jt_abonoSeparado = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Creditos & Separados");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tarjeta-de-debito.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombres", "Apellido", "Total Credito", "Total Abonos", "Saldo Pendiente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(5);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(3).setMinWidth(5);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(5).setMinWidth(5);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Busqueda");

        searchJTextrField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchJTextrFieldKeyReleased(evt);
            }
        });

        Jb_creditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-archivo.png"))); // NOI18N
        Jb_creditos.setText("Abonar");
        Jb_creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_creditosActionPerformed(evt);
            }
        });

        jLabel4.setText("Abonos:");

        Tj_abonos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tj_abonosKeyTyped(evt);
            }
        });

        jButton1.setText("Desplegar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1146, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchJTextrField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Tj_abonos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jb_creditos)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchJTextrField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jb_creditos)
                    .addComponent(jLabel4)
                    .addComponent(Tj_abonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Creditos", jPanel1);

        Jb_Separados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-archivo.png"))); // NOI18N
        Jb_Separados.setText("Abonar");
        Jb_Separados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_SeparadosActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombres", "Apellido", "Total Separado", "Total Abonos", "Saldo Pendiente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable2.getColumnModel().getColumn(3).setMinWidth(5);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTable2.getColumnModel().getColumn(5).setMinWidth(5);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Busqueda");

        search1JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1JTextFieldKeyReleased(evt);
            }
        });

        jLabel5.setText("Abonos:");

        Jt_abonoSeparado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_abonoSeparadoKeyTyped(evt);
            }
        });

        jButton2.setText("Desplegar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1146, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search1JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jt_abonoSeparado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jb_Separados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(search1JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(Jb_Separados)
                    .addComponent(Jt_abonoSeparado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Separados", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void dispose() {
        this.principal.liberarInstancia("separadosCreistos");
        super.dispose();
    }


    private void Jb_SeparadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_SeparadosActionPerformed
        int rowIndex = jTable2.getSelectedRow();
        String abonoText = Jt_abonoSeparado.getText();
        if (rowIndex >= 0 && !abonoText.isEmpty()) {
            int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro que desea saldar el separado: \n"
                    + "Credito numero: " + jTable2.getValueAt(rowIndex, 0).toString() + " \n"
                    + "Nombre: " + jTable2.getValueAt(rowIndex, 1).toString() + " " + jTable2.getValueAt(rowIndex, 2).toString() + " \n"
                    + "Valor: " + jTable2.getValueAt(rowIndex, 3).toString() + " \n"
                    + "Abono: " + Jt_abonoSeparado.getText() + " \n",
                    "Advertencia", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {

                double totalAbonado = monedaTransform.transfrormMoneda(jTable2.getValueAt(rowIndex, 4).toString());
                double abono = monedaTransform.transfrormMoneda(Jt_abonoSeparado.getText());
                double deuda = monedaTransform.transfrormMoneda(jTable2.getValueAt(rowIndex, 5).toString());
                Credito credito = creditoController.getCreditById(Integer.parseInt(jTable2.getValueAt(rowIndex, 0).toString()));

                if ((deuda - abono) < 0) {
                    JOptionPane.showMessageDialog(null, "Favor veifique el monto del abono, no puede ser mayor a la deuda",
                            "Advertenvia", JOptionPane.WARNING_MESSAGE);

                } else if ((deuda - abono) == 0) {
                    credito.setTotalAbonado(totalAbonado + abono);
                    credito.setPagado(true);
                    creditoController.updateCredito(credito);
                    updateTableSeparados();
                } else {
                    JOptionPane.showMessageDialog(null, "Los separados deben saldarse para entregarse\n"
                            + "verifique que el abono corresponde al saldo pendiente", "Advertencia", JOptionPane.WARNING_MESSAGE);

                }

            } else {

            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un credito de la lista"
                    + "\n y debe introcir un abono valido", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        Jt_abonoSeparado.setText("");
        search1JTextField.setText("");
    }//GEN-LAST:event_Jb_SeparadosActionPerformed

    private void Jb_creditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_creditosActionPerformed
        int rowIndex = jTable1.getSelectedRow();
        String abonoText = Tj_abonos.getText();
        if (rowIndex >= 0 && !abonoText.isEmpty()) {
            int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro que desea abonar o saldar el credito: \n"
                    + "Credito numero: " + jTable1.getValueAt(rowIndex, 0).toString() + " \n"
                    + "Nombre: " + jTable1.getValueAt(rowIndex, 1).toString() + " " + jTable1.getValueAt(rowIndex, 2).toString() + " \n"
                    + "Valor: " + jTable1.getValueAt(rowIndex, 3).toString() + " \n"
                    + "Abono: " + Tj_abonos.getText() + " \n",
                    "Advertencia", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {

                double totalAbonado = monedaTransform.transfrormMoneda(jTable1.getValueAt(rowIndex, 4).toString());
                double abono = monedaTransform.transfrormMoneda(Tj_abonos.getText());
                double deuda = monedaTransform.transfrormMoneda(jTable1.getValueAt(rowIndex, 5).toString());
                Credito credito = creditoController.getCreditById(Integer.parseInt(jTable1.getValueAt(rowIndex, 0).toString()));

                if ((deuda - abono) < 0) {
                    JOptionPane.showMessageDialog(null, "Favor veifique el monto del abono, no puede ser mayor a la deuda",
                            "Advertenvia", JOptionPane.WARNING_MESSAGE);

                } else {
                    credito.setTotalAbonado(totalAbonado + abono);
                    if ((deuda - abono) == 0) {
                        credito.setPagado(true);
                    }

                    creditoController.updateCredito(credito);
                    updateTableCreditos();
                }

            } else {

            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un credito de la lista"
                    + "\n y debe introcir un abono valido", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        Tj_abonos.setText("");
        searchJTextrField.setText("");

    }//GEN-LAST:event_Jb_creditosActionPerformed

    private void searchJTextrFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchJTextrFieldKeyReleased
        String search = searchJTextrField.getText();
        modelarTablaCredito.filter(search, null);
    }//GEN-LAST:event_searchJTextrFieldKeyReleased

    private void search1JTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1JTextFieldKeyReleased
        String search = search1JTextField.getText();
        modelarTablaSeparado.filter(search, null);
    }//GEN-LAST:event_search1JTextFieldKeyReleased

    private void Jt_abonoSeparadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_abonoSeparadoKeyTyped
        String abono = this.Jt_abonoSeparado.getText();
        if (abono.isBlank() || abono == "$ 0" || abono == "$ ") {
            abono = "";
        }
        numericValidator.validation(evt);
        if (numericValidator.getFlag()) {
            return;
        }
        String monedalimpia = String.valueOf(monedaTransform.transfrormMoneda(abono + evt.getKeyChar()));
        double monedaDouble = Double.parseDouble(monedalimpia);
        this.Jt_abonoSeparado.setText(monedaTransform.formatMoneda(monedaDouble));
        evt.consume();
    }//GEN-LAST:event_Jt_abonoSeparadoKeyTyped

    private void Tj_abonosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tj_abonosKeyTyped
        String abono = this.Tj_abonos.getText();
        if (abono.isBlank() || abono == "$ 0" || abono == "$ ") {
            abono = "";
        }
        numericValidator.validation(evt);
        if (numericValidator.getFlag()) {
            return;
        }
        String monedalimpia = String.valueOf(monedaTransform.transfrormMoneda(abono + evt.getKeyChar()));
        double monedaDouble = Double.parseDouble(monedalimpia);
        this.Tj_abonos.setText(monedaTransform.formatMoneda(monedaDouble));
        evt.consume();
    }//GEN-LAST:event_Tj_abonosKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int rowIndex = jTable2.getSelectedRow();
        this.desplegar(rowIndex, jTable2, "separado");


    }//GEN-LAST:event_jButton2ActionPerformed

    public void desplegar(int rowIndex, JTable jTable, String operacion) {
        if (rowIndex >= 0) {
            int idCredito = Integer.parseInt(jTable.getValueAt(rowIndex, 0).toString());
            Credito credito = creditoController.getCreditById(idCredito);
            int idOperacion = credito.getOperacion().getIdOperacion();
            Despliegue despliegue = new Despliegue(this.usuario, idOperacion, this, operacion);
            despliegue.setModal(true);
            despliegue.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar una fila para desplegar",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int rowIndex = jTable1.getSelectedRow();
        this.desplegar(rowIndex, jTable1,"credito");
    }//GEN-LAST:event_jButton1ActionPerformed

    public void updateTableCreditos() {
        creditoController = new CreditoController();
        listCreditoDtoCredito = creditoController.getListaCreditos(Operaciones.VENTACREDITO.toString());
        modelCredito.setRowCount(0);
        for (CreditoDto creditoDto : listCreditoDtoCredito) {
            Object[] dataRow = {
                creditoDto.getId(),
                creditoDto.getNombre(),
                creditoDto.getApellido(),
                monedaTransform.formatMoneda(creditoDto.getTotalCredito()),
                monedaTransform.formatMoneda(creditoDto.getTotalAbonos()),
                monedaTransform.formatMoneda(creditoDto.getTotalCredito() - creditoDto.getTotalAbonos())
            };
            modelCredito.addRow(dataRow);
        }

    }

    public void updateTableSeparados() {
        creditoController = new CreditoController();

        listCreditoDtoCredito = creditoController.getListaCreditos(Operaciones.SEPARADO.toString());
        modelSeparado.setRowCount(0);
        for (CreditoDto creditoDto : listCreditoDtoCredito) {
            Object[] dataRow = {
                creditoDto.getId(),
                creditoDto.getNombre(),
                creditoDto.getApellido(),
                monedaTransform.formatMoneda(creditoDto.getTotalCredito()),
                monedaTransform.formatMoneda(creditoDto.getTotalAbonos()),
                monedaTransform.formatMoneda(creditoDto.getTotalCredito() - creditoDto.getTotalAbonos())
            };
            modelSeparado.addRow(dataRow);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jb_Separados;
    private javax.swing.JButton Jb_creditos;
    private javax.swing.JTextField Jt_abonoSeparado;
    private javax.swing.JTextField Tj_abonos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField search1JTextField;
    private javax.swing.JTextField searchJTextrField;
    // End of variables declaration//GEN-END:variables
}
