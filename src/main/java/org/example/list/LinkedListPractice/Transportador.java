package org.example.list.LinkedListPractice;


abstract class Transportador {

    protected Mediator mediator;
    protected String nombre;

    public Transportador(Mediator mediator, String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public abstract void enviarMensajeTransporte(String mensaje);

    public abstract void recibirMensaje(String mensaje);
}
