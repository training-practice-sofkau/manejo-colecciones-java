package org.example.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice2 {
    public void ejecutar(){
        LinkedList<String> words = new LinkedList<>();
        words.add("Hello");
        words.add("World");
        words.add("123");
        words.add("Java");
        words.add("Code");

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (!word.matches("[a-zA-Z]+")) {
                iterator.remove();
            }
        }
        System.out.println("Palabras: " + words);
    }
}

