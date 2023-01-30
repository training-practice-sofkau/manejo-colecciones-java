package org.example.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Perros implements Operaciones{
    ArrayList<Double> peso = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);

    public void ejecutar(){
        int opc;
        System.out.println("_________________REGISTRO DE PESO DIARIO_________________");
        do {
            System.out.println("1. Cargar registros\n" +
                    "2. Eliminar Peso\n" +
                    "3. Consultar peso del dia\n" +
                    "4. Mostrar registro de peso diario\n" +
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

        peso.add(12.2);
        peso.add(12.2);
        peso.add(12.4);
        peso.add(12.3);
        peso.add(12.3);
        peso.add(12.7);
        peso.add(12.6);
        peso.add(12.8);
        peso.add(12.8);
        peso.add(13.0);
        peso.add(12.9);
        peso.add(13.1);
        peso.add(13.1);
        peso.add(13.2);
        peso.add(13.3);


    }

    public void eliminar(){
        int tam = peso.size();
        int indicador;
        Double dato;
        System.out.println("Ingrese el dia a eliminar");
        indicador = entrada.nextInt();
        if(indicador < tam){
            dato = peso.get(indicador-1);
            peso.remove(indicador-1);
            System.out.println("Registro eliminado: "+dato);
        } else {
            System.out.println("Dia no valido");
        }
    }

    public void consultar (){
        int tam = peso.size();
        int indicador;
        Double dato;
        System.out.println("Ingrese el dia a consultar");
        indicador = entrada.nextInt();
        if(indicador < tam){
            dato = peso.get(indicador-1);
            System.out.println("Dia consutado: "+indicador+"    peso: "+dato);
        } else if(peso.isEmpty()==true){
            System.out.println("Lista vacia");
        } else {
            System.out.println("Dia errado");
        }

    }

    public void mostrarLista (){
        if(peso.isEmpty()==true){
            System.out.println("Lista vacia");
        } else {
            for (Double pesos: peso) {
                System.out.println(pesos);}
        }
    }
}
