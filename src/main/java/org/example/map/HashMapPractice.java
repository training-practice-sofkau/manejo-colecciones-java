package org.example.map;

public class HashMapPractice {

    public void ejecutar(){
        Olimpiadas olimpiadas = new Olimpiadas("Japon");
        Deportes ciclismo = new Ciclismo("ciclismo");
        Deportes atletismo = new Atletismo("atletismo");
        Persona participante1 = new Participante("Efrain", "Itagui", 1);
        Persona participante2 = new Participante("Lorena", "Medellin", 2);
        Persona participante3 = new Participante("Andres", "Sabaneta", 2);
        Persona asistente1 = new Asistente("Lucas", "bogota", 1);
        Persona asistente2 = new Asistente("jesus", "Cartahgena", 2);

        ciclismo.agregarParticipante(participante1);
        atletismo.agregarParticipante(participante2);
        ciclismo.agregarParticipante(participante3);
        ciclismo.mostrarParticipantes();
        atletismo.mostrarParticipantes();
        olimpiadas.agregarAsistentes(asistente1);
        olimpiadas.mostrarAsistentes();

    }
}
