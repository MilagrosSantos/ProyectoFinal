/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrarventa;

/**
 *
 * @author Milagritos Quintana
 */
public class Descuento {
    private static final double DESCUENTO_NORMAL = 0.0;   
    private static final double DESCUENTO_FRECUENTE = 0.05; 
    private static final double DESCUENTO_VIP = 0.10;   
    
        public static double calcularDescuento(TipoFrecuencia nivelFrecuencia, double monto) {
        double descuento = 0.0;

        switch (nivelFrecuencia) {
            case NORMAL -> descuento = monto * DESCUENTO_NORMAL;
            case FRECUENTE -> descuento = monto * DESCUENTO_FRECUENTE;
            case VIP -> descuento = monto * DESCUENTO_VIP;
        }

        return descuento;
    }

}
