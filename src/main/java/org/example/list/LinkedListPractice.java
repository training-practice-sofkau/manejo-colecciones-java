package org.example.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {

    public void ejemplo1(){
        LinkedList <Producto> listaProductos = new LinkedList<>();
        listaProductos.add(new Producto("Cafe", 5200));
        listaProductos.add(new Producto("Azucar", 3000));
        listaProductos.add(new Producto("Panela", 2500));
        listaProductos.add(new Producto("Arroz", 2200));

        System.out.println("El tamaño del lista es: "+ listaProductos.size());
        System.out.println("   Lista de prodcutos");
        for (Producto productos:listaProductos) {
            System.out.println(productos.toString());
        }

        listaProductos.removeLast();
        listaProductos.addFirst(new Producto("Aceite",6000));
        System.out.println("   Lista de prodcutos Actualizada");
        for (Producto productos:listaProductos) {
            System.out.println(productos.toString());
        }
    }
    public void ejemplo2(){
        LinkedList<Electrodomesticos> listaElec = new LinkedList<>();
        listaElec.add(new Electrodomesticos("Nevera"));
        listaElec.add(new Electrodomesticos("Lavadora"));
        listaElec.add(new Electrodomesticos("Televisor"));
        System.out.println("   Lista de electrodomesticos");
        for (Electrodomesticos lista:listaElec) {
            System.out.println(lista.toString());
        }
        listaElec.removeFirst();
        listaElec.addLast(new Electrodomesticos("Grabadora"));
        System.out.println("   Lista de electrodomesticos Actualizada");
        for (Electrodomesticos lista:listaElec) {
            System.out.println(lista.toString());
        }
    }
    public void ejemplo3(){
        LinkedList<String> departamento= new LinkedList<>();
        departamento.add("Huila");
        departamento.add("Caldas");
        departamento.add("Cundinamarca");

        LinkedList<String> capital= new LinkedList<>();
        capital.add("Neiva");
        capital.add("Manizalez");
        capital.add("Bogota");

        ListIterator<String> iterador1= departamento.listIterator();
        ListIterator<String> iterador2= capital.listIterator();

        while (iterador2.hasNext()){

            if (iterador1.hasNext()){
                iterador1.next();
            }
            iterador1.add(iterador2.next());
        }
        System.out.println(departamento);



    }

}
