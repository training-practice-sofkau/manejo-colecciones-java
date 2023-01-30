package org.example.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    public static void main() {

        //Ejemplo 1:
        System.out.println("Ejemplo 1: HashSet accediendo a valores");
        // Creación de un nuevo HashSet
        HashSet<String> estudiantes = new HashSet<>();

        // Añadir entradas al HashSet
        estudiantes.add("James");
        estudiantes.add("Arley");
        estudiantes.add("Santiago");

        // Comprobar si un elemento está en el HashSet
        boolean isJamesInSet = estudiantes.contains("James");
        System.out.println("¿James está en el HashSet? " + isJamesInSet + "\n");

        //Ejemplo 2
        System.out.println("Ejemplo 2: HashSet iterando los elementos");
        // Creación de un nuevo HashSet
        Set<String> productos = new java.util.HashSet<>();

        // Añadir entradas al HashSet
        productos.add("Portátil");
        productos.add("Televisor");
        productos.add("Celular");

        // Iteración sobre todos los elementos en el HashSet
        System.out.print("Productos en el HashSet: ");
        for (String producto : productos) {
            System.out.print(producto + " ");
        }
        System.out.println("\n");

        //Ejemplo 3
        System.out.println("Ejemplo 3: HashSet removiendo elementos");
        // Creación de un nuevo HashSet
        Set<String> animales = new java.util.HashSet<>();

        // Añadir entradas al HashSet
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Ratón");

        // Remover un elemento del HashSet
        animales.remove("Perro");

        // Comprobar si un elemento está en el HashSet después de remover un elemento
        boolean isPerroInSet = animales.contains("Perro");
        System.out.println("¿Perro está en el HashSet después de ser removido? " + isPerroInSet);
    }

}
