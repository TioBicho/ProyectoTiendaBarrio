/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.GestorInventario;
import View.VentanaPrincipal;
/**
 *
 * @author TioBicho
 */
public class PrincipalController {
    private GestorInventario modelo;
    private VentanaPrincipal vista;

    public PrincipalController() {
        modelo = new GestorInventario();
        vista = new VentanaPrincipal(this);
        vista.setVisible(true);
    }

    public PrincipalController(GestorInventario modelo) {
        this.modelo = modelo;
        vista = new VentanaPrincipal(this);
        vista.setVisible(true);
    }

    public void abrirVentanaNuevoProducto() {
        new NuevoProductoController(modelo);
    }

    public void abrirVentanaMovimientos() {
        new MovimientosController(modelo);
    }

    public void abrirVentanaInventario() {
        new InventarioController(modelo);
    }
}
