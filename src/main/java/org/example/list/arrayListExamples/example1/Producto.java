package org.example.list.arrayListExamples.example1;

/**
 * La clase producto contiene un atributo nombre y su respectivos métodos get y set.
 * Esta clase me permite crear instancias que luego serán agregadas a una lista de compras.
 */

public class Producto {
    private String nombre;

    public Producto (String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
