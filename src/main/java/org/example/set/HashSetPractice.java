package org.example.set;

import java.util.HashSet;

public class HashSetPractice {                  // Se cambia de nombre para poder exportar la librería sin problemas
    public void ejecutar() {
        Ejemplos set = new Ejemplos();
        System.out.println("\n- Ejemplo 1 -");
        set.ejemplo1();
        System.out.println("\n- Ejemplo 2 -");
        set.ejemplo2();
        System.out.println("\n- Ejemplo 3 -");
        set.ejemplo3();
    }
}

class Ejemplos {
    /* En este ejemplo se aplican la mayoría de métodos soportados por la colección usando una aplicación general de
       números
     */
    public void ejemplo1() {
        HashSet<Integer> set = new HashSet<>(); // Se usa el constructor vacío
        // Se imprime el tamaño inicial de la colección
        System.out.println("Se crea un HashSet con un tamaño de " + set.size());
        set.add(1);                             // Se añaden números a la colección
        set.add(2);
        set.add(3);
        set.add(1);                             // Se trata de añadir un número repetido
        if (set.contains(1)) {                  // Se evalúa si el número está en la colección
            System.out.println("El HashSet " + set + " contiene el número indicado");
        } else {
            System.out.println("El HashMap NO contiene el número indicado");
        }
        set.remove(2);                       // Se elimina el número especificado
        if (set.isEmpty()) {                    // Se evalúa si la colección está vacía
            System.out.println("El HashSet está vacío");
        } else {
            System.out.println("El HashSet " + set + " NO está vacío y mide " + set.size());
        }
        set.clear();                            // Se eliminan todos los pares clave-número
        System.out.println("El HashSet " + set + " ahora está vacío");
    }

    public void ejemplo2() {
        //...Monedas de un país iterator
    }

    public void ejemplo3() {
        //...
    }
}