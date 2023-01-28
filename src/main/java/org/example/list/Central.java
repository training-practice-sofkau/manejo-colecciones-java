package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class Central implements Mediator{

    private List<Transportador> transportadores;

    public Central() {
        transportadores = new ArrayList<>();
    }

    @Override
    public void enviarMensajeTransporte(String mensaje, Transportador transportador) {
        for (Transportador conductor : transportadores) {
            if (conductor != transportadores) {
                conductor.recibirMensaje(mensaje);
            }
        }

    }

    @Override
    public void agregarTransportador(Transportador transportador) {
        transportadores.add(transportador);

    }
}
