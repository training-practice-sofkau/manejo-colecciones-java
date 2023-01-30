package org.example.list;

public class TransportadorExistente extends Transportador{

    public TransportadorExistente(Mediator mediator, String nombre) {
        super(mediator, nombre);
    }

    @Override
    public void enviarMensajeTransporte(String mensaje) {
        System.out.println(nombre + ": Enviando mensaje = " + mensaje);
        mediator.enviarMensajeTransporte(mensaje, this);

    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println(nombre + ": Mensaje recibido: " + mensaje);
    }
}
