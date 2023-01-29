package org.example.map;

import java.util.HashMap;

public abstract class Deportes {
    private String nombre;
    HashMap <Integer,String> participastesPorDeporte;

    public Deportes(String nombre) {
        this.nombre = nombre;
        participastesPorDeporte = new HashMap<Integer,String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Deportes{" +
                "nombre='" + nombre + '\'' +
                ", participastesPorDeporte=" + participastesPorDeporte +
                '}';
    }

    public abstract void agregarParticipante(Persona persona);
    public abstract void mostrarParticipante(Persona persona);

    public abstract void mostrarParticipantes();
}
