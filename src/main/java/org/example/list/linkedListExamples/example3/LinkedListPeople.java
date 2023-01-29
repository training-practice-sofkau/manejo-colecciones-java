package org.example.list.linkedListExamples.example3;

public class LinkedListPeople {
    public void managePeople(){
        IManagePerson iManagePerson = new ManagePersonImp();
        Person person1 = new Person("Sergio");
        Person person2 = new Person("Andrés");
        Person person3 = new Person("Laura");
        Person person4 = new Person("Astrid");

        // para agregar instancias a la LinkedList
        iManagePerson.addPerson(person1);
        iManagePerson.addPerson(person2);
        iManagePerson.addPerson(person3);
        iManagePerson.addPerson(person4);

        // Para definir si una persona está en la LinkedList
        System.out.println(iManagePerson.lookForPerson(person1));;

        // para eliminar una instancia de la LinkedList
        iManagePerson.deletePerson(person1);

        // Para definir si una persona se encuentra en la lista o no
        System.out.println(iManagePerson.lookForPerson(person1));;
    }
}
