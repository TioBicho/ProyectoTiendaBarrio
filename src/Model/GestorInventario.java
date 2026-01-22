/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author TioBicho
 */
import java.util.ArrayList;
import java.util.List;

public class GestorInventario {
    private List<ProductoBase> listaProductos;
    private List<Categoria> listaCategorias;
    private List<MovimientoInventario> historialMovimientos;

    public GestorInventario() {
        this.listaProductos = new ArrayList<>();
        this.listaCategorias = new ArrayList<>();
        this.historialMovimientos = new ArrayList<>();
        
        // Datos de prueba
        listaCategorias.add(new Categoria("Bebidas"));
        listaCategorias.add(new Categoria("Abarrotes"));
        listaCategorias.add(new Categoria("Aseo"));
    }

    // --- PRODUCTOS ---
    public boolean agregarProducto(String codigo, String nombre, Categoria cat, double precio, int stockInicial) {
        if (buscarProducto(codigo) != null) return false;
        Producto nuevo = new Producto(codigo, nombre, cat, precio, stockInicial);
        return listaProductos.add(nuevo);
    }

    public ProductoBase buscarProducto(String criterio) {
        for (ProductoBase p : listaProductos) {
            if (p.getCodigo().equalsIgnoreCase(criterio) || p.getNombre().equalsIgnoreCase(criterio)) {
                return p;
            }
        }
        return null;
    }
    
    public List<ProductoBase> getListaProductos() { return listaProductos; }
    public List<Categoria> getListaCategorias() { return listaCategorias; }

    // --- MOVIMIENTOS SIMPLIFICADOS ---
    public boolean registrarMovimiento(String codigoProd, String tipo, int cantidad) {
        ProductoBase p = buscarProducto(codigoProd);
        if (p == null) return false;

        try {
            if (tipo.equalsIgnoreCase("ENTRADA")) {
                p.setStock(p.getStock() + cantidad);
            } else {
                // Validación stock negativo
                if (p.getStock() - cantidad < 0) return false;
                p.setStock(p.getStock() - cantidad);
            }
            
            // Guardamos movimiento simple
            historialMovimientos.add(new MovimientoInventario(tipo, cantidad, p.getNombre()));
            return true;
            
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
