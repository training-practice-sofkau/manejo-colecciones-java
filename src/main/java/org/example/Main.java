package org.example;

import org.example.list.ArrayLits.*;
import org.example.list.linKedList.LinkedListPractice;
import org.example.map.HashMapPractice;
import org.example.set.HashSet;

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
         * En este ejemplo implemento varios HashMap para controlar el puesto de los participantes enla olimpiadas
         * por deporte y en ingreso de los asistentes al evento.
         */
        System.out.println("----HashMap----");

        HashMapPractice hashMapPractice = new HashMapPractice();
        hashMapPractice.ejecutar();

        /**
         * HashSet
         * En este ejemplo implemento varios hashSet para agrupar jurados, votantes y casas de votaciones para llevar un contros electoral,
         * para que no se repitan ddtos.
         */
        System.out.println("----HashSet----");

        HashSet hashSet = new HashSet();
        hashSet.ejecutar();

    }
}