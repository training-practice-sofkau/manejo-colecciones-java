package org.example.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice {

    public void ejemploUnoHashMapPractice() {
        //Creo un nuevo map
        HashMap<String, Persona> personaHashMap = new HashMap<>();

        //Agrego elementos al map
        personaHashMap.put("Miguel", new Persona("Miguel", 26));
        personaHashMap.put("Pedro", new Persona("Pedro", 35));
        personaHashMap.put("Laura", new Persona("Laura", 32));

        //Imprimir Elementos
        System.out.println(personaHashMap.get("Miguel").getNombre() + " " + personaHashMap.get("Miguel").getEdad() + " Años");
        System.out.println(personaHashMap.get("Pedro").getNombre() + " " + personaHashMap.get("Pedro").getEdad() + " Años");
        System.out.println(personaHashMap.get("Laura").getNombre() + " " + personaHashMap.get("Laura").getEdad() + " Años");

        //Actualizar un valor del elemento
        personaHashMap.put("Miguel", new Persona("Miguel", 27));
        System.out.println(personaHashMap.get("Miguel").getNombre() + " " + personaHashMap.get("Miguel").getEdad() + " Años");

        //Eliminar elemento
        personaHashMap.remove("Laura");

        //Comprobar si el map tiene una clave especifica
        boolean hashLaura = personaHashMap.containsKey("Laura");
        System.out.println("Laura esta dentro del map?: " + hashLaura);

        if(personaHashMap.containsKey("Miguel")) {
            System.out.println(personaHashMap.get("Miguel").getNombre() + " tiene " + personaHashMap.get("Miguel").getEdad() + " Años");
        }else {
            System.out.println("El hash no contiene esta clave");

        }

    }

    public void ejemploDosHashMapPractice() {
        HashMap<Integer, Empleado> empleadoHashMap = new HashMap<>();

        empleadoHashMap.put(1, new Empleado("Alirio",1000000));
        empleadoHashMap.put(2, new Empleado("Alberto",1500000));
        empleadoHashMap.put(3, new Empleado("Mario",2000000));

        for (Integer indice: empleadoHashMap.keySet()) {
            System.out.println(empleadoHashMap.get(indice).getNombre());
        }


    }

    public void ejemploTresHashMapPractice() {
        Scanner in = new Scanner(System.in);
        int precioLibro;
        HashMap<Integer, Libro> libroHashMap = new HashMap<>();

        libroHashMap.put(1, new Libro("Clean Code","Robert C. Martin",100000));
        libroHashMap.put(2, new Libro("Design Patterns","Erich Gamma, John Vlissides, Ralph Johnson, Richard Helm",150000));
        libroHashMap.put(3, new Libro("El programador pragmático","Dave Thomas, Andy Hunt",80000));

        for (Integer indice: libroHashMap.keySet()) {
            System.out.println(libroHashMap.get(indice).getTitulo() + " - " + libroHashMap.get(indice).getEscritor());
        }

        System.out.println("\nDigite del libro que queire saber el precio:");
        precioLibro = in.nextInt();
        if (libroHashMap.containsKey(precioLibro)) {
            System.out.println(libroHashMap.get(precioLibro).getTitulo() + " tiene un precio de $" + libroHashMap.get(precioLibro).getPrecio() + " pesos");
        }else {
            System.out.println("El hash no contiene esta clave");
        }

    }
}
