package org.example.list.arrayListExamples.example2;

/**
 * Clase Equipo. Contiene un atributo tipo String nombre.
 * Están definidos los métodos get y set para el atributo nombre.
 */

public class Equipo {
    private String nombre;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
