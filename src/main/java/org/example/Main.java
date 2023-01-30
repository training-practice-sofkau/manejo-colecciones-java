package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.LinkedListPractice;
import org.example.map.HashMapPractice;
import org.example.set.HashSetPractice;



public class Main {
    public static void main(String[] args) {


        System.out.println("Practica con ArrayList");
        ArrayListPractice arrayListPractice = new ArrayListPractice();
        arrayListPractice.ejecutar();
        System.out.println("----------------------------------------------");

        System.out.println("Practica con LinkedList");
        LinkedListPractice linkedListPractice = new LinkedListPractice();
        linkedListPractice.ejecutar();

        System.out.println("------------------------------------------------");

        System.out.println("Practica Set HashSet");
        HashSetPractice hashSetPractice = new HashSetPractice();
        hashSetPractice.ejecutar();

        System.out.println("------------------------------------------------");

        System.out.println("Practica Map");
        HashMapPractice hashMap = new HashMapPractice();
        hashMap.ejecutar();



    }
}