package org.example.list.ArrayLits;

public abstract class Persona {
    private String nombre;

    public String getNombre() {
        return nombre;
    }


    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public abstract void mostrarPersona();

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

