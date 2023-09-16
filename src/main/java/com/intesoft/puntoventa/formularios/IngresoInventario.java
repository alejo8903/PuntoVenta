/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.intesoft.puntoventa.formularios;

import com.intesoft.puntoventa.controller.InventarioController;
import com.intesoft.puntoventa.controller.MaestroController;
import com.intesoft.puntoventa.entity.Inventario;
import com.intesoft.puntoventa.entity.Maestro;
import com.intesoft.puntoventa.util.MonedaTransform;
import javax.swing.JOptionPane;

/**
 *
 * @author alejo
 */
public class IngresoInventario extends javax.swing.JDialog {

    /**
     * Creates new form CreacionProductos
     */
    Maestro maestro;
    ControlInventario controlInventario;
    MonedaTransform monedaTransform;
    public IngresoInventario() {
        initComponents();
    }
    public IngresoInventario(ControlInventario controlInventario) {
        this.controlInventario = controlInventario;
        this.maestro = new Maestro();
        this.monedaTransform = new MonedaTransform();
        initComponents();
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
        jTextCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextTipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextTalla = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextVCompra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextIva = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextTCompra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextGanancia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextVVenta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextColor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextCantidad = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();

        setTitle("Control Inventario");
        setResizable(false);

        jLabel1.setText("Codigo");

        jLabel2.setText("Tipo");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Talla");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crear.png"))); // NOI18N
        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor Compra");

        jTextVCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextVCompraKeyTyped(evt);
            }
        });

        jLabel6.setText("IVA");

        jTextIva.setText("19");

        jLabel7.setText("Total Compra");

        jTextTCompra.setEditable(false);

        jLabel8.setText("% Ganancia");

        jTextGanancia.setText("40");
        jTextGanancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextGananciaKeyTyped(evt);
            }
        });

        jLabel9.setText("Valor Venta");

        jTextVVenta.setEditable(false);

        jButton1.setText("Validar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Color");

        jLabel11.setText("Cantidad");

        jCheckBox1.setText("IVA");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jTextTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(62, 62, 62)
                        .addComponent(jTextColor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jTextVVenta)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextIva, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1))
                            .addComponent(jTextVCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jTextVCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jCheckBox1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextTCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextVVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String vVenta = this.jTextVVenta.getText();
        String iva = this.jTextIva.getText();
        String totalCompra = this.jTextTCompra.getText();
        String ganancia = this.jTextGanancia.getText();
        String vCompra = this.jTextVCompra.getText();
        String cantidad = this.jTextCantidad.getText();
        
        if(vVenta.isBlank() || iva.isBlank() || totalCompra.isBlank() || ganancia.isBlank() ||
                vCompra.isBlank() || cantidad.isBlank() || cantidad =="0" || this.maestro == null){
            
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar diligenciados", "Advertencia", JOptionPane.WARNING_MESSAGE);
            
        }else{
            try {
            InventarioController inventarioController = new InventarioController();
            Inventario inventario = new Inventario();
            inventario.setCodigo(this.maestro);
            inventario.setCantidad(Integer.parseInt(this.jTextCantidad.getText()));
            inventario.setValorCompra(monedaTransform.transfrormMoneda(this.jTextVCompra.getText()));
            inventario.setIva(Float.parseFloat(this.jTextIva.getText())/100);
            inventario.setTotalCompra(monedaTransform.transfrormMoneda(this.jTextTCompra.getText()));
            inventario.setPorcentajeGanancia(Float.parseFloat(this.jTextGanancia.getText())/100);
            inventario.setValorVenta(monedaTransform.transfrormMoneda(this.jTextVVenta.getText()));
            inventarioController.insertInventario(inventario);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Hubo un error en el ingreso del (los) productos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
                
            }
            controlInventario.updateTable();
            JOptionPane.showMessageDialog(null, "Ingresado con exito", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codigo = jTextCodigo.getText()+jTextTipo.getText();
        MaestroController maestroController = new MaestroController();
        this.maestro = maestroController.getProducto(codigo);
        if( this.maestro == null){
            JOptionPane.showMessageDialog(null, "El producto solicitado no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        this.jTextDescripcion.setText(this.maestro.getDescripcion());
        this.jTextTalla.setText(this.maestro.getTalla());
        this.jTextColor.setText(this.maestro.getColor());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextVCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextVCompraKeyTyped
        String valorCompra = jTextVCompra.getText();
        String iva = jTextIva.getText();
        boolean flag = false;
        if (valorCompra.isBlank()) {
            valorCompra = "0";
            flag = true;
        }
        if (iva.isBlank()) {
            iva = "0";
        }
        char []p={'1','2','3','4','5','6','7','8','9','0','\b','\0'};
        int b=0;
        for(int i=0; i<p.length ;i++){
            if (p[i] == evt.getKeyChar()){
                String letra = String.valueOf(evt.getKeyChar());
                String actual = this.jTextVCompra.getText();
                evt.consume();
                if (flag) {
                    this.jTextVCompra.setText(monedaTransform.formatMoneda(Double.parseDouble(letra)));
                    this.jTextTCompra.setText(this.monedaTransform.formatMoneda(calculoValor(Double.parseDouble(letra), Double.parseDouble(iva))));
                    calculateTotalVenta("");
                }else{
                    String monedalimpia = String.valueOf(monedaTransform.transfrormMoneda(actual));
                    monedalimpia= monedalimpia.substring(0,monedalimpia.length()-2);
                    this.jTextVCompra.setText(monedaTransform.formatMoneda(Double.parseDouble(monedalimpia+letra)));
                    this.jTextTCompra.setText(this.monedaTransform.formatMoneda(
                                    calculoValor(Double.parseDouble(monedalimpia+letra), Double.parseDouble(iva))));
                    calculateTotalVenta("");
                }
                return;
            }

        }
        
        evt.consume();
        JOptionPane.showMessageDialog(null, "No es un caracter valido", "Advertencia", JOptionPane.WARNING_MESSAGE);
        
            
        
    }//GEN-LAST:event_jTextVCompraKeyTyped

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        if(this.jCheckBox1.isSelected()){
            this.jTextIva.setText("0");
        }else{
            this.jTextIva.setText("19");
        }
        String vCompra = this.jTextVCompra.getText();
        if(vCompra.isBlank()){
            return;
        }
        if (vCompra != "0") {
            String monedalimpia = String.valueOf(monedaTransform.transfrormMoneda(vCompra));
                    monedalimpia= monedalimpia.substring(0,monedalimpia.length()-2);
                    this.jTextVCompra.setText(monedaTransform.formatMoneda(Double.parseDouble(monedalimpia)));
                    this.jTextTCompra.setText(this.monedaTransform.formatMoneda(
                                    calculoValor(Double.parseDouble(monedalimpia), Double.parseDouble(jTextIva.getText()))));
        }
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void jTextGananciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextGananciaKeyTyped
        String tecla = String.valueOf(evt.getKeyChar());
        char []p={'1','2','3','4','5','6','7','8','9','0','\b','\0'};
        int b=0;
        for(int i=0; i<p.length ;i++){
            if (evt.getKeyChar() == '\b' || evt.getKeyChar() == '\0' ){
               tecla = "";
               calculateTotalVenta(tecla);
                return;
            }
            if (p[i] == evt.getKeyChar()){
                calculateTotalVenta(tecla);
                return;
                
            }
            
        }
        
        evt.consume();
        JOptionPane.showMessageDialog(null, "No es un caracter valido", "Advertencia", JOptionPane.WARNING_MESSAGE);
        
        
    }//GEN-LAST:event_jTextGananciaKeyTyped
    
    public double calculoValor(double valor, double porcentaje){
        double resultado = 0;
        String conversor = "";
        resultado = (valor *((porcentaje/100)+1));
        return resultado;
    }
    
    public void calculateTotalVenta(String tecla){
        if (tecla.isBlank()) {
            tecla="";
        }
        
        String totalCompra = jTextTCompra.getText();
        String ganancia = jTextGanancia.getText()+tecla;
        if(totalCompra.isBlank()){
            jTextVVenta.setText(monedaTransform.formatMoneda(0));
        }else if(ganancia == "0" || ganancia.isBlank()){
            this.jTextVVenta.setText(monedaTransform.formatMoneda(0));
            JOptionPane.showMessageDialog(null, "la ganancia no puede ser 0 (cero)", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else{
  
            jTextVVenta.setText(monedaTransform.formatMoneda(monedaTransform.transfrormMoneda(totalCompra)*((Double.parseDouble(ganancia)/100)+1)));
        }
    }
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
            java.util.logging.Logger.getLogger(IngresoInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextColor;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JTextField jTextGanancia;
    private javax.swing.JTextField jTextIva;
    private javax.swing.JTextField jTextTCompra;
    private javax.swing.JTextField jTextTalla;
    private javax.swing.JTextField jTextTipo;
    private javax.swing.JTextField jTextVCompra;
    private javax.swing.JTextField jTextVVenta;
    // End of variables declaration//GEN-END:variables

}
