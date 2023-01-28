package org.example.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Perros {
    ArrayList<String> razap = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);
    public void cargarRaza(){

        razap.add(1,"Pincher");
        razap.add(2, "San Bernardo");
        razap.add(3, "Pastor Siberiano");
        razap.add(4, "Pastor Aleman");
        razap.add(5, "Criollo");
    }

    public void eliminarRazaP(){
        int tam = razap.size();
        int indicador;
        System.out.println("Ingrese el indicador a eliminar");
        indicador = entrada.nextInt();
        if(indicador < tam){
            razap.remove(tam);
            System.out.println("Indicador eliminado");
        } else {
            System.out.println("Imdicador errado");
        }
    }

    public void consultarRazaP (){
        int tam = razap.size();
        int indicador;
        String dato;
        System.out.println("Ingrese el indicador a consultar");
        indicador = entrada.nextInt();
        if(indicador < tam){
            dato = razap.get(indicador);
            System.out.println("Indicador consutado: "+dato);
        } else {
            System.out.println("Indicador errado");
        }

    }

    public void mostrarLista (){
        for (String razas: razap) {
            System.out.println(razap);}
    }
}
