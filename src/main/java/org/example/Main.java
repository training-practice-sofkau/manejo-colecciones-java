package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.LinkedListPractice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array List");

        ArrayListPractice prueba = new ArrayListPractice();
        prueba.ejecutarArray();

        System.out.println("LinkedList");

        LinkedListPractice prueba1 = new LinkedListPractice();
        prueba1.ejecutarLinked();
    }
}