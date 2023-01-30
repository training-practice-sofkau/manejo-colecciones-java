package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {


    public void ejecutar(){
        Map <String, Integer> identificacion = new HashMap<>();
        identificacion.put("Pepe Mujica", 12);
        identificacion.put("Juan Reyes", 34);
        identificacion.put("Eduardo Elric", 2);
        identificacion.put("Eren Yaeger", 1);

        System.out.println("Los implicados en el asalto son "+ identificacion);

        if (identificacion.containsKey("Pepe Mujica")) {

            System.out.println("El implicado " + identificacion.get("Pepe Mujica") + " ha sido " +
                    "declarado inocente de sus cargos, por eso se elimina de la lista");
            identificacion.remove("Pepe Mujica");
        }
        System.out.println("Los implicados actuales son "+ identificacion);

    }

    public void ejecutar2(){
        Map <String, Integer> empleados = new HashMap<>();

        empleados.put("Pepo Camelo", 12);
        empleados.put("Matt Murdock", 55);
        empleados.put("Percy Jackson", 75);

        if (empleados.containsKey("Pepo Camelo")){
            System.out.println("El empleado " + empleados.get("Pepo Camelo") + " fue ascendido de empleado a gerente");
            System.out.println("El gerente se llama "+ empleados.get("Pepo Camelo"));
            empleados.remove("Pepo Camelo");
            System.out.println("Los empleados actuales son "+ empleados);
        }

    }

    public void ejecutar3(){
        Map <Integer, Boolean> idActivos = new HashMap<>();

        idActivos.put(1, true);
        idActivos.put(2, false);
        idActivos.put(3, true);


            if (idActivos.containsValue(true)){
                System.out.println("Productos disponibles por id son " + idActivos.get(1));
                System.out.println("Productos disponibles por id son " + idActivos.get(3));
            }



    }
}


