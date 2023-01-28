package org.example.list;

public interface Mediator {
    /**
     * En su implementacieon envia mensaje al Conductor correspondiente
     */
    void enviarMensajeTransporte(String mensaje, Transportador transportador);

    /**
     *
     * En su implemtentación agrega el envio
     */
    void agregarTransportador(Transportador transportador);

}
