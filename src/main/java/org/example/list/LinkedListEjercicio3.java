package org.example.list;

import java.util.LinkedList;

public class LinkedListEjercicio3 {

    public void main() {
        // Crear una LinkedList de marcas de computadoras
        LinkedList<String> marcas = new LinkedList<>();
        marcas.add("Dell");
        marcas.add("HP");
        marcas.add("Apple");
        marcas.add("Lenovo");

        // Agregar una marca al inicio de la lista
        marcas.addFirst("Acer");

        // Agregar una marca al final de la lista
        marcas.addLast("Asus");

        // Imprimir las marcas de la lista
        System.out.println("Marcas en la lista: " + marcas);

        // Eliminar la primera marca de la lista
        marcas.removeFirst();

        // Eliminar la última marca de la lista
        marcas.removeLast();

        // Imprimir las marcas de la lista después de eliminar
        System.out.println("Marcas en la lista después de eliminar: " + marcas);
    }
}
