package org.example.list;

import java.util.LinkedList;

public class LinkedListPractice {
    public void ejecutarLinked (){

        System.out.println("---------EJEMPLO 1------------");

        LinkedList<Persona> lista1 = new LinkedList<Persona>();
        Persona persona1 = new Persona("Carlos", 20, 1);
        Persona persona2 = new Persona("Maria", 23, 2);
        Persona persona3 = new Persona("Fernando", 28, 3);
        lista1.add(persona1);
        lista1.add(persona2);
        lista1.add(persona3);

        for (Persona person: lista1){
            System.out.println("Numero: " + person.getNumero());
            System.out.println("Nombres: " + person.getNombre());
            System.out.println("Edad: " + person.getEdad());
        }
        System.out.println("Datos en la lista: " + lista1.size());

        System.out.println("---SE AGREGA UN ELEMENTO EN EL INDICE 3---");

        lista1.add(2, new Persona("Prueba", 21, 2));

        for (Persona person: lista1){
            System.out.println("Numero: " + person.getNumero());
            System.out.println("Nombres: " + person.getNombre());
            System.out.println("Edad: " + person.getEdad());
        }

        System.out.println("Datos en la lista: " + lista1.size());

        System.out.println("---SE ELIMINA EL INDICE 4 QUE ES FERNANDO---");

        lista1.remove(3);

        for (Persona person: lista1){
            System.out.println("Numero: " + person.getNumero());
            System.out.println("Nombres: " + person.getNombre());
            System.out.println("Edad: " + person.getEdad());
        }
        System.out.println("Datos en la lista: " + lista1.size());

        System.out.println("----------EJEMPLO 2-------------");

        LinkedList<String> lista2 = new LinkedList<>();

        lista2.add("Java");
        lista2.add("JavaScript");
        lista2.add("C#");

        System.out.println(lista2);

        lista2.add(1,"Python");

        System.out.println(lista2);
        System.out.println("Traer el primer dato de la lista: " + lista2.getFirst());
        System.out.println("Traer el ultimo dato de la lista: " + lista2.getLast());
        System.out.println("Cantidad de datos en la lista: " + lista2.size());

        System.out.println("----------EJEMPLO 3-------------");

        LinkedList<Carro> listaCarros = new LinkedList<>();

        Carro carro1 = new Carro("POR 374", "gris");
        Carro carro2 = new Carro("kdf 923", "marron");
        Carro carro3 = new Carro("lfg 734", "rojo");

        listaCarros.add(carro1);
        listaCarros.add(carro2);
        listaCarros.add(carro3);

        for (Carro carros: listaCarros){
            System.out.println("Placa: " + carros.getPlaca());
            System.out.println("Color: " + carros.getColor());
        }
        System.out.println("Datos en lista: " + listaCarros.size());

        System.out.println("--------ELIMINAR DATOS CON METODO POLLFIRST-----------");

        listaCarros.pollFirst();

        for (Carro carros: listaCarros){
            System.out.println("Placa: " + carros.getPlaca());
            System.out.println("Color: " + carros.getColor());
        }
        System.out.println("Datos en lista: " + listaCarros.size());

        System.out.println("--------ELIMINAR DATOS CON METODO POLLLAST-----------");

        listaCarros.pollLast();

        for (Carro carros: listaCarros){
            System.out.println("Placa: " + carros.getPlaca());
            System.out.println("Color: " + carros.getColor());
        }
        System.out.println("Datos en lista: " + listaCarros.size());
    }
}
