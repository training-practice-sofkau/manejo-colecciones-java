package org.example.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEjercicio2 {
        public static void main(String[] args) {
            // Crear una LinkedList de números
            LinkedList<Integer> numeros = new LinkedList<>();
            numeros.add(1);
            numeros.add(2);
            numeros.add(3);
            numeros.add(4);
            numeros.add(5);
            numeros.add(6);
            numeros.add(7);
            numeros.add(8);

            // Recorrer la lista de números en ambas direcciones
            ListIterator<Integer> iterator = numeros.listIterator();
            System.out.println("Números en la lista (adelante):");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            System.out.println("Números en la lista (atrás):");
            while (iterator.hasPrevious()) {
                System.out.println(iterator.previous());
            }
        }

}
