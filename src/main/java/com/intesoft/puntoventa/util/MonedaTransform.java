/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.util;

import java.text.NumberFormat;

/**
 *
 * @author alejo
 */
public class MonedaTransform {
    public String formatMoneda(double valor){
         NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance();
         return formatoMoneda.format(valor);
         
    }
    public double transfrormMoneda(String moneda){
        String numeroLimpio = moneda.replaceAll("[^\\d.]", "").replace(".", ""); // Eliminar todo excepto dígitos y el punto decimal
        double numero = Double.parseDouble(numeroLimpio)/100;
        
        return numero;
    }
}
