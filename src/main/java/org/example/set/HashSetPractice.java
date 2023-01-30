package org.example.set;


import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public void elemntosUnicos() {
        Set<Integer> elementos = new HashSet<>();

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5};

        for (int numero : numeros) {
            elementos.add(numero);
        }

        System.out.println("Numero de elemntos unicos: " + elementos.size());
    }

    public void unionConjuntos() {


        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        System.out.println("El resultado de la union entre ambos conjuntos es: " + unionSet);
    }


}