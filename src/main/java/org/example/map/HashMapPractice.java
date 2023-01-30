package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main() {

        //Ejemplo 1:
        System.out.println("Ejemplo 1: Hashmap accediendo a valores");
        // Creación de un nuevo HashMap
        HashMap<String, Integer> student = new HashMap<>();

        // Añadir entradas al HashMap
        student.put("James", 4);
        student.put("Arley", 3);
        student.put("Santiago", 5);

        // Acceder a los valores en el HashMap
        int James = student.get("James");
        System.out.println("La calificación de James es: " + James+"\n");

        //Ejemplo 2
        System.out.println("Ejemplo 2: Hashmap iterando las entradas");
        // Creación de un nuevo HashMap
        HashMap<String, Integer> Productos = new HashMap<>();

        // Añadir entradas al HashMap
        Productos.put("portátil", 2000000);
        Productos.put("Televisor", 1500000);
        Productos.put("Celular", 1200000);

        // Iteración sobre todas las entradas en el HashMap
        for (Map.Entry<String, Integer> entry : Productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + ", Precio: $" + entry.getValue());
        }
        //Ejemplo 3
        System.out.println("\nEjemplo 3: Hashmap accediendo a valores");
        // Creación de un nuevo HashMap
        HashMap<String, String> Definiciones = new HashMap<>();

        // Añadir entradas al HashMap
        Definiciones.put("Computador", "Dispositivo para procesar información");
        Definiciones.put("Programa", "Una secuencia de instrucciones que un computador puede interpretar");
        Definiciones.put("Java", "Un lenguaje de programación");

        // Buscar la definición de una palabra en el HashMap
        String definicion = Definiciones.get("Java");
        System.out.println("La definición de Java es: " + definicion);

    }




}
