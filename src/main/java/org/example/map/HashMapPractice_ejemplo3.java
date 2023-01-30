package org.example.map;

import java.util.HashMap;

public class HashMapPractice_ejemplo3 {

    public  void main() {
        //creo mi coleccion

        HashMap<String, Double> calificaciones = new HashMap<>();
        //agrego mis objetos alli

        calificaciones.put("Juan", 85.0);
        calificaciones.put("María", 90.0);
        calificaciones.put("Pedro", 95.0);
        calificaciones.put("Ana", 80.0);

        //obtengo mis objetos e imprimo

        System.out.println("La calificación de Juan es: " + calificaciones.get("Juan"));
        System.out.println("La calificación de María es: " + calificaciones.get("María"));
        System.out.println("La calificación de Pedro es: " + calificaciones.get("Pedro"));
        System.out.println("La calificación de Ana es: " + calificaciones.get("Ana"));
    }
}
