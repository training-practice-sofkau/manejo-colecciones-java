package org.example.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

    public void operacionesLinkedlist() {
        List<String> listaFrutas = new LinkedList<>();


        listaFrutas.add("Pera");
        listaFrutas.add("Uva");
        listaFrutas.add("Mora");
        listaFrutas.add("Banano");
        listaFrutas.add("Papaya");

        System.out.println("Las frutas disponibles son: " + listaFrutas);

        listaFrutas.add(0, "Uchuva");
        System.out.println("Se añadio un nuevo elemento al inicio de la lista: " + listaFrutas);

        listaFrutas.remove(3);
        System.out.println("Se removio uno de los elementos de la lista: " + listaFrutas);

        listaFrutas.set(2, "Guanabana");
        System.out.println("Semodifico uno de los elementos de la lista: " + listaFrutas);
    }


    public void listaEmpleados() {
        List<Emplead> empleados = new LinkedList<>();

        empleados.add(new Emplead("Andres Martinez", 35, "Supervisor"));
        empleados.add(new Emplead("Julian Vanegas", 32, "Desarrollador"));
        empleados.add(new Emplead("Jhon Perez", 40, "QA Tester"));

        for (Emplead empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Edad: " + empleado.getEdad());
            System.out.println("Cargo: " + empleado.getCargo());
            System.out.println("---------------");
        }
    }
}

class Emplead {
    private String nombre;
    private int edad;
    private String cargo;

    public Emplead(String nombre, int edad, String cargo) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCargo() {
        return cargo;
    }

}







