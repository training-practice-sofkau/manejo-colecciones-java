package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.LinkedListPractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int seleccionar;

        do {
            System.out.println("\nEliga una opcion: \n 1.ArrayList \n 2.LinkedList \n 3.HashMap \n 4.HashSet");
            seleccionar = entrada.nextInt();
            entrada.nextLine();
            switch (seleccionar){
                case 1:
                    ArrayListPractice arrayListPractice = new ArrayListPractice();
                    System.out.println("------------------------------------------------");
                    arrayListPractice.ejemplo1();
                    System.out.println("------------------------------------------------");
                    arrayListPractice.ejemplo2();
                    System.out.println("------------------------------------------------");
                    arrayListPractice.ejemplo3();
                    break;

                case 2:
                    LinkedListPractice linkedListPractice = new LinkedListPractice();
                    System.out.println("------------------------------------------------");
                    linkedListPractice.ejemplo1();
                    System.out.println("------------------------------------------------");
                    linkedListPractice.ejemplo2();
                    System.out.println("------------------------------------------------");
                    linkedListPractice.ejemplo3();
                    break;

                case 3:

                    break;

                case 4:

                    break;

                default:
                    break;
            }
        }while (seleccionar !=5);
    }
}