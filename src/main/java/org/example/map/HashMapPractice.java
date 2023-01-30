package org.example.map;

import java.util.HashMap;

public class HashMapPractice {
    public void ejecutar() {
        Ejemplos map = new Ejemplos();
        System.out.println("\n- Ejemplo 1 -");
        map.ejemplo1();
        System.out.println("\n- Ejemplo 2 -");
        map.ejemplo2();
        System.out.println("\n- Ejemplo 3 -");
        map.ejemplo3();
    }
}

class Ejemplos {
    /* En este ejemplo se aplican la mayoría de métodos soportados por la colección usando una aplicación general de
       números y letras
     */
    public void ejemplo1() {
        HashMap<Character, Integer> map = new HashMap<>(); // Se usa el constructor vacío
        // Se imprime el tamaño inicial de la colección
        System.out.println("Se crea un HashMap con un tamaño de " + map.size());
        map.put('A', 1);                                  // Se añaden pares clave-valor a la colección
        map.put('B', 2);
        map.put('C', 3);
        if (map.containsValue(2)) {                       // Se evalúa si el número está en la colección
            System.out.println("El HashMap " + map + " contiene el número indicado");
        } else {
            System.out.println("El HashMap NO contiene el número indicado");
        }
        if (map.containsKey('X')) {                       // Se evalúa si existe esta clave en la colección
            System.out.println("El HashMap contiene la clave indicada");
        } else {
            System.out.println("El HashMap " + map + " NO contiene la clave indicada");
        }
        // Se obtiene el número guardado en la colección a través de su clave asociada
        System.out.println("El " + map.get('A') + " es la posición de la letra A que funciona como clave");
        map.remove('C');                              // Se elimina el número asociado a la clave específica
        if (map.isEmpty()) {                              // Se evalúa si la colección está vacía
            System.out.println("El HashMap está vacío");
        } else {
            System.out.println("El HashMap " + map + " NO está vacío y mide " + map.size());
        }
        map.clear();                                      // Se eliminan todos los pares clave-número
        System.out.println("El HashMap " + map + " ahora está vacío");
    }

    public void ejemplo2() {
        //... values, keySet Electrodomésticos con sus marcas
    }

    public void ejemplo3() {
        //...Diccionario ingles frances
    }
}