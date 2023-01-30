package org.example.list;

import java.util.LinkedList;

public class LinkedListPractice_ejemplo2 {

    public  void main() {
        //creo mi coleccion
        LinkedList<String> listaDeMisCompritas = new LinkedList<>();

        //añado objetos a mi coleccion
        listaDeMisCompritas.add("Leche");
        listaDeMisCompritas.add("Pan");
        listaDeMisCompritas.add("Quesito");
        listaDeMisCompritas.add("Galletas");
        listaDeMisCompritas.add("Manzanas");
        listaDeMisCompritas.add("Cerveza");
        listaDeMisCompritas.add("Gomitas");

        //imprimo mi lista

        System.out.println("Lista de mis compras iniciales: " + listaDeMisCompritas);

        //hago ciertas modificaciones a mi lista

        listaDeMisCompritas.addFirst("Chocolate");
        System.out.println("Agregué chocolate al principio de mi lista: " + listaDeMisCompritas);

        listaDeMisCompritas.removeLast();
        System.out.println("Eliminé las gomitas al final de mi lista: " + listaDeMisCompritas);

        listaDeMisCompritas.addLast("Peras");
        System.out.println("Agregué peras al final de mi lista: " + listaDeMisCompritas);

        listaDeMisCompritas.remove(2);
        System.out.println("Eliminé el quesito que estaba en la posición 03: " + listaDeMisCompritas);
    }
}
