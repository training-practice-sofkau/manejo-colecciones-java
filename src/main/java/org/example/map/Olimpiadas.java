package org.example.map;

import java.util.HashMap;

public class Olimpiadas {

    private String nombre;
    HashMap<Integer,String> asistentes;


    public Olimpiadas(String nombre) {
        this.nombre = nombre;
        asistentes = new HashMap<Integer,String>();
        System.out.println(nombre);
    }

    public void agregarAsistentes(Persona Persona){
        asistentes.put(Persona.getPuestoOlimpiadas(), Persona.getNombre());
        System.out.println("Se agrego el asistente: " + asistentes.toString());
    }

    public void mostrarAsistentes(){
        System.out.println(asistentes.toString());
    }

    @Override
    public String toString() {
        return "Olimpiadas{" +
                "nombre='" + nombre + '\'' +
                ", asistentes=" + asistentes +
                '}';
    }
}
