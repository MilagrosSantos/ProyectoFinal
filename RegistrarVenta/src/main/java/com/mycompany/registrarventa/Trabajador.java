/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrarventa;

/**
 *
 * @author Milagritos Quintana
 */
public class Trabajador {
    private String nombre;
    private String dni;
    private String puesto;
    private String telefono;
    private String turno;
    private String codigoEmpleado;

    public Trabajador(String nombre, String dni, String puesto, String telefono, String turno, String codigoEmpleado) {
        this.nombre = nombre;
        this.dni = dni;
        this.puesto = puesto;
        this.telefono = telefono;
        this.turno = turno;
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", dni=" + dni + ", puesto=" + puesto + ", telefono=" + telefono + ", turno=" + turno + ", codigoEmpleado=" + codigoEmpleado + '}';
    }
    

    
}
