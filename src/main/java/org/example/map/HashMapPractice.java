package org.example.map;

import java.util.HashMap;

public class HashMapPractice {

    public void ejecutar() {
        HashMap<String, Animal> animales = new HashMap<>();

        Perro perro1 = new Perro("Muñeca", "Canino", "Labrador");
        Perro perro2 = new Perro("Max", "Canino", "Golden Retriever");
        Perro perro3 = new Perro("pepe", "Canino", "Put");
        Perro perro4 = new Perro("mati", "Canino", "Salchicha");

        animales.put(perro1.getNombre(), perro1);
        animales.put(perro2.getNombre(), perro2);
        animales.put(perro3.getNombre(), perro3);
        animales.put(perro4.getNombre(), perro4);


        System.out.println("Tamaño del mapa antes de eliminar un elemento: " + animales.size());
        animales.remove("Max");
        System.out.println("Tamaño del mapa después de eliminar un elemento: " + animales.size());

        System.out.println("Contiene la llave 'Fido'? " + animales.containsKey("Fido"));
        System.out.println("Contiene el valor 'Perro de Nombre pepe'? " + animales.containsValue(perro1.getNombre()));

        System.out.println("Recorriendo el mapa: ");
        for (String nombre : animales.keySet()) {
            Animal animal = animales.get(nombre);
            System.out.println(animal.getNombre() + " es un " + animal.getEspecie());
        }
    }

}


/**
 * remove: Elimina un par clave-valor específico del HashMap.
 * clear: Elimina todos los pares clave-valor del HashMap.
 * containsKey: Devuelve true si la clave especificada está presente en el HashMap.
 * containsValue: Devuelve true si el valor especificado está presente en el HashMap.
 * keySet: Devuelve un Set que contiene todas las claves en el HashMap.
 * values: Devuelve una Collection que contiene todos los valores en el HashMap.
 * entrySet: Devuelve un Set que contiene todas las entradas (pares clave-valor) en el HashMap.
 * isEmpty: Devuelve true si el HashMap está vacío.
 * size: Devuelve el número de pares clave-valor en el HashMap.
 */