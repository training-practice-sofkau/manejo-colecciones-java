package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.LinkedListPractice;

public class Main {
    public static void main(String[] args) {

        System.out.println("____________________EJERCICIOS MANEJO DE COLECCIONES_________________");

        ArrayListPractice arrayListPractice = new ArrayListPractice();
        arrayListPractice.ejecutar();

        LinkedListPractice linkedListPractice = new LinkedListPractice();
        linkedListPractice.ejecutar();
    }
}