package org.example.colecciones.clases;

import java.util.ArrayList;

public class Cliente extends Persona{

    ArrayList<Producto> carritoDeCompra;

    public Cliente(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.carritoDeCompra = new ArrayList<>();
    }

    public void agregarACarrito(Producto producto){
        this.carritoDeCompra.add(producto);
    }

    public double calcularValorPagar (){
        double total = 0;
        for (Producto producto:this.carritoDeCompra) {
            total += producto.getValor() * producto.getCantidad();
        }
        return total;
    }

    @Override
    public String toString() {
        return this.getCedula() + " - " + this.getNombre() + " " + this.getApellido();
    }
}
