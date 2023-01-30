package org.example;

import org.example.list.ArrayListPractice.ArrayListPractice;
import org.example.list.LinkedListPractice.LinkedListPractice;
import org.example.map.HashMapPractice;
import org.example.set.HashSetPractice;

public class Main {
    public static void main(String[] args) {
        /**
         * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
         * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
         * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
         * de dato involucrados.
         * */

        System.out.println("------------ArrayList Patron de Diseño Factory-------------");
        ArrayListPractice arrayListPractice = new ArrayListPractice();
        arrayListPractice.ejecutar();

        System.out.println("------------LinkedList Patron de Diseño Mediator-----------");
        LinkedListPractice linkedListPractice = new LinkedListPractice();
        linkedListPractice.ejecutar();

        System.out.println("--------------HashMap Patron de diseño Builder-------------------");
        HashMapPractice hashMapPractice = new HashMapPractice();
        hashMapPractice.ejecutar();

        System.out.println("------------HashSetPractice Patron de Diseño Factory-------------");
        HashSetPractice hashSetPractice = new HashSetPractice();
        hashSetPractice.ejecutar();

    }


}