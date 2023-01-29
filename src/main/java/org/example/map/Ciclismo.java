package org.example.map;

public class Ciclismo extends Deportes {

    public Ciclismo(String nombre) {
        super(nombre);
    }

    @Override
    public void agregarParticipante(Persona persona) {
        participastesPorDeporte.put(persona.getPuestoOlimpiadas(),persona.getNombre());
        System.out.println("Se agrego el participante: " + persona.toString());
    }

    @Override
    public void mostrarParticipante(Persona persona) {
        System.out.println(persona.toString());
    }

    @Override
    public void mostrarParticipantes() {
        System.out.println(participastesPorDeporte.toString());
    }

}
