package org.example;

import org.example.lisarraylist.Alimento;
import org.example.lisarraylist.Empleado;

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

        System.out.println("<-----------Ejemplos de Array List------------------------->");


    }
}