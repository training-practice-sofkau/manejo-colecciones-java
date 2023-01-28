package org.example.list.linKedList;

public class LinkedListPractice {

    public void  ejecurtar(){
        Parqueadero parqueadero = new Parqueadero("Parqueadero robledo");
        Bus bus = new Bus("pjk234","robledo");
        Bus bus1 = new Bus("ghj456","Itagui");
        parqueadero.ingresoBuses(bus1);
        parqueadero.salidaBuses(bus);
        parqueadero.mostrarBuses();
        Pasajero pasajero = new Pasajero("Efrain");
        Pasajero pasajero1 = new Pasajero("jesus");
        bus.ingresoPasajeros(pasajero);
        bus.ingresoPasajeros(pasajero1);
        parqueadero.mostrarBuses();
    }
}
