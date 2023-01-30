package org.example.list;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListPractice {

    public void ejecutarLinkedList1(){
        int a=1;
        String persona;
        Scanner entrada=new Scanner(System.in);
        LinkedList<String> personas=new LinkedList<>();
        LinkedList<String> personas1=new LinkedList<>();

        personas.add("Carlos");
        personas.add("Mauro");
        personas.add("Isabella");
        personas.add("Camilo");
        personas.add("Laura");
        personas.add("Vanessa");

        System.out.println(personas.size());

        personas1 = (LinkedList) personas.clone();

        while(a==1){
            System.out.println("1 si desea ingresar una persona");
            a=entrada.nextInt();
            if(a==1){
                System.out.println("Ingrese el nombre de la persona");
                persona=entrada.next();
                personas.add(persona);
            }
        }

        for(String per:personas){
            System.out.println("nombre: "+per);
        }

        for(String per:personas1){
            System.out.println("nombre1: "+per);
        }

        System.out.println(personas.contains("Sara"));
        if(personas.contains("Sara")==false){
            personas.add("Sara");
        }
        System.out.println(personas.contains("Sara"));

        System.out.println(personas1.element());



    }
}
