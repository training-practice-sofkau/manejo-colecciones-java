package org.example.map;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public void ejecutar(){

        System.out.println("------EJEMPLO 1--------");

        HashMap<Integer, String> hash1 = new HashMap<>();
        hash1.put(1000,"Carlos");
        hash1.put(3000,"Paula");
        hash1.put(8000,"Monica");

        System.out.println(hash1);

        if (hash1.containsKey(3000)) {
            System.out.println("Contiene el valor 3000: " + hash1.get(3000));
        } else{
                System.out.println("No contiene 3000");
            }
        if (hash1.containsKey(100)) {
            System.out.println("Contiene el valor 3000: " + hash1.get(100));
        } else{
            System.out.println("No contiene 3000");
        }


        System.out.println("---------EJEMPLO 2-----------");

        Map<Integer, Estudiante> listaEstudiantes = new HashMap<>();

        Estudiante estudiante1 = new Estudiante("Carlos", 24, new Date());
        Estudiante estudiante2 = new Estudiante("Mauricio", 27, new Date());
        Estudiante estudiante3 = new Estudiante("Maicol", 30, new Date());

        listaEstudiantes.put(1,estudiante1);
        listaEstudiantes.put(2,estudiante2);
        listaEstudiantes.put(3,estudiante3);

        for (Map.Entry<Integer, Estudiante> est: listaEstudiantes.entrySet()){
            System.out.println("Clave del estudiante: " + est.getKey());
        }
    }
}
