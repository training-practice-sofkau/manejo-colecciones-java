package org.example.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Gatos {
    ArrayList<String> raza = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);

    public void ejecutar(){
        int opc;
        System.out.println("_________________GATOS_________________");
        do {
            System.out.println("1. Cargar razas\n" +
                    "2. Eliminar raza\n" +
                    "3. Consultar raza\n" +
                    "4. Mostrar lista de razas\n" +
                    "5. <--- Atras");
            System.out.print("Digite una opcion: ");
            opc = entrada.nextInt();
            switch (opc){
                case 1:
                    System.out.println("----------------------------------------------------------------------");
                    cargar();
                    System.out.println("Lista de razas cargadas");
                    break;
                case 2:
                    System.out.println("----------------------------------------------------------------------");
                    eliminar();
                    System.out.println("Raza de gato eliminada");
                    break;
                case 3:
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("");
                    consultar();
                    break;
                case 4:
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println(":::::::::::::::::::::Lista de razas registradas::::::::::::::::::::::");
                    mostrarLista();
                    break;
                case 5:
                    System.out.println("Saliendo.....");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opc<5);
        System.out.println(" Fin ");
    }
   public void cargar(){

       raza.add("Angora");
       raza.add("Siamés");
       raza.add("Persa");
       raza.add("Criollo");
   }

   public void eliminar(){
       int tam = raza.size();
       int indicador;
       String dato;
       System.out.println("Ingrese el indicador a eliminar");
       indicador = entrada.nextInt();
       if(indicador < tam){
           dato = raza.get(indicador-1);
           raza.remove(indicador-1);
           System.out.println("Indicador eliminado: "+dato);
       } else {
           System.out.println("Indicador errado");
       }
   }

   public void consultar (){
       int tam = raza.size();
       int indicador;
       String dato;
       System.out.println("Ingrese el indicador a consultar");
       indicador = entrada.nextInt();
       if(indicador < tam){
           dato = raza.get(indicador-1);
           System.out.println("Indicador consutado: "+dato);
       } else if(raza.isEmpty()==true){
           System.out.println("Lista vacia");
       } else {
           System.out.println("Indicador errado");
       }

   }

   public void mostrarLista (){
       if(raza.isEmpty()==true){
           System.out.println("Lista vacia");
       } else {
       for (String razas: raza) {
                System.out.println(raza);}
       }
   }


}
