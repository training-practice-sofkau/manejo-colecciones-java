package org.example.list;

public class Electrodomesticos {
    private String nombre;

    public Electrodomesticos(String nombre){
        this.nombre=nombre;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
