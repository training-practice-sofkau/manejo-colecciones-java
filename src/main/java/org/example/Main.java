package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.LinkedListPractice;
import org.example.map.HashMapPractice;
import org.example.set.HashSetPractice;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner entrada=new Scanner(System.in);
        ArrayListPractice arrayListPractice=new ArrayListPractice();
        LinkedListPractice linkedListPractice=new LinkedListPractice();
        HashMapPractice hashMapPractice=new HashMapPractice();
        HashSetPractice hashSetPractice=new HashSetPractice();

        //arrayListPractice.ejercutarArray1();

        //arrayListPractice.ejecuarArray2();

        //linkedListPractice.ejecutarLinkedList1();

        //hashMapPractice.ejecutarHashMap1();

        //hashSetPractice.ejecutarHashset();
        do{
            System.out.println("1: ArrayList");
            System.out.println("2: LinkedList");
            System.out.println("3: HashMap");
            System.out.println("4: HashSet");
            System.out.println("5: Salir");
            opcion=entrada.nextInt();
            switch (opcion){
                case 1:
                    arrayListPractice.ejercutarArray1();
                    arrayListPractice.ejecuarArray2();
                    break;
                case 2:
                    linkedListPractice.ejecutarLinkedList1();
                    break;
                case 3:
                    //hashMapPractice.ejecutarHashMap1();
                    hashMapPractice.ejecutarHashMap2();
                    break;
                case 4:
                    hashSetPractice.ejecutarHashset();
                    break;
            }
        }while(opcion<=4);
    }
}