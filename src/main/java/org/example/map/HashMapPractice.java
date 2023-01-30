package org.example.map;

import org.example.list.Empleado;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public void ejemplo1(){
        Estudiante estud1 = new Estudiante(1,"Pedro",27);
        Estudiante estud2 = new Estudiante(2,"Wendy",35);
        Estudiante estud3 = new Estudiante(3,"Patricia",20);

        Map<String, Estudiante> mi_Lista = new HashMap<>();
        mi_Lista.put("primero",estud1);
        mi_Lista.put("segundo",estud2);
        mi_Lista.put("tercero",estud3);

        System.out.println("      Lista de estudiantes");
        for (Map.Entry<String,Estudiante> listar: mi_Lista.entrySet()) {
            System.out.println(listar.getValue().toString());
        }
        mi_Lista.remove("segundo");
        System.out.println("      Lista de estudiantes Actualizada");
        for (Map.Entry<String,Estudiante> listar: mi_Lista.entrySet()) {
            System.out.println(listar.getValue().toString());
        }
    }
    public void ejemplo2(){


    }
    public void ejemplo3(){

    }


}
