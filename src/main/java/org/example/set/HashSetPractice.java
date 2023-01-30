package org.example.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

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

    /* En este ejemplo se utiliza un HashSet que contiene las monedas acuñadas en un país, las cuales no pueden ser
       repetidas, y se muestran por pantalla dichas monedas
     */
    public void ejemplo2() {
        // Se usa el constructor con una colección inicial
        HashSet<Integer> monedas = new HashSet<>(Arrays.asList(50, 100, 200, 500, 1000));
        System.out.println("Las monedas en Colombia son:");
        for (Iterator<Integer> it = monedas.iterator(); it.hasNext(); ) {
            int moneda = it.next();
            System.out.println("$ " + moneda);
        }
    }

    /* En este ejemplo se utiliza un HashSet que contiene los amigos de una red social, donde no se puede añadir dos
       veces a la misma persona, además se elimina la lista de amigos totalmente
     */
    public void ejemplo3() {
        // Se usa el constructor con una colección inicial
        HashSet<String> amigos = new HashSet<>(Arrays.asList("JuanDa", "Luisa Bedoya", "Carlos 'Gato' Agudelo"));
        System.out.println("Sus amigos actuales son: \n" + amigos);
        if (amigos.contains("Luisa Bedoya")) { // Se evalúa si la colección ya tiene un amigo
            System.out.println("El amigo ya existe, tratando de agregarlo nuevamente");
            amigos.add("Luisa Bedoya");        // Se trata de añadir un nuevo amigo
        } else {
            System.out.println("Añadiendo amigo");
            amigos.add("Luisa Bedoya");        // Se añade un nuevo amigo
        }
        System.out.println("Sus amigos actuales son: \n" + amigos);
        amigos.clear();                        // Se elimina la lista de amigos por completo
        if (amigos.isEmpty()) {                // Se evalúa si la lista está vacía
            System.out.println("Lista " + amigos + " de amigos vacía");
        } else {
            System.out.println("Aún tienes amigos!");
        }
    }
}