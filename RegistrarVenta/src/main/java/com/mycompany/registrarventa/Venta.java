/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrarventa;

/**
 *
 * @author Milagritos Quintana
 */
public class Venta {
    
    RegistrarVenta registrarVenta1, registrarVenta2, registrarVenta3;

    public Venta(RegistrarVenta registrarVenta1, RegistrarVenta registrarVenta2, RegistrarVenta registrarVenta3) {
        this.registrarVenta1 = registrarVenta1;
        this.registrarVenta2 = registrarVenta2;
        this.registrarVenta3 = registrarVenta3;
    }

    public RegistrarVenta getRegistrarVenta1() {
        return registrarVenta1;
    }

    public void setRegistrarVenta1(RegistrarVenta registrarVenta1) {
        this.registrarVenta1 = registrarVenta1;
    }

    public RegistrarVenta getRegistrarVenta2() {
        return registrarVenta2;
    }

    public void setRegistrarVenta2(RegistrarVenta registrarVenta2) {
        this.registrarVenta2 = registrarVenta2;
    }

    public RegistrarVenta getRegistrarVenta3() {
        return registrarVenta3;
    }

    public void setRegistrarVenta3(RegistrarVenta registrarVenta3) {
        this.registrarVenta3 = registrarVenta3;
    }

    @Override
    public String toString() {
        return "Venta{" + "registrarVenta1=" + registrarVenta1 + ", registrarVenta2=" + registrarVenta2 + ", registrarVenta3=" + registrarVenta3 + '}';
    }
    
      public void imprimirRegistrarVenta(){
        System.out.println(registrarVenta1);
        System.out.println(registrarVenta2);
        System.out.println(registrarVenta3);
      
    }
   
}
