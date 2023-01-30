package org.example.set;


import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    public void ejecutar(){

        Set<Integer> conjuntoId = new HashSet<>();
        conjuntoId.add(185);
        conjuntoId.add(1);
        conjuntoId.add(23);
        conjuntoId.add(18);
        //elemento duplicado solo toma uno
        conjuntoId.add(23);
        conjuntoId.add(23);

        for (Integer conjunto: conjuntoId)
        {
            System.out.println("Id: " + conjunto);
        }


    }
}
