package org.example;

import org.example.list.*;
import org.example.map.*;
import org.example.set.HashSetPractice;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----ArrayList-----");
        System.out.println("Ejemplo 1");
        ArrayListPractice arrayListPractice = new ArrayListPractice();
        arrayListPractice.ejecutar();
        System.out.println("Ejemplo 2");
        ArrayListPractice2 arrayListPractice2 = new ArrayListPractice2();
        arrayListPractice2.ejectuar();
        System.out.println("Ejemplo 3");
        ArrayListPractice3 arrayListPractice3 = new ArrayListPractice3();
        arrayListPractice3.ejecutar();
        System.out.println("-----LinkedList-----");
        System.out.println("Ejemplo 1");
        LinkedListPractice linkedListPractice = new LinkedListPractice();
        linkedListPractice.ejecutar();
        System.out.println("Ejemplo 2");
        LinkedListPractice2 linkedListPractice2 = new LinkedListPractice2();
        linkedListPractice2.ejecutar();
        System.out.println("Ejemplo 3");
        LinkedListPractice3 linkedListPractice3 = new LinkedListPractice3();
        linkedListPractice3.ejecutar();
        System.out.println("-------HashMap-------");
        System.out.println("Ejemplo 1");
        HashMapPractice hashMapPractice = new HashMapPractice();
        hashMapPractice.ejecutar();
        System.out.println("Ejemplo 2");
        HashMapPractice2 hashMapPractice2 = new HashMapPractice2();
        hashMapPractice2.ejecutar();
        System.out.println("Ejemplo 3");
        HashMapPractice3 hashMapPractice3 = new HashMapPractice3();
        hashMapPractice3.ejecutar();
        System.out.println("-------HashSet-------");
        HashSetPractice hashSetPractice = new HashSetPractice();
        System.out.println("Ejemplo 1");
        hashSetPractice.ejecutar1();
        System.out.println("Ejemplo 2");
        hashSetPractice.ejecutar2();
        System.out.println("Ejemplo 3");
        hashSetPractice.ejecutar3();
    }
}