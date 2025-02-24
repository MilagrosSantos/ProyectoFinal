/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrarventa;

/**
 *
 * @author Milagritos Quintana
 */
public class FrecuenciaCliente {
    
    private int comprasRealizadas;
    private boolean esFrecuente;

    public FrecuenciaCliente(int comprasRealizadas, boolean esFrecuente) {
        this.comprasRealizadas = comprasRealizadas;
        this.esFrecuente = esFrecuente;
    }

    public int getComprasRealizadas() {
        return comprasRealizadas;
    }

    public void setComprasRealizadas(int comprasRealizadas) {
        this.comprasRealizadas = comprasRealizadas;
    }

    public boolean isEsFrecuente() {
        return esFrecuente;
    }

    public void setEsFrecuente(boolean esFrecuente) {
        this.esFrecuente = esFrecuente;
    }

    @Override
    public String toString() {
        return "FrecuenciaCliente{" + "comprasRealizadas=" + comprasRealizadas + ", esFrecuente=" + esFrecuente + '}';
    }

   
}
