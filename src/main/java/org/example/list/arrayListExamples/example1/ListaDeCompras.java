package org.example.list.arrayListExamples.example1;

import java.util.List;

/**
 * La clase ListaDeCompras contiene el método imprimirListaCompras.
 */

public class ListaDeCompras {
    public void imprimirListaCompras() {
        Producto producto1 = new Producto("Leche");
        Producto producto2 = new Producto("Carne");
        Producto producto3 = new Producto("Arepas");
        Producto producto4 = new Producto("Huevos");

        CarritoCompras carritoCompras = new CarritoCompras();
        carritoCompras.agregarProducto(producto1);
        carritoCompras.agregarProducto(producto2);
        carritoCompras.agregarProducto(producto3);
        carritoCompras.agregarProducto(producto4);
        carritoCompras.eliminarproducto(producto1);

        List<Producto> listaProductos = carritoCompras.lista();
        System.out.println("Los productos comprados son: ");

        for (Producto producto : listaProductos) {
            System.out.println(producto.getNombre());
        }
    }
}
