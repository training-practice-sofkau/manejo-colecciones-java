package org.example;

import org.example.list.arrayListExamples.example1.ListaDeCompras;
import org.example.list.arrayListExamples.example2.AccesoEquipos;
import org.example.list.arrayListExamples.example3.SeriesList;
import org.example.list.linkedListExamples.example1.LinkedListFriends;
import org.example.list.linkedListExamples.example2.LinkedListRoster;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejemplos ArrayList");
        System.out.println("Ejemplo1:");
        ListaDeCompras listaDeCompras = new ListaDeCompras();
        listaDeCompras.imprimirListaCompras();
        System.out.println("-------------------------------------------------------");
        System.out.println("Ejemplo2:");
        AccesoEquipos accesoEquipos = new AccesoEquipos();
        accesoEquipos.manipularEquipos();
        System.out.println("----------------------------------------------------------");
        System.out.println("Ejemplo 3:");
        SeriesList seriesList = new SeriesList();
        System.out.println("La lista de seires contiene a the Wire? " + seriesList.getSeries().contains("The Wire"));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Ejemplos Linkedlist");
        System.out.println("Ejemplo1:");
        LinkedListFriends linkedListFriends = new LinkedListFriends();
        linkedListFriends.createLinkedList();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Ejemplo2:");
        LinkedListRoster linkedListRoster = new LinkedListRoster();
        linkedListRoster.roster();
    }
}