package org.example.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
    public void ejecutar(){
        LinkedList<Persona> people = new LinkedList<>();
        people.add(new Persona("Alice", 30));
        people.add(new Persona("Bob", 35));
        people.add(new Persona("Charlie", 25));
        people.add(new Persona("David", 40));

        Iterator<Persona> iterator = people.iterator();
        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            if (persona.getAge() < 30) {
                iterator.remove();
            }
        }
        for (Persona persona : people) {
            System.out.println(persona.getName() + " tiene " + persona.getAge() + " años");
        }
    }
}

class Persona {
    private String name;
    private int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
