package org.example.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Gatos {
    ArrayList<String> raza = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);
   public void cargarRaza(){

       raza.add(1,"Angora");
       raza.add(2, "Siames");
       raza.add(3, "Persa");
       raza.add(4, "Criollo");
   }

   public void eliminarRaza(){
       int tam = raza.size();
       int indicador;
       System.out.println("Ingrese el indicador a eliminar");
       indicador = entrada.nextInt();
       if(indicador < tam){
           raza.remove(tam);
           System.out.println("Indicador eliminado");
       } else {
           System.out.println("Imdicador errado");
       }
   }

   public void consultarRaza (){
       int tam = raza.size();
       int indicador;
       String dato;
       System.out.println("Ingrese el indicador a consultar");
       indicador = entrada.nextInt();
       if(indicador < tam){
           dato = raza.get(indicador);
           System.out.println("Indicador consutado: "+dato);
       } else {
           System.out.println("Indicador errado");
       }

   }

   public void mostrarLista (){
       for (String razas: raza) {
                System.out.println(raza);}
   }


}
