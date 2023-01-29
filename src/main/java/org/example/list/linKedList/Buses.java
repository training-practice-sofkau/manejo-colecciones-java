package org.example.list.linKedList;

import java.util.LinkedList;
import java.util.List;

public abstract class Buses {

    private String placa;
    private String ruta;
    List<Pasajero> pasajeros;

    public Buses(String placa, String ruta) {
        this.placa = placa;
        this.ruta = ruta;
        pasajeros = new LinkedList<>();
    }

    public abstract void ingresoPasajeros(Pasajero pasajero);

    public abstract void salidaPasajeros(Pasajero pasajero);

    public abstract void mostrarPasajeros();

    @Override
    public String toString() {
        return "Buses{" +
                "placa='" + placa + '\'' +
                ", ruta='" + ruta + '\'' +
                '}';
    }
}
