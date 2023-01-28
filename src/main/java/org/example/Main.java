package org.example;

import org.example.list.ArrayLits.*;
import org.example.list.linKedList.LinkedListPractice;

public class Main {
    public static void main(String[] args) {
        /**
         * ArrayList.
         * En este ejemplo implemento varios arrayList. primero. para almacenar clientes en el banco.
         * segundo: para almacenar empleados que trabajen en el banco y tercero: para manejar los tipos
         * de productos que maneja el banco por cliente.
         */

        System.out.println("----ArrayList----");
        ArrayListPractice arrayListPractice = new ArrayListPractice();
        arrayListPractice.ejecutar();

        /**
         * Linkedlist
         * En este ejemplo implemento varios linkedlist para almacenar la entrada y salida constantes e buses
         * en un parqueadero y tambien el ingreso y salida constantes de pasajeros de los buses que se crean.
         */
        System.out.println("----LinkedList----");
        LinkedListPractice linkedListPractice = new LinkedListPractice();
        linkedListPractice.ejecurtar();

        /**
         * HashMap
         */
        System.out.println("----HashMap----");

        /**
         * HashSet
         */
        System.out.println("----HashSet----");

    }
}