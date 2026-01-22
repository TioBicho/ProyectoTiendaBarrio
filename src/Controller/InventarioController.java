/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.GestorInventario;
import Model.ProductoBase;
import View.VentanaInventario;
import java.util.List;
/**
 *
 * @author TioBicho
 */
public class InventarioController {
    private GestorInventario modelo;
    private VentanaInventario vista;

    public InventarioController(GestorInventario modelo) {
        this.modelo = modelo;
        this.vista = new VentanaInventario(this);
        this.vista.setVisible(true);
    }

    public List<ProductoBase> listarProductos() {
        return modelo.getListaProductos();
    }
    
    public ProductoBase buscarProducto(String criterio) {
        return modelo.buscarProducto(criterio);
    }
}