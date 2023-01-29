package org.example.map;

import org.example.list.arrayListPractice.*;

import java.util.HashMap;
import java.util.Map;


public class HashMapPractice {

    /**
     * *************   Ejercicio # 1  ********
     */
    public static void ejecutarEjercicio1() {
        //En un HashSet no permite ingresar valores repetidos y no muestra los valores en orden de acuerdo como se ingresan

        System.out.println();
        System.out.println("*****   Ejercicio # 1  *******\n");

        Map<Computador, String> lista = new HashMap();

        lista.put(new Computador("Tablets", "Dell", 8.5), "Pc");
        lista.put(new Computador("Computadora de escritorio", "Lenovo", 19.5), "Pc");
        lista.put(new Computador("All in One", "Accer", 16.5), "Pc");
        lista.put(new Computador("Portatil", "Lg", 11.6),"Pc");
        //Se repite este valor pero no permite repetir la llave  porque ya este valor existe y no permite repetir el mismo valor no,
        //se repita implementamos el metodo hashCode y equals en la clase
        lista.put(new Computador("All in One", "Accer", 16.5), "Pc");
        lista.put(new Computador("Computadora de escritorio", "Lenovo", 19.5),"Pc");

        for(Map.Entry<Computador, String> ent: lista.entrySet()) {
            System.out.println("Clave: " + ent.getKey() + " -> valor: "+ ent.getValue());
        }
    }

    public static void ejecutarEjercicio2() {
        //En un HashSet no permite ingresar valores repetidos y no muestra los valores en orden de acuerdo como se ingresan
        System.out.println("*****   Ejercicio # 2  *******\n");
        Map<Mes, String> mes = new HashMap();
        mes.put(new Mes("Junio"), "mes");
        mes.put(new Mes("Julio"),  "mes");
        mes.put(new Mes("Agosto"),  "mes");
        mes.put(new Mes("Septiembre"),  "mes");
        //Se repite este valor pero no permite repetir la llave de nombre agosto porque ya este valor existe y no permite repetir el mismo valor no,
        //se repita implementamos el metodo hashCode y equals en la clase
        mes.put(new Mes("Agosto"), "mes");

        for(Map.Entry<Mes, String> ent: mes.entrySet()) {
            System.out.println("Clave: " + ent.getKey() + " -> valor: " + ent.getValue());
        }
        System.out.println();
    }

    public static void ejecutarEjercicio3() {

        System.out.println("*****   Ejercicio # 3  *******\n");
        Map<Integer, Pais> pais = new HashMap<>();
        pais.put(3, new Pais("Mexico"));
        pais.put(2, new Pais("Colombia"));
        pais.put(1, new Pais("Chile"));
        pais.put(4, new Pais("Brasil"));

        //Se repite este valor pero no permite repetir la llave 1 porque ya este valor existe y no permite repetir el mismo valor no,
        //se repita implementamos el metodo hashCode y equals en la clase
        pais.put(1, new Pais("Chile"));

        for (Map.Entry<Integer, Pais> ent : pais.entrySet()) {
            System.out.println("Clave: " + ent.getKey() + " -> valor: " + ent.getValue());
        }
    }
    public static void ejecutarPrincipal(){

        ejecutarEjercicio1();
        ejecutarEjercicio2();
        ejecutarEjercicio3();

    }
}
