package org.example.list.linKedList;

public class Parqueadero extends Parqueaderos {

    private static int idParqueadero = 0;

    public Parqueadero(String nombreParqueadero) {
        super(nombreParqueadero);
        idParqueadero++;
    }

    @Override
    public void ingresoBuses(Buses bus) {
        busesAfuera.remove(bus);
        busesDentro.add(bus);
        System.out.println("Ingreso al parqueadero el bus: " + bus);
    }

    @Override
    public void salidaBuses(Buses bus) {
        busesDentro.remove(bus);
        busesAfuera.add(bus);
        System.out.println("Salió del parqueadero el bus: " + bus);
    }

    @Override
    public void mostrarBuses() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Parqueadero{" +
                "busesDentro=" + busesDentro +
                "} " + super.toString();
    }
}
