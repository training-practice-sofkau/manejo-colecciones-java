package org.example.list.arrayListExamples.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase ManejoLista. Están definidos los métodos para agregarEquipo a la lista, obtener el número de elementos
 * en la lista y el método lider, donde se obtiene el equipo en la primera posición de la lista.
 */

public class ManejoLista {
    List<Equipo> equipos = new ArrayList<>();
    public void agregarEquipo(Equipo equipo){
        equipos.add(equipo);
    }

    public int numeroEquipos(){
        return this.equipos.size();
    }

    public Equipo lider(){
        return equipos.get(0);
    }

    public List<Equipo> getEquipos(){
        return this.equipos;
    }
}
