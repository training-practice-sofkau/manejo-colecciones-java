package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.LinkedListPracticeBuilder;
import org.example.map.HashMapPractice;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean bandera = true;
        while (bandera) {
            System.out.println("\n-----Manejo de Colecciones en Java-----");
            System.out.println("Elija que tipo de coleccion desea ejecutar");
            System.out.println("1. ArrayList");
            System.out.println("2. LinkedList");
            System.out.println("3. HashMap");
            System.out.println("4. HashSet");
            Scanner sc = new Scanner(System.in);
            int o = sc.nextInt();

            switch (o){
                case 1:
                    //Array List///////////
                    System.out.println("*****Array List*****");
                    ArrayListPractice arrayList = new ArrayListPractice();
                    arrayList.arrayListObjects();
                    arrayList.simpleArrayList();
                    arrayList.arrayFrutas();
                    break;
                case 2:
                    System.out.println("\n*****Linked List*****");
                    LinkedListPracticeBuilder linked = new LinkedListPracticeBuilder();
                    linked.ejecutarLinkedList();
                    break;

                case 3:
                    System.out.println("\n*****Hash Map*****");
                    HashMapPractice hash = new HashMapPractice();
                    hash.hashMap1();
                    hash.hashMap2();
                    hash.hashMap3();
                    break;
                case 4:
                    System.out.println("\n*****Hash Set*****");

                    break;
                default:
                    System.out.println("\n*****Opcion Incorrecta*****");
                    bandera = false;
                    break;
            }
        }
    }

}