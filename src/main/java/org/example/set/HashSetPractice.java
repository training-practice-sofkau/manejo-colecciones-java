package org.example.set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
    public void ejecutar() {

        System.out.println("----EJEMPLO 1----");

        HashSet<Integer> hashSet = new HashSet<Integer>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        System.out.println("Los datos en el HashSet son: " + hashSet.size());

        Iterator iterarHSet = hashSet.iterator();

        while (iterarHSet.hasNext()) {
            System.out.println(iterarHSet.next());
        }

        //No permite repetir los datos

        System.out.println("------NO PERMITE REPETIR DATOS-----");

        hashSet.add(3);
        hashSet.add(2);

        System.out.println("Los datos en el HashSet son: " + hashSet.size());

        Iterator iterarHSet2 = hashSet.iterator();

        while (iterarHSet2.hasNext()) {
            System.out.println(iterarHSet2.next());
        }

        System.out.println("----EJEMPLO 2------");

        HashSet atlNacional = new HashSet<>();

        atlNacional.add("Mier");
        atlNacional.add("Mosquera");
        atlNacional.add("Jarlan");
        atlNacional.add("Duque");

        HashSet jugadores = new HashSet<>();

        jugadores.add("Jader");
        jugadores.add("Da costa");

        System.out.println("Jugadores del equipo: " + atlNacional);
        System.out.println("----------");

        Iterator itNal = atlNacional.iterator();
        Iterator itJug = jugadores.iterator();

        while (itNal.hasNext()) {
            System.out.println("Del equipo principal");
            System.out.println(itNal.next());
        }

        System.out.println("-----------------------------");
        while (itJug.hasNext()) {
            if (atlNacional.contains(itNal)) {
                System.out.println("Este jugador esta en el equipo: " + itJug.next());
            } else {
                System.out.println("Este jugador no esta en el equipo: " + itJug.next());
            }
        }

        System.out.println("Se agregan al equipo los nuevos jugadores");
        atlNacional.add(jugadores);

        System.out.println("EQUIPO COMPLETO");
        System.out.println("Jugadores del equipo: " + atlNacional);

    }
}