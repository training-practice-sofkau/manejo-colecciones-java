package org.example.list;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    /**
     * Ejemplo de Empresa de Logística para envíos
     * Patron de diseño Creacional Factory
     * Interface Transporte - Barco, Camion, Moto, - TransporteFactory
     */

    public void ejecutar(){

        List<Transporte> transportes = new ArrayList<Transporte>();

        transportes.add(new TransporteFactory().crearTransporte("Camion"));
        transportes.add(new TransporteFactory().crearTransporte("Barco"));
        transportes.add(new TransporteFactory().crearTransporte("Camion"));
        transportes.add(new TransporteFactory().crearTransporte("Moto"));

        for (Transporte transporte:transportes ) {

            transporte.entregar();
        }

    }
}
