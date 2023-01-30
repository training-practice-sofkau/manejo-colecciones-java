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
        Map<String, Double> Empleado = new HashMap<>();
        Empleado.put("Raul",25000.0);
        Empleado.put("Samuel",31000.0);
        Empleado.put("Ana", 10000.0);
        Empleado.put("Maria",5000.0);

        System.out.println("      Lista de Empleados");
        for (Map.Entry<String,Double> listar: Empleado.entrySet()) {
            System.out.println(listar);
        }
        Empleado.put("Maria",15000.0);
        System.out.println(" Sueldo Actualizado");
        System.out.println(Empleado);
    }
    public void ejemplo3(){


    }


}
