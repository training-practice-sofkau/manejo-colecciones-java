package org.example.set;
import java.util.*;

public class HashSet_ejemplo3 {

    public static  void main() {
        // creo mi coleccion con la clase que necesite
        HashSet<Avion> aviones = new HashSet<>();

        // agrego mis objetos(aviones) a la coleccion
        aviones.add(new Avion("Boeing 747", 400));
        aviones.add(new Avion("Airbus A380", 853));
        aviones.add(new Avion("Boeing 787", 330));

        // imprimo la cantidad de aviones de mi coleccion
        System.out.println("La cantidad de mis aviones es: " + aviones.size());

        // busco un avión en mi coleccion
        Avion busqueda = new Avion("Boeing 747", 400);
        if (aviones.contains(busqueda)) {
            System.out.println("El avión Boeing 747 Si se encuentra en la coleccion");
        } else {
            System.out.println("El avión  Boeing 747 No se encuentra en la coleccion");
        }

        // elimino un avión de mi coleccion
        aviones.remove(busqueda);

        // verifico si el avión ha sido eliminado en mi coleccion
        if (aviones.contains(busqueda)) {
            System.out.println("El avión si se encuentra aun dentro de la coleccion :)");
        } else {
            System.out.println("El avión no se encuentra ya en la coleccion :( ");
        }
    }
}

//creo la clase que me construya mis objetos
class Avion {
    private String modelo;
    private int capacidad;

    public Avion(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
}
