package org.example.map;

import java.util.HashMap;

public class HashMapPractice2 {
    public void ejecutar(){
        HashMap<String, String> map = new HashMap<>();
        map.put("John", "Developer");
        map.put("Jane", "Manager");
        map.put("Jim", "Designer");

        String job = map.get("Jane");
        System.out.println("El trabajo de Jane es: " + job);
    }
}
