package org.example.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    public void ejecutar(){

        Set<String> listaLenguajes = new HashSet<>();

        listaLenguajes.add("Java");
        listaLenguajes.add("JavaScript");
        listaLenguajes.add("Phyton");

        System.out.println("Los lenguajes más populares son " + listaLenguajes);
    }

    public void ejecutar2(){

        Set<String> listaUtiles = new HashSet<>();

        listaUtiles.add("Lapiz");
        listaUtiles.add("Libretas");
        listaUtiles.add("Morral");

        System.out.println("Los útiles para mañana son "+ listaUtiles);
    }

    public void ejecutar3 (){

        Set<Integer> contarHasta5 = new HashSet<>();

        contarHasta5.add(1);
        contarHasta5.add(2);
        contarHasta5.add(3);
        contarHasta5.add(4);
        contarHasta5.add(5);

        System.out.println("Tranquilo, respira, cuenta hasta 5, vamos " + contarHasta5);
    }

}
