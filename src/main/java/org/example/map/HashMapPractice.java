package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public void ejecutar(){

        Map<Integer, String> diccionario = new HashMap<Integer, String>();
        diccionario.put(1, "Colombia");
        diccionario.put(2, "Argentina");
        diccionario.put(3, "Chile");

        for(Map.Entry<Integer, String> entry: diccionario.entrySet()){
            System.out.println("Clave Pais: " + entry.getKey() + " - " + "Valor: "  + entry.getValue());;
        }
        System.out.println("Número de elementos: " + diccionario.size());
        System.out.println(diccionario.containsValue(1));







    }
}
