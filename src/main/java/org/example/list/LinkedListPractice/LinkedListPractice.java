package org.example.list.LinkedListPractice;

import java.util.LinkedList;

public class LinkedListPractice {

    /**
     * La clase LinkedList es una colección que puede contener muchos objetos del mismo tipo, al igual que ArrayList.
     *
     * Este ejemplo hace parte de la Empresa de Logística para envíos
     * Patron de diseño de Comportamiento Mediator
     */
    public void ejecutar(){

        Central central = new Central();
        LinkedList<TransportadorExistente> transportadorExistente = new LinkedList<>();

        transportadorExistente.add(new TransportadorExistente(central,"Rodrigo"));
        transportadorExistente.add(new TransportadorExistente(central,"Carlos"));
        transportadorExistente.add(new TransportadorExistente(central,"Diego"));
        transportadorExistente.add(new TransportadorExistente(central,"Alberto"));

        for (TransportadorExistente conductor: transportadorExistente) {

            conductor.enviarMensajeTransporte("LLevar envio, salir en 15 minutos");
            conductor.recibirMensaje("Confirmado");
            System.out.println("-------------------------");
        }

    }
}
