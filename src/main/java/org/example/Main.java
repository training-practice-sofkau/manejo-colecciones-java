package org.example;

import org.example.list.arrayListExamples.example1.ListaDeCompras;
import org.example.list.arrayListExamples.example2.AccesoEquipos;
import org.example.list.arrayListExamples.example2.ManejoLista;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejemplos ArrayList");
        System.out.println("Ejemplo1");
        ListaDeCompras listaDeCompras = new ListaDeCompras();
        listaDeCompras.imprimirListaCompras();
        System.out.println("-------------------------------------------------------");
        System.out.println("Ejemplo2");
        AccesoEquipos accesoEquipos = new AccesoEquipos();
        accesoEquipos.manipularEquipos();
    }
}