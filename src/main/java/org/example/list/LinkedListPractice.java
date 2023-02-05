package org.example.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public void ejecutar() {
        LinkedList<Comida> list = ComidaRestaurante.getLinkedListInstance();
        list.add(new Comida("Rapida", 30003, 2));


        System.out.println("Cantidad de platos: " + list.size());
        System.out.println("Platos disponibles: " + list.toString());
        System.out.println("Platos disponibles: " + list.remove());
        System.out.println("Agregar tipo comida: " + list.add(new Comida("Rapida", 8900, 1)));
        System.out.println("Eliminar por index: " + list.remove(1));
        System.out.println("Eliminar de la lista, primer elemento: " + list.pollFirst());


    }
}

class ComidaRestaurante {
    public static LinkedList<Comida> getLinkedListInstance() {
        return new LinkedList<Comida>();
    }
}


class Comida {
    String tipoComida;
    float precio;
    int tiempoPreparacion;

    public Comida(String tipoComida, float precio, int tiempoPreparacion) {
        this.tipoComida = tipoComida;
        this.precio = precio;
        this.tiempoPreparacion = tiempoPreparacion;
    }

}