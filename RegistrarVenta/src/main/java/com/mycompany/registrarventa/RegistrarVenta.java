/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrarventa;

/**
 *
 * @author Milagritos Quintana
 */
public class RegistrarVenta {

   private String producto;
   private int cantidad;
   private String fechaVenta;
   private String codCliente;
   private String codTrabajador;

    public RegistrarVenta(String producto, int cantidad, String fechaVenta, String codCliente, String codTrabajador) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.fechaVenta = fechaVenta;
        this.codCliente = codCliente;
        this.codTrabajador = codTrabajador;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getCodTrabajador() {
        return codTrabajador;
    }

    public void setCodTrabajador(String codTrabajador) {
        this.codTrabajador = codTrabajador;
    }

    @Override
    public String toString() {
        return "RegistrarVenta{" + "producto=" + producto + ", cantidad=" + cantidad + ", fechaVenta=" + fechaVenta + ", codCliente=" + codCliente + ", codTrabajador=" + codTrabajador + '}';
    }
   
}
