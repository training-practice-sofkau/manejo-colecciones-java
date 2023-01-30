package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.LinkedListPracticeBuilder;

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
                    ArrayListPractice arrayList = new ArrayListPractice();
                    arrayList.arrayListObjects();
                    arrayList.simpleArrayList();
                    arrayList.arrayFrutas();
                    break;
                case 2:
                    System.out.println("Linked List");
                    LinkedListPracticeBuilder linked = new LinkedListPracticeBuilder();
                    linked.ejecutarLinkedList();
                    break;

                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    bandera = false;
                    break;
            }
        }
    }

}