package org.example;

import org.example.list.arrayListPractice.ArrayListPractice;
import org.example.list.arrayListPractice.Persona;
import org.example.list.linkedListPratice.LinkedListPractice;
import org.example.set.HashSetPractice;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!\n");
        System.out.println("*****   Ejercicio ArrayListPractice  *******\n");
        ArrayListPractice.ejecutarPrincipal();
        ArrayListPractice.ejecutarEjercicio4();

        System.out.println("*****   Ejercicio LinkedList  *******\n");
        LinkedListPractice.ejecutarPrincipal();

        System.out.println();
        System.out.println("*****   Ejercicio HashSetPractice  *******\n");
        HashSetPractice.ejecutarPrincipal();

    }
}