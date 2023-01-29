package org.example.list;

import java.util.LinkedList;

public class LinkedListEjercicio1 {

    public void main() {
        // Crear una LinkedList de nombres
        LinkedList<String> nombres = new LinkedList<>();
        nombres.add("Bryan");
        nombres.add("Angie");
        nombres.add("Maria Jose");
        nombres.add("Sebastian");

        // Agregar un nombre al inicio de la lista
        nombres.addFirst("Brad Pitt");

        // Agregar un nombre al final de la lista
        nombres.addLast("Pablo Leon Jaramillo");

        // Imprimir los nombres de la lista
        System.out.println("Nombres en la lista: " + nombres);

        // Eliminar el primer nombre de la lista
        nombres.removeFirst();

        // Eliminar el último nombre de la lista
        nombres.removeLast();

        // Imprimir los nombres de la lista después de eliminar
        System.out.println("Nombres en la lista después de eliminar: " + nombres);
    }
}

