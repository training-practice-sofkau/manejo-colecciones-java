package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.LinkedListPractice;
import org.example.map.HashMapPractice;
import org.example.set.HashSet;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("ArrayList");

        ArrayListPractice arrayList = new ArrayListPractice();
        arrayList.ejecutar();

        System.out.println(" ");
        System.out.println("LinkedList");
        LinkedListPractice linkedList = new LinkedListPractice();
        linkedList.ejecutar();

        System.out.println(" ");
        System.out.println("HashMap");
        HashMapPractice hashMap = new HashMapPractice();
        hashMap.ejecutar();



        System.out.println(" ");
        System.out.println("Hashset");
        HashSet hashSet = new HashSet();
        hashSet.ejecutar();
    }
}