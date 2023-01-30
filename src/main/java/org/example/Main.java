package org.example;

import org.example.list.ArrayListPractice;
import org.example.list.LinkedListPractice;
import org.example.map.HashMapPractice;
import org.example.set.HashSetPractice;

public class Main {
    public static void main(String[] args) {
        HashMapPractice hashMapPractice = new HashMapPractice();
        System.out.println("----- Ejercicio conjunto-----");
        System.out.println("Indica el ID del estudiante que puede ser creado usando el patron Builder para que imprima sus datos y las notas de la asignatura");
        hashMapPractice.creacionEstudiantes11();
        System.out.println("----- Hashmap que valida la edad ingresada de un usuario mediante su key y luego imprime todos sus contenidos");
        hashMapPractice.edadUsuarios();
        System.out.println("----- Hashmap que valida el departamento en el que trabajan los empleados asignados e imprime sus valores");
        hashMapPractice.departamentoEmpleados();
        System.out.println("----- Hashmap que valida la cantidad de veces que cada palabra se repite dentro de un texto");
        hashMapPractice.conteoPalabras();

        ArrayListPractice arrayListPractice = new ArrayListPractice();
        System.out.println("-----Promedio precios entre productos alamecandos en un Arraylist");
        arrayListPractice.promedioPrecios();
        System.out.println("-----Organizar nombres de estudiantes ingresados al Arraylist por orden alfabetico");
        arrayListPractice.nombresOrdenAlfabetico();
        System.out.println("----- Validar el promedio de los salarios de los empleados y verificar que empleados tienen un salario superior al promedio");
        arrayListPractice.salarioPromedioEmpleados();

        HashSetPractice hashSetPractice = new HashSetPractice();
        System.out.println("----- Hashset que valida la cantidad de objetos unicos en un array");
        hashSetPractice.elemntosUnicos();
        System.out.println("----- Union entre dos conjuntos usando Hashset");
        hashSetPractice.unionConjuntos();


        LinkedListPractice linkedListPractice = new LinkedListPractice();
        System.out.println("----- Muestra las posibles operaciones a una Linkedlist con una lista de frutas");
        linkedListPractice.operacionesLinkedlist();
        System.out.println("----- Muestra el nombre, edad y cargo de los empleados");
        linkedListPractice.listaEmpleados();



    }
}