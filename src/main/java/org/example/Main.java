package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.LinkedListPractice;
import org.example.map.HashMapPractice;
import org.example.set.HashSetPractice;
public class Main {
    public static void main(String[] args) {

        // ArrayList
        System.out.println("Ejemplos de ArrayList\n");
        ArrayListPractice arrayListPractice = new ArrayListPractice();
        arrayListPractice.main();
        // LinkedList
        System.out.println("\nEjemplos de LinkedList\n");
        LinkedListPractice linkedListPractice = new LinkedListPractice();
        linkedListPractice.main();
        // HashMap
        System.out.println("\nEjemplos de HashMap\n");
        HashMapPractice hashMapPractice = new HashMapPractice();
        hashMapPractice.main();
        // HashSet
        System.out.println("\nEjemplos de HashSet\n");
        HashSetPractice hashSet = new HashSetPractice();
        hashSet.main();

    }
}