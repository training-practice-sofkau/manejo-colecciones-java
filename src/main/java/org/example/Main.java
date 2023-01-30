package org.example;

import org.example.lisarraylist.Alimento;
import org.example.lisarraylist.ArrayListPractice;
import org.example.lisarraylist.Empleado;
import org.example.listlinkenlist.LinkedListPractice;
import org.example.listlinkenlist.Vehiculo;
import org.example.map.HashMapPractice;
import org.example.set.HashSetPractice;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");


        System.out.println("<-----------Ejemplos de Array List------------------------->");
        ArrayListPractice alimento = new ArrayListPractice();
        alimento.ejecutar();


        Empleado empleado = new Empleado();
        //  empleado.calcularSueldo(1000, 5);
        System.out.println("el sueldo es" + " : " + empleado.calcularSueldo(100, 2));

        ArrayListPractice empleado1 = new ArrayListPractice();
        empleado1.ejecutar1();

        System.out.println("<-----------Ejemplos de Array List------------------------->");


        System.out.println("<-----------Ejemplos de  LinkedList------------------------->");


        LinkedListPractice vehiculo1 = new LinkedListPractice();
        vehiculo1.ejecutar();

        System.out.println("<-----------Ejemplos de  LinkedList------------------------->");


        System.out.println("<-----------Ejemplos de  HashMap------------------------->");

        HashMapPractice animales = new HashMapPractice();
        animales.ejecutar();


        System.out.println("<-----------Ejemplos de  HashMap------------------------->");


        HashSetPractice pais = new HashSetPractice();
        pais.ejecutar();

        System.out.println("<-----------Ejemplos de  HashMap------------------------->");


    }
}