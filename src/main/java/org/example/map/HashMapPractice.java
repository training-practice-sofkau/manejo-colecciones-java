package org.example.map;

import java.util.HashMap;

public class HashMapPractice {
    public void ejecutar(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Jim", 35);

        int age = map.get("Jane");
        System.out.println("Edad de Jane: " + age);
    }
}
