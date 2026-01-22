/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Categoria;
import Model.GestorInventario;
import View.VentanaNuevoProducto;
import java.util.List;
/**
 *
 * @author TioBicho
 */
public class NuevoProductoController {
    private GestorInventario modelo;
    private VentanaNuevoProducto vista;

    public NuevoProductoController(GestorInventario modelo) {
        this.modelo = modelo;
        this.vista = new VentanaNuevoProducto(this);
        this.vista.setVisible(true);
    }
    
    public List<Categoria> obtenerCategorias() {
        return modelo.getListaCategorias();
    }

    public boolean guardarProducto(String codigo, String nombre, Categoria cat, double precio, int stock) {
        return modelo.agregarProducto(codigo, nombre, cat, precio, stock);
    }
}
