package org.example.list;

import java.util.LinkedList;

public class LinkedListPractice3 {
    public void ejecutar(){
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        int count = 0;
        for (Integer number : numbers) {
            if (number % 3 == 0) {
                count++;
            }
        }

        System.out.println("Numeros multiplos de 3 en la LinkedList: " + count);
    }
}

