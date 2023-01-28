package org.example.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Identificacion {
    ArrayList<Integer> id = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);

    public void ejecutar(){
        int opc;
        System.out.println("_________________IDENTIFICACIONES_________________");
        do {
            System.out.println("1. Cargar registros\n" +
                    "2. Eliminar identificacion\n" +
                    "3. Consultar identificacion\n" +
                    "4. Mostrar registro de identificaciones\n" +
                    "5. <--- Atras");
            System.out.print("Digite una opcion: ");
            opc = entrada.nextInt();
            switch (opc){
                case 1:
                    System.out.println("----------------------------------------------------------------------");
                    cargar();
                    System.out.println("Lista de registros cargados");
                    break;
                case 2:
                    System.out.println("----------------------------------------------------------------------");
                    eliminar();
                    System.out.println("Registro eliminado");
                    break;
                case 3:
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("");
                    consultar();
                    break;
                case 4:
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println(":::::::::::::::::::::Lista peso diario registrados::::::::::::::::::::::");
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

        id.add(1);
        id.add(2);
        id.add(3);
        id.add(4);
        id.add(5);
        id.add(6);
        id.add(7);
        id.add(8);
        id.add(9);
        id.add(10);
        id.add(11);
        id.add(12);
        id.add(13);
        id.add(14);
    }

    public void eliminar(){
        int tam = id.size();
        int indicador;
        int dato;
        System.out.println("Ingrese la identificacion a eliminar");
        indicador = entrada.nextInt();
        if(indicador < tam){
            dato = id.get(indicador-1);
            id.remove(indicador-1);
            System.out.println("Registro eliminado: "+dato);
        } else {
            System.out.println("Opcion no valido");
        }
    }

    public void consultar (){
        int tam = id.size();
        int indicador;
        int dato;
        System.out.println("Ingrese la identificacion a consultar");
        indicador = entrada.nextInt();
        if(indicador < tam){
            dato = id.get(indicador-1);
            System.out.println("Idntificacion consutado: "+dato);
        } else if(id.isEmpty()==true){
            System.out.println("Lista vacia");
        } else {
            System.out.println("Seleccion no valida");
        }

    }

    public void mostrarLista (){
        if(id.isEmpty()==true){
            System.out.println("Lista vacia");
        } else {
            for (Integer ids: id) {
                System.out.println(ids);}
        }
    }
}
