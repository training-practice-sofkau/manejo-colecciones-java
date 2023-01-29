package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.LinkedListPractice;
import org.example.map.HashMapPractice;

import java.util.HashMap;

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

    }
}