package org.example.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

    public void ejecutar1(){
        HashSet<String> set = new HashSet<>();
        set.add("Jose");
        set.add("Javier");
        set.add("Andres");
        set.add("Javier");  // No se agrega, ya que "Javier" ya está en el HashSet

        System.out.println("Numero de elementos en el HashSet: " + set.size());
        System.out.println("Elementos en el HashSet: " + set);
    }

    public void ejecutar2(){
        HashSet<String> set = new HashSet<>();
        set.add("Jose");
        set.add("Javier");
        set.add("Cristian");

        String name = "Jose";
        if (set.contains(name)) {
            System.out.println(name + " esta en el HashSet.");
        } else {
            System.out.println(name + " no esta en el HashSet.");
        }
    }

    public void ejecutar3(){
        HashSet<String> set = new HashSet<>();
        set.add("Jose");
        set.add("Javier");
        set.add("Andres");

        System.out.println("Elementos en el HashSet:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
