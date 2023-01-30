package org.example.list.arrayListExamples.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase CarritoCompras implementa los métodos agregarProducto, eliminarProducto de la interfaz ICompras.
 * Además implementa el método lista para retornar la lista de productos comprados.
 */

public class CarritoCompras implements ICompras {
    List<Producto> productos = new ArrayList<>();

    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public void eliminarproducto(Producto producto) {
        productos.remove(producto);
    }

    public List<Producto> lista(){
        return this.productos;
    }
}
