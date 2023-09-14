/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.util;


import javax.swing.JOptionPane;


/**
 *
 * @author alejo
 */
public class NumericValidator {
    
    private boolean flag;
    public NumericValidator() {
    }
    
    
    public void validation(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && evt.getKeyChar() != '\0' && evt.getKeyChar() != '\b') {
            evt.consume(); // Consumir el evento para evitar la entrada de caracteres no numéricos.
            JOptionPane.showMessageDialog(null, "Solo se permiten números.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            flag = true;
        }else{
            flag = false;
        }
    }
    
    public boolean getFlag(){
        return flag;
    }
}
