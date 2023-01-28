package org.example.list;

import java.util.LinkedList;

public class LinkedListPractice {

    /**
     * Este ejemplo hace parte de la Empresa de Logística para envíos
     * Patron de diseño de Comportamiento Mediator
     * Interface Mediator - Barco, Camion, Moto, - TransporteFactory
     */
    public void ejecutar(){

        Central central = new Central();
        LinkedList<TransportadorExistente> transportadorExistente = new LinkedList<>();

        transportadorExistente.add(new TransportadorExistente(central,"Rodrigo"));
        transportadorExistente.add(new TransportadorExistente(central,"Carlos"));
        transportadorExistente.add(new TransportadorExistente(central,"Diego"));
        transportadorExistente.add(new TransportadorExistente(central,"Alberto"));

        for (TransportadorExistente conductor: transportadorExistente) {
            central.agregarTransportador(conductor);
            conductor.enviarMensajeTransporte("LLevar envio, salir en 15 minutos");
            System.out.println("-------------------------");
        }

    }
}
