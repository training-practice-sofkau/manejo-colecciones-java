package org.example.list.linkedListPratice;

import org.example.list.arrayListPractice.*;
import java.util.*;

public class LinkedListPractice {

    /**
     * *************   Ejercicio # 1  ********
     */
    public static void ejecutarEjercicio1() {
        //Agrega informacion al final y al principio de la lista
        System.out.println();
        System.out.println("*****   Ejercicio # 1  *******\n");
        List<Computador> lista = new LinkedList<>();
        lista.add(new Computador("Tablets", "Dell", 8.5));
        lista.add(new Computador("Computadora de escritorio", "Lenovo", 19.5));
        lista.add(new Computador("All in One", "Accer", 16.5));
        lista.add(new Computador("Portatil", "Lg", 11.6));

        //agregar computadora en la tercera posicion
        lista.add(2, new Computador("Portatil", "HP", 22.5));

        //Los linkedList no tiene un indice bien determinado como tienen las ArrayList
        // las LinkedLisk estan pensada para ir viendoce registro por registros
        lista.forEach(informacion -> {
            System.out.println("Información del computador = " + informacion + "\n");
        });
    }
    /**
     * *************   Ejercicio # 2  ********
     */
    public static void ejecutarEjercicio2() {
        System.out.println("*****   Ejercicio # 2  *******\n");
        List<Mes> meses = new LinkedList<>();
        meses.add(new Mes("Junio"));
        meses.add(new Mes("Julio"));
        meses.add(new Mes("Agosto"));
        meses.add(new Mes("Septiembre"));

        //agregar computadora en la 4 posicion
        meses.add(2,new Mes("Noviembre"));

        meses.forEach(informacion -> {
            System.out.println(informacion);
        });
        System.out.println();

    }
    /**
     * *************   Ejercicio # 3  ********
     */
    public static void ejecutarEjercicio3() {
        //Agrega informacion al final y al principio de la lista
        System.out.println("*****   Ejercicio # 3  *******\n");
        List<Pais> pais = new LinkedList<>();
        pais.add(new Pais("Mexico"));
        pais.add(new Pais("Colombia"));
        pais.add(new Pais("Chile"));
        pais.add(new Pais("Brasil"));

        //agregar computadora en la 4 posicion
        pais.add(3, new Pais("Alemania"));

        pais.forEach(informacion -> {
            System.out.println("El nombre del pais es: " + informacion);
        });
    }
    public static void ejecutarPrincipal(){

        ejecutarEjercicio1();
        ejecutarEjercicio2();
        ejecutarEjercicio3();


    }
}
