package org.example.list.linKedList;

import java.util.LinkedList;
import java.util.List;

public abstract class Parqueaderos {
    private String nombreParqueadero;
    List<Buses> busesDentro;
    List<Buses> busesAfuera;

    public Parqueaderos(String nombreParqueadero) {
        this.nombreParqueadero = nombreParqueadero;
        busesAfuera = new LinkedList<>();
        busesDentro = new LinkedList<>();
    }

    public abstract void ingresoBuses(Buses buses);

    public abstract void salidaBuses(Buses buses);

    public abstract void mostrarBuses();

    @Override
    public String toString() {
        return "Parqueaderos{" +
                "nombreParqueadero='" + nombreParqueadero + '\'' +
                ", busesDentro=" + busesDentro +
                ", busesAfuera=" + busesAfuera +
                '}';
    }
}
