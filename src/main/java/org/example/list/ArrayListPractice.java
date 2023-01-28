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

        List<TransporteFactory> transporteFactories = new ArrayList<TransporteFactory>();

        transporteFactories.add(new TransporteFactory().crearTransporte("Camion").entregar());
        transporteFactories.add(new TransporteFactory().crearTransporte("Barco").entregar());
        transporteFactories.add(new TransporteFactory().crearTransporte("Moto").entregar());

    }
}
