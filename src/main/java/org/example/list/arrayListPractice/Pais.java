package org.example.list.arrayListPractice;

public class Pais {
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String nombre() {
        return nombre;
    }

    public Pais setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public String toString() {
        return  this.nombre;
    }
}
