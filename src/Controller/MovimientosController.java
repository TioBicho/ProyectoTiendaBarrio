/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.GestorInventario;
import View.VentanaMovimientos;

/**
 *
 * @author TioBicho
 */
public class MovimientosController {
    private GestorInventario modelo;
    private VentanaMovimientos vista;

    public MovimientosController(GestorInventario modelo) {
        this.modelo = modelo;
        this.vista = new VentanaMovimientos(this);
        this.vista.setVisible(true);
    }

    public boolean registrarEntrada(String codigo, int cantidad) {
        return modelo.registrarMovimiento(codigo, "ENTRADA", cantidad);
    }

    public boolean registrarSalida(String codigo, int cantidad) {
        return modelo.registrarMovimiento(codigo, "SALIDA", cantidad);
    }
}
