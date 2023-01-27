package org.example.list.arrayListExamples.example2;

/**
 * La clase AccesoEquipos permite crear instancias de la clase Equipo, agregarlos a una lista.
 * Cada equipo se agrega a la lista mediante el método agregarEquipo de la clase ManejoLista.
 * Tambíen se utilizan los métodos numeroEquipos de la clase ManejoLista, para obtener el número de elementos en la lista.
 * Y el método lider de la clase ManejoLista, para obtener el equipo que está en la primera posición de la lista
 */

public class AccesoEquipos {
    public void manipularEquipos(){

        String lider;
        int numeroEquipos;
        ManejoLista manejoLista = new ManejoLista();

        Equipo equipo1 = new Equipo("Atletico Nacional");
        Equipo equipo2 = new Equipo("River Plate");
        Equipo equipo3 = new Equipo("Santos");
        Equipo equipo4 = new Equipo("Olimpia");

        manejoLista.agregarEquipo(equipo1);
        manejoLista.agregarEquipo(equipo3);
        manejoLista.agregarEquipo(equipo4);
        manejoLista.agregarEquipo(equipo2);

        System.out.println("El número de equipos en la lista es " + manejoLista.numeroEquipos());
        System.out.println("El equipo que marcha lider del grupo es " + manejoLista.lider().getNombre());

    }
}
