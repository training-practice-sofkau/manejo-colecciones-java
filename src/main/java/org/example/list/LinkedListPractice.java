package org.example.list;

import java.text.DateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListPractice {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     */

    private String nombre;
    private String profesion;
    private int edad;
    private int dia;
    private int mes;
    private int anio;

    Scanner entrada = new Scanner(System.in);
    Deporte deporte = new Deporte();
    Persona persona = new Persona(nombre, profesion, edad);
    FechasEspeciales fechasEspeciales = new FechasEspeciales(dia,mes,anio);
    int opc;

    public void ejecutar() {

            System.out.println("_______________________________________________________________________EJERCICIOS LINKEDLIST________________________________________________");
            deporte.ejecutar();
            System.out.println("----------------------------------------------------------------------");
            persona.ejecutar();
            System.out.println("----------------------------------------------------------------------");
            fechasEspeciales.ejecutar();
            System.out.println("_______________________________________________________________________");
        }
}

/**
 * Ejercicio 1
 */
 class Deporte implements Operaciones {
    LinkedList<String> sport = new LinkedList<>();
    Scanner entrada = new Scanner(System.in);

    @Override
    public void ejecutar() {

        int opc;
        System.out.println("_________________DEPORTES_________________");
        do {
            System.out.println("1. Cargar registros\n" +
                    "2. Eliminar Deporte\n" +
                    "3. Consultar deporte\n" +
                    "4. Mostrar lista de registros\n" +
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
                    System.out.println(":::::::::::::::::::::Lista de deportes registrados::::::::::::::::::::::");
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
    @Override
    public void cargar(){

        sport.add("Ciclismo");
        sport.add("Futbol");
        sport.add("Atletismo");
        sport.add("Natacion");
        sport.add("Patinaje");

    }

    @Override
    public void eliminar() {

        int indicador;
        String dato;
        System.out.println("Ingrese el registro a eliminar");
        indicador = entrada.nextInt();

        switch (indicador){
            case 1:
                if(indicador == 1){
                    sport.removeFirst();
                    System.out.println("Primer registro eliminado");
                }
                break;
            case 2:
                if(indicador == sport.size()){
                    sport.removeLast();
                    System.out.println("Ultimo registro elimiado");
                }
            case 3:
                if(indicador < sport.size()){
                    dato = sport.get(indicador-1);
                    sport.remove(indicador-1);
                    System.out.println("Registro eliminado: "+dato);
                } else {
                    System.out.println("Entrada no valida");
                }
                break;
            default :
                System.out.println("Error");
        }

    }

    @Override
    public void mostrarLista() {
        if(sport.isEmpty()==true){
            System.out.println("Lista vacia");
        } else {
            for (String sports: sport) {
                System.out.println(sports);}
        }
    }

    @Override
    public void consultar() {
        int indicador;
        String dato;
        System.out.println("Ingrese el indicacor a consultar");
        indicador = entrada.nextInt();
        if(indicador < sport.size()){
            dato = sport.get(indicador-1);
            System.out.println("Deporte consutado: "+dato);
        } else if(sport.isEmpty()==true){
            System.out.println("Lista vacia");
        } else {
            System.out.println("Item errado");
        }
    }

}
/**
 * Ejercicio 2
 */
class Persona implements Operaciones{
    private String nombre;
    private String profesion;
    private int edad;
    LinkedList<Persona> lista = new LinkedList<>();
    public Persona(String nombre, String profesion, int edad) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.edad = edad;

    }

    @Override
    public void ejecutar() {
        System.out.println("______________________PERSONAS_______________________");
        cargar();
        System.out.println("________________________________________________________________");
        mostrarLista();
        System.out.println("________________________________________________________________");
        consultar();
        System.out.println("________________________________________________________________");
        eliminar();
        System.out.println("________________________________________________________________");
        mostrarLista();

    }

    @Override
    public void cargar() {
        lista.add(new Persona("Jose", "Conductor", 32));
        lista.add(new Persona("Fernando", "Mecanico", 27));
        lista.add(new Persona("Andrea","Operadora de Grua", 30));
        lista.add(new Persona("Felipe", "Medico", 45));
        lista.add(new Persona("Maira", "Ingeniera", 36));
        System.out.println("Registros cargados");

    }

    @Override
    public void eliminar() {
        System.out.println("Se elimino el registro "+lista.remove(2).toString1());
    }

    public String toString1(){
    return "Persona: "+nombre+"     Profesion: "+profesion+"    Edad: "+edad;
    }
    @Override
    public void mostrarLista() {
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i).toString1());
        }

    }


    @Override
    public void consultar() {
        System.out.println("Persona consultad"+lista.get(2).toString1());
    }
}

/**
 * Ejercicio tres
 */
class FechasEspeciales implements Operaciones{
    LinkedList<Date>  fechasEspeciales = new LinkedList<>();
    private int dia;
    private int mes;
    private int anio;
    public FechasEspeciales(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public void ejecutar() {
        System.out.println("_________________FECHAS ESPECIALES_________________");
        cargar();
        System.out.println("________________________________________________________________");
        mostrarLista();
        System.out.println("________________________________________________________________");
        consultar();
        System.out.println("________________________________________________________________");
        eliminar();
        System.out.println("________________________________________________________________");
        mostrarLista();

    }

    @Override
    public void cargar() {
        fechasEspeciales.add(new Date(2013,7, 22));
        fechasEspeciales.add(new Date(2017,8,17));
        fechasEspeciales.add(new Date(2017,8,17));
        fechasEspeciales.add(new Date(2015,9,9));
        fechasEspeciales.add(new Date(2016,12,24));
        fechasEspeciales.add(new Date(2010,7,10));
        fechasEspeciales.add(new Date(2015,8,30));
        fechasEspeciales.add(new Date(2015,8,30));

        System.out.println("Registros cargados");

    }

    @Override
    public void eliminar() {
        System.out.println("Se elimino el registro "+fechasEspeciales.remove(2).getYear()+" "
                            +fechasEspeciales.remove(2).getMonth()+" "
                            +fechasEspeciales.remove(2).getDay());
        System.out.println("Se elimino el registro "+fechasEspeciales.removeLast().getYear()+" "
                            +fechasEspeciales.removeLast().getMonth()+" "
                            +fechasEspeciales.removeLast().getDay());
    }

    @Override
    public void mostrarLista() {
        System.out.println("Fechas especiales registradas");
        for(int i=0; i<fechasEspeciales.size();i++){
            System.out.println(fechasEspeciales.get(i).getYear()+" "
                    +fechasEspeciales.get(i).getMonth()+" "
                    +fechasEspeciales.get(i).getDay());
        }
    }

    @Override
    public void consultar() {
        System.out.println("Fecha consulta: "+fechasEspeciales.get(2).getYear()+" "
                            +fechasEspeciales.get(2).getMonth()+" "
                            +fechasEspeciales.get(2).getDay());
    }
}