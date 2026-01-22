/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author TioBicho
 */
public class Producto extends ProductoBase {

    private static final int UMBRAL_BAJO_STOCK = 5;

    public Producto(String codigo, String nombre, Categoria categoria, double precio, int stock) {
        super(codigo, nombre, categoria, precio, stock);
    }

    @Override
    public String mostrarDetalles() {
        // Acceso correcto a través de métodos públicos
        return "Prod: " + getNombre() + " [" + getCodigo() + "] - Stock: " + getStock();
    }

    @Override
    public boolean verificarStockBajo() {
        return getStock() <= UMBRAL_BAJO_STOCK;
    }
}
