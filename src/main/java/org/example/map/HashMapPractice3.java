package org.example.map;

import java.util.HashMap;

public class HashMapPractice3 {
    public void ejecutar(){
        String text = "Este código cuenta la frecuencia de aparición de cada palabra en una cadena de texto dada.";

        HashMap<String, Integer> map = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Frecuencia de las palabras en un texto:");
        for (String word : map.keySet()) {
            System.out.println(word + ": " + map.get(word));
        }
    }
}
