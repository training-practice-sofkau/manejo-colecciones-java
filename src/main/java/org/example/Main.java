package org.example;

import org.example.lisarraylist.Alimento;
import org.example.lisarraylist.Empleado;
import org.example.listlinkenlist.Vehiculo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");


        System.out.println("<-----------Ejemplos de Array List------------------------->");
        Alimento alimento = new Alimento();
        alimento.ejecutar();


        Empleado empleado = new Empleado();
        //  empleado.calcularSueldo(1000, 5);
        System.out.println("el sueldo es" + " : " + empleado.calcularSueldo(100, 2));

        Empleado empleado1 = new Empleado();
        empleado1.ejecutar();

        System.out.println("<-----------Ejemplos de Array List------------------------->");


        System.out.println("<-----------Ejemplos de  LinkedList------------------------->");


        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.ejecutar();

        System.out.println("<-----------Ejemplos de  LinkedList------------------------->");


    }
}