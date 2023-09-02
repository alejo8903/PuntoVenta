/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intesoft.puntoventa.util;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author alejo
 */
public class MonedaTransform {
    public String formatMoneda(double valor){
       // Configura el Locale para Colombia (es-CO) para el peso colombiano (COP).
        Locale locale = new Locale.Builder().setLanguage("es").setRegion("CO").build();
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(locale);

        // Personaliza el formato de moneda según tus necesidades.
        formatoMoneda.setMaximumFractionDigits(0); // Número máximo de decimales.
        formatoMoneda.setMinimumFractionDigits(0); // Número mínimo de decimales.

        // Formatea el valor numérico como moneda y devuélvelo como una cadena con el formato colombiano.
        return formatoMoneda.format(valor);
         
    }
    public double transfrormMoneda(String moneda){
        String signo = "$ ";
        String signo2 = "$";
        if (moneda.isBlank() || moneda.equals(signo) || moneda.equals(signo2)) {
            moneda="0";
        }
        String numeroLimpio = moneda.replaceAll("[^\\d.]", "").replace(".", ""); // Eliminar todo excepto dígitos y el punto decimal
        double numero = Double.parseDouble(numeroLimpio);
        
        return numero;
    }
}
