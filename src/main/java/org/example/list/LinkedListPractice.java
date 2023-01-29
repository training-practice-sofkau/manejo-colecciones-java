package org.example.list;

import java.util.LinkedList;

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

    }
    public void ejemplo3(){

    }

}
