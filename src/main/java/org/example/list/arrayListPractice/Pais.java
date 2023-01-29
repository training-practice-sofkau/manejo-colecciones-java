package org.example.list.arrayListPractice;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pais)) return false;
        Pais pais = (Pais) o;
        return nombre.equals(pais.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return  this.nombre;
    }
}
