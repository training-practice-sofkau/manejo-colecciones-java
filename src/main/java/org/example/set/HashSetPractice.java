package org.example.set;

import org.example.list.arrayListPractice.*;
import java.util.*;

public class HashSetPractice {

    /**
     * *************   Ejercicio # 1  ********
     */
    public static void ejecutarEjercicio1() {
        //En un HashSet no permite ingresar valores repetidos y no muestra los valores en orden de acuerdo como se ingresan

        System.out.println();
        System.out.println("*****   Ejercicio # 1  *******\n");

        Set<Computador> lista = new HashSet<>();

        lista.add(new Computador("Tablets", "Dell", 8.5));
        lista.add(new Computador("Computadora de escritorio", "Lenovo", 19.5));
        lista.add(new Computador("All in One", "Accer", 16.5));
        lista.add(new Computador("Portatil", "Lg", 11.6));
        //Se repite la marca acer pero como estamos en el set no permite que el variable que contenga el mismo valor no
        //se repita implementamos el metodo hashCode y equals en la clase
        lista.add(new Computador("All in One", "Accer", 16.5));
        lista.add(new Computador("Computadora de escritorio", "Lenovo", 19.5));

        lista.forEach(informacion -> {
            System.out.println("Información del computador = " + informacion + "\n");
        });
    }

    /**
     * *************   Ejercicio # 2  ********
     */
    public static void ejecutarEjercicio2() {
        //En un HashSet no permite ingresar valores repetidos y no muestra los valores en orden de acuerdo como se ingresan
        System.out.println("*****   Ejercicio # 2  *******\n");
        Set<Mes> mes = new HashSet<>();
        mes.add(new Mes("Junio"));
        mes.add(new Mes("Julio"));
        mes.add(new Mes("Agosto"));
        mes.add(new Mes("Septiembre"));
        //Se repite el mes de Agosto pero como estamos en el set no permite que el variable que contenga el mismo valor no
        //se repita implementamos el metodo hashCode y equals en la clase
        mes.add(new Mes("Agosto"));

        mes.forEach(informacion -> {
            System.out.println(informacion);
        });
        System.out.println();

    }

    public static void ejecutarEjercicio3() {
        //En un HashSet no permite ingresar valores repetidos y no muestra los valores en orden de acuerdo como se ingresan
        System.out.println("*****   Ejercicio # 3  *******\n");
        Set<Pais> pais = new HashSet<>();
        pais.add(new Pais("Mexico"));
        pais.add(new Pais("Colombia"));
        pais.add(new Pais("Chile"));
        pais.add(new Pais("Brasil"));

        //Se repite el pais Chile pero como estamos en el set no permite que el variable que contenga el mismo valor no
        //se repita implementamos el metodo hashCode y equals en la clase
        pais.add(new Pais("Chile"));

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
