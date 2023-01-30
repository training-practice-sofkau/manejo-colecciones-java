package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.ArrayListPractice2;
import org.example.list.ArrayListPractice3;

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
    }
}