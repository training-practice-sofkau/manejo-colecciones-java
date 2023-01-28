package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.LinkedListPractice;
import org.example.map.HashMapPractice;
import org.example.set.HashSetPractice;

public class Main {
    public static void main(String[] args) {
        System.out.println("***********   ArrayListBuilder  ***********");
        System.out.println("");
        ArrayListPractice arrayListPractice = new ArrayListPractice();
        arrayListPractice.run();

        System.out.println("");
        System.out.println("***********   LinkedListSingleton  ***********");
        System.out.println("");
        LinkedListPractice linkedListPractice = new LinkedListPractice();
        linkedListPractice.run();

        System.out.println("");
        System.out.println("***********   HashMapPractice  ***********");
        System.out.println("");
        HashMapPractice hashMapPractice = new HashMapPractice();
        hashMapPractice.run();

        System.out.println("");
        System.out.println("***********   HashSetPractice  ***********");
        System.out.println("");
        HashSetPractice hashSetPractice = new HashSetPractice();
        hashSetPractice.run();
    }
}