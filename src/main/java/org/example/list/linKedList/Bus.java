package org.example.list.linKedList;

public class Bus extends Buses{

    private static int idBus = 0;

    public Bus(String placa, String ruta) {
        super(placa, ruta);
        idBus++;
    }

    @Override
    public void ingresoPasajeros(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }

    @Override
    public void salidaPasajeros(Pasajero pasajero) {
        pasajeros.remove(pasajero);
    }

    @Override
    public void mostrarPasajeros() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Bus{" +
                "pasajeros=" + pasajeros +
                "} " + super.toString();
    }
}
