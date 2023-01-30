package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.LinkedListPractice;
import org.example.map.HashMapPractice;
import org.example.set.HashSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("____________________EJERCICIOS MANEJO DE COLECCIONES_________________");

        HashSet hashSet = new HashSet();
        hashSet.ejecutar();

        HashMapPractice hashMapPractice = new HashMapPractice();


        ArrayListPractice arrayListPractice = new ArrayListPractice();
        arrayListPractice.ejecutar();

        LinkedListPractice linkedListPractice = new LinkedListPractice();
        linkedListPractice.ejecutar();


    }
}