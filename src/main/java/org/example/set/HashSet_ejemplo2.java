package org.example.set;

import java.util.HashSet;

public class HashSet_ejemplo2 {

    public  static void main() {
        //creo mi coleccion donde almacenaremos

        HashSet<String> team = new HashSet<String>();

        //agrego los objetos a la coleccion
        team.add("Lionel Messi");
        team.add("Cristiano Ronaldo");
        team.add("Neymar Jr");
        team.add("Kylian Mbappé");
        team.add("Robert Lewandowski");

        //imprimo en consola mi coleccion
        System.out.println("Estos son los jugadores en el equipo: " + team);
    }
}