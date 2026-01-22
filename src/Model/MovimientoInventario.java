/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author TioBicho
 */
public class MovimientoInventario {
private String fecha;
    private String tipo;
    private int cantidad;
    private String nombreProducto;

    public MovimientoInventario(String tipo, int cantidad, String nombreProducto) {
        this.fecha = new Date().toString();
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.nombreProducto = nombreProducto;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    // Getters y Setters
    public void setNombreProducto(String nombreProducto) {   
        this.nombreProducto = nombreProducto;
    }

    @Override
    public String toString() {
        return fecha + " | " + tipo + " | " + cantidad + " | " + nombreProducto;
    }
}
