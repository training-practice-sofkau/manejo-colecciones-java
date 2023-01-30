package org.example.map;

import java.util.HashMap;

public class HashMapPractice_ejemplo2 {

    public  void main() {
        //creo mi coleccion
        HashMap<String, Double> precios = new HashMap<>();
        //agrago mis objetos , con sus respectivas clave-valor
        precios.put("Leche", 1.50);
        precios.put("Pan", 2.00);
        precios.put("Manzana", 0.75);
        precios.put("Pera", 0.90);

    //imprimo mi coleccion
        System.out.println("El precio de la leche es: $" + precios.get("Leche"));
        System.out.println("El precio del pan es: $" + precios.get("Pan"));
        System.out.println("El precio de las manzanas es: $" + precios.get("Manzana"));
        System.out.println("El precio de las peras es: $" + precios.get("Pera"));
    }
}
