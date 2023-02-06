package org.example.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

    public void ejecutar() {
        System.out.println("Ejemplo 1");
        PrepararComida prepararComida = new PrepararComida();
        prepararComida.prepararComida();

        System.out.println("Ejemplo 2");
        TerminalTransporte terminal = new TerminalTransporte();
        terminal.agregarVehiculo(new Auto());
        terminal.agregarVehiculo(new Bicicleta());

        terminal.transportarVehiculos();

        System.out.println("Ejemplo 3");

        Reproductor reproductor = new Reproductor();
        reproductor.reproductor();
        reproductor.reproducirCanción(new CanciónPop("Mi 3 canción pop", 123));
        reproductor.reproductor();

    }
}

 class Comida {
    private String nombreComida;
    private int precio;
    private int tiempoPreparacion;

    public Comida(String nombreComida, int precio, int tiempoPreparacion) {
        this.nombreComida = nombreComida;
        this.precio = precio;
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public String getNombreComida() {
        return nombreComida;
    }

    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }
}

class ComidaMar extends Comida{
    public ComidaMar(String nombreComida, int precio, int tiempoPreparacion) {
        super(nombreComida, precio, tiempoPreparacion);
    }

}

class ComidaRegional extends Comida{
    public ComidaRegional(String nombreComida, int precio, int tiempoPreparacion) {
        super(nombreComida, precio, tiempoPreparacion);
    }

}

class PrepararComida {
    void preparandoComida(Comida comida) {
        System.out.println("Preparando comida: " + comida.getNombreComida());
        System.out.println("Tiempo de preparación: " + comida.getTiempoPreparacion() + " minutos");
        System.out.println("Precio: " + comida.getPrecio() + " $");
    }

    void prepararComida() {
        LinkedList<Comida> listaDeComidas = new LinkedList<>();

        Comida comidaMar = new ComidaMar("Mariscos",35000,45);
        listaDeComidas.add(comidaMar);
        Comida comidaRegional = new ComidaRegional("Plato tipico", 40900, 49);
        listaDeComidas.add(comidaRegional);


        for (Comida comida: listaDeComidas) {
            preparandoComida(comida);
        }

        }
}

interface Transportable {
    void transportar();
}

class Auto implements Transportable {
    @Override
    public void transportar() {
        System.out.println("Transportando auto");
    }
}

class Bicicleta implements Transportable {
    @Override
    public void transportar() {
        System.out.println("Transportando bicicleta");
    }
}

class TerminalTransporte {
    private LinkedList<Transportable> vehiculos = new LinkedList<>();

    void agregarVehiculo(Transportable vehiculo) {
        vehiculos.add(vehiculo);
    }

    void transportarVehiculos() {
        for (Transportable vehiculo : vehiculos) {
            vehiculo.transportar();
        }
        System.out.println("Cantidad de vehiculos registrados:" + vehiculos.size());
        vehiculos.remove(1);
        for (Transportable vehiculo : vehiculos) {
            vehiculo.transportar();
        }
        System.out.println("Cantidad de vehiculos actualizada:" + vehiculos.size());
    }
}

/**
 * Ejemplo 3: contexto reproductor de musica
 */


class Canción {
    private String título;
    private int duración;

    public Canción(String título, int duración) {
        this.título = título;
        this.duración = duración;
    }

    public String getTítulo() {
        return título;
    }

    public int getDuración() {
        return duración;
    }
}

class CanciónPop extends Canción {
    private String ritmo = "pop";

    public CanciónPop(String título, int duración) {
        super(título, duración);
    }

    public String getRitmo() {
        return ritmo;
    }
}

class CanciónRock extends Canción {
    private String ritmo = "rock";

    public CanciónRock(String título, int duración) {
        super(título, duración);
    }

    public String getRitmo() {
        return ritmo;
    }
}

class Reproductor {
    void reproducirCanción(Canción canción) {
        System.out.println("Reproduciendo canción: " + canción.getTítulo());
        System.out.println("Duración: " + canción.getDuración() + " segundos");
    }

    void reproductor() {
        LinkedList<Canción> listaDeReproducción = new LinkedList<>();

        Canción canciónPop = new CanciónPop("Mi canción pop", 180);
        listaDeReproducción.add(canciónPop);

        Canción canciónRock = new CanciónRock("Mi canción rock", 240);
        listaDeReproducción.add(canciónRock);

        for (Canción canción : listaDeReproducción) {
            reproducirCanción(canción);
        }
    }
}
