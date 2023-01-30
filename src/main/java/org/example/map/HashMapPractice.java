package org.example.map;

import java.util.HashMap;
import java.util.Map;

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

    /* En este ejemplo se utiliza un HashMap que contiene Electrodomésticos como valor y sus respectivas Marcas como
       clave, donde luego se evalúa si el electrodoméstico está en varias marcas y se muestran todos los pares
     */
    public void ejemplo2() {
        HashMap<String, String> marcasElec = new HashMap<>(Map.of( // Se usa el constructor con una colección inicial
                                                                "Haceb","Lavadora",
                                                                "LG","Lavadora",
                                                                "Oster","Horno",
                                                                "Samsung", "Nevera"));
        System.out.println("Los electrodomésticos son:");          // Se muestran los electrodomésticos
        for (String elec : marcasElec.values()) {
            System.out.println(elec);
        }
        // Se evalúa si el electrodoméstico pertenece a varias marcas
        if (marcasElec.containsValue("Lavadora")) {
            if (marcasElec.containsKey("Haceb") && marcasElec.containsKey("LG")) {
                System.out.println("\nLa " + marcasElec.get("LG") + " es de esas marcas\n");
            } else {
                System.out.println("\nLa " + marcasElec.get("LG") + " NO es de esas marcas\n");
            }
        }
        for (String marca : marcasElec.keySet()) {                 // Se muestran los pares
            System.out.println("La marca " + marca + " tiene: " + marcasElec.get(marca));
        }
    }

    /* En este ejemplo se utiliza un HashMap que contiene un diccionario de español a inglés, y será modificado para que
       sea de español a francés
     */
    public void ejemplo3() {
        HashMap<String, String> diccionario = new HashMap<>(Map.of( // Se usa el constructor con una colección inicial
                                                                    "Rojo","Red",
                                                                "Verde","Green",
                                                                "Azul","Blue"));
        System.out.println("* Diccionario Español-Inglés *");
        for (String espannol : diccionario.keySet()) {              // Se muestra el diccionario español-inglés
            System.out.println(espannol + " traduce " + diccionario.get(espannol));
        }
        diccionario.remove("Rojo");                             // Se elimina el color Rojo del diccionario
        diccionario.put("Verde", "Vert");                           // Se traduce el diccionario a francés
        diccionario.put("Azul", "Bleu");
        diccionario.put("Morado", "Pourpre");
        System.out.println("\n* Diccionario Español-Francés *");
        for (String espannol : diccionario.keySet()) {              // Se muestra el diccionario español-francés
            System.out.println(espannol + " traduce " + diccionario.get(espannol));
        }
    }
}