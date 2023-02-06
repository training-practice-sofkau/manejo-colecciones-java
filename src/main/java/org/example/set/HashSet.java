package org.example.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashSet {
    public static void ejecutar(){

        List<Hotel> hotelList = new ArrayList<>();

        hotelList.add(new Hotel("Italia, Roma", 30000, "hotel1",4));
        hotelList.add(new Hotel("", 80000, "hotel2",5));

        List<Museo> museoList = new ArrayList<>();
        museoList.add(new Museo("Francia, Paris", 50000, "Acropolis", "historia"));
        museoList.add(new Museo("Francia, Paris", 80000, "Acropolis2", "historia2"));

        HashMap<String, DestinoTuristico> destinos = new HashMap<>();


        for (Hotel hotel : hotelList) {
            destinos.put(hotel.nombre, hotel);
            System.out.println(hotelList);
        }

        for (Museo museo : museoList) {
            destinos.put(museo.nombre, museo);
            System.out.println(museoList);
        }

    }
}

abstract  class  DestinoTuristico{
    String destino;
    double costo;

    String nombre;


}

class  Hotel extends DestinoTuristico{
    int cantidadEstrellas;

    public Hotel(String destino, double costo, String nombre, int cantidadEstrellas) {

        this.destino = destino;
        this.costo = costo;
        this.nombre = nombre;
        this.cantidadEstrellas = cantidadEstrellas;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "cantidadEstrellas=" + cantidadEstrellas +
                ", destino='" + destino + '\'' +
                ", costo=" + costo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

class  Museo extends  DestinoTuristico{
    String tematica;

    public Museo(String destino, double costo, String nombre, String tematica) {
        this.destino = destino;
        this.costo = costo;
        this.nombre = nombre;
        this.tematica = tematica;
    }

    @Override
    public String toString() {
        return "Museo{" +
                "tematica='" + tematica + '\'' +
                ", destino='" + destino + '\'' +
                ", costo=" + costo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
