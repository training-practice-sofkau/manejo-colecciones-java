package org.example;

import org.example.list.ArrayList.ArrayListPractice;
import org.example.list.LinkedList.LinkedListPractice;
import org.example.map.HashMapPractice;
import org.example.set.HashSetPractice;

public class Main {
    public static void main(String[] args) {
        ArrayListPractice arrayListPractice = new ArrayListPractice();

        System.out.println("------------------ArrayList-------------------------");
        arrayListPractice.ejecutarArrayList();
        System.out.println("-------------------------------------------");
        arrayListPractice.ejecutarArrayList2();
        System.out.println("-------------------------------------------");
        arrayListPractice.ejecutarArrayList3();

        System.out.println("-------------------------------------------");
        System.out.println("------------------LinkedList-------------------------");
        LinkedListPractice linkedList = new LinkedListPractice();
        linkedList.ejecutar();
        linkedList.ejecutar2();
        linkedList.ejecutar3();

        System.out.println("-------------------------------------------");
        System.out.println("------------------Map-------------------------");
        HashMapPractice map = new HashMapPractice();
        map.ejecutar();
        map.ejecutar2();
        map.ejecutar3();

        System.out.println("-------------------------------------------");
        System.out.println("------------------Set-------------------------");
        HashSetPractice hashSet = new HashSetPractice();
        hashSet.ejecutar();
        hashSet.ejecutar2();
        hashSet.ejecutar3();


    }
}