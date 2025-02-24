/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrarventa;

/**
 *
 * @author Milagritos Quintana
 */
public class PruevaRegistrarVenta {
    public static void main(String[] args) {
        
         RegistrarVenta registrarVenta1 = new RegistrarVenta("Golosinas",2,"23/02/2025","C001","C004");
         RegistrarVenta registrarVenta2 = new RegistrarVenta("Cereales",1,"23/02/2025","C002","C002");
         RegistrarVenta registrarVenta3 = new RegistrarVenta("Queso",4,"23/02/2025","C003","C001");
         
         PruevaRegistrarVenta pruevaRegistrarVenta = new PruevaRegistrarVenta(registrarVenta1, registrarVenta2, registrarVenta3);
        
        
        PruevaRegistrarVenta.imprimirRegistrarVenta();

        
    }
    
}
