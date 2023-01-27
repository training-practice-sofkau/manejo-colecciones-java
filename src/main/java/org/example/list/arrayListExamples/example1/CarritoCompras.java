package org.example.list.arrayListExamples.example1;

import java.util.ArrayList;
import java.util.List;

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
