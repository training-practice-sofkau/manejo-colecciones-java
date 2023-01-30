package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.LinkedListPractice;
import org.example.map.HashMapPractice;
import org.example.set.HashSetPractice;

public class Main {
    public static void main(String[] args) {

        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("Array List");

        ArrayListPractice prueba = new ArrayListPractice();
        prueba.ejecutarArray();

        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("LinkedList");

        LinkedListPractice prueba1 = new LinkedListPractice();
        prueba1.ejecutarLinked();

        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("HashMap");

        HashMapPractice pruebas2 = new HashMapPractice();
        pruebas2.ejecutar();

        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("HashSet");

        HashSetPractice prueba3 = new HashSetPractice();
        prueba3.ejecutar();
    }
}