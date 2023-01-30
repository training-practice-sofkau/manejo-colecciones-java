package org.example.list;

import java.util.ArrayList;

public class ArrayListPractice {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     * */

    public void ejecutar(){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Andres", 30));
        people.add(new Person("David", 35));
        people.add(new Person("Camila", 25));

        for (Person person : people) {
            System.out.println(person.getName() + " tiene " + person.getAge() + " años");
        }
    }
}

    class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
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
