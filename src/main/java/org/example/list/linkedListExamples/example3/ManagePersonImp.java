package org.example.list.linkedListExamples.example3;

import java.util.LinkedList;
import java.util.List;

public class ManagePersonImp implements IManagePerson{

    List<Person> people = new LinkedList<>();
    @Override
    public void addPerson(Person person) {
        people.add(person);
        System.out.println("Se ha agregado a " + person.getName() + " a la LinkedList people");
    }

    @Override
    public void deletePerson(Person person) {
        System.out.println("Se eliminará a " + person.getName() + " de la LinkedList people");
        people.remove(person);
    }

    @Override
    public String lookForPerson(Person person) {
        if (people.contains(person))
            return person.getName() + " se encuentra en la LinkedList people";
        else
            return person.getName() + " no se encuentra en la LinkedList people";
    }
}
