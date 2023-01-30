package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.LinkedListPractice;
import org.example.map.HashMapPractice;
import org.example.set.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejecutando ejemplos de colección LIST");
        // Se ejecutan los ejemplos de uso de esta colección
        System.out.println("\n<Ejemplos ArrayList>");
        ArrayListPractice arrayList = new ArrayListPractice();
        arrayList.ejecutar();

        System.out.println("\n<Ejemplos LinkedList>");
        LinkedListPractice linkedList = new LinkedListPractice();
        linkedList.ejecutar();
        System.out.println("\n< - - - >");

        System.out.println("\nEjecutando ejemplos de colección MAP");
        // Se ejecutan los ejemplos de uso de esta colección
        HashMapPractice map = new HashMapPractice();
        map.ejecutar();
        System.out.println("\n< - - - >");

        System.out.println("\nEjecutando ejemplos de colección SET");
        // Se ejecutan los ejemplos de uso de esta colección
        HashSet set = new HashSet();
        set.ejecutar();
    }
}