package org.example.list.LinkedList;

import java.io.File;
import java.util.LinkedList;

public class LinkedListPractice {

    public void ejecutar (){

        LinkedList <FilaDePersonas> filas = new LinkedList<>();

        filas.add(new FilaDePersonas( "Luis Fernando", 12345));
        filas.add(new FilaDePersonas( "Luisa", 123456));
        filas.add(new FilaDePersonas( "Maria", 1234567));
        filas.add(new FilaDePersonas( "Libardo", 12345678));
        filas.add(new FilaDePersonas( "Santiago", 123456789));

        String nombre = "Luisa";

        for (FilaDePersonas fila2 : filas){
            if(fila2.getNombre().equals(nombre)){
                System.out.println("El usuario que fue sacado de la lista es " + fila2.getNombre());
                filas.remove(fila2);
                break;
            }
        }

        for (FilaDePersonas fila : filas){
            System.out.println("Los usuarios que siguen en la fila son " + fila.getNombre());
        }

    }


    public void ejecutar2(){
        LinkedList <Tareas> tareas = new LinkedList<>();

        tareas.add(new Tareas("Hacer ejercicio", "Nuevo"));
        tareas.add(new Tareas("Ir a la master class", "Pendiente"));
        tareas.add(new Tareas("Pagar las facturas", "Urgente"));

        String tarea = "Ir a la master class";

        for (Tareas tareas1: tareas){
            System.out.println("La tarea realizada es " + tareas1.getName());
            if (tareas1.getName().equals(tarea)) {

                tareas.remove(tareas1);
                break;
            }
        }

        for (Tareas tarea1 : tareas){
            System.out.println("Las tareas pendientes son " + tarea1.getName());
        }
    }

    public void ejecutar3(){
        LinkedList <OvejasParaDormir> ovejitas = new LinkedList<>();

        ovejitas.add(new OvejasParaDormir(1));
        ovejitas.add(new OvejasParaDormir(2));
        ovejitas.add(new OvejasParaDormir(3));
        ovejitas.add(new OvejasParaDormir(4));

        for (OvejasParaDormir oveja : ovejitas){
            System.out.println("Voy contando mis ovejas para dormirme "+ oveja.getCantidad());
        }
    }
}


class FilaDePersonas{

    private String nombre;
    private int cedula;

    public FilaDePersonas(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }
}

class Tareas{
    private String name;
    private String status;

    public Tareas(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}

class OvejasParaDormir{
    private int cantidad;

    public OvejasParaDormir(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
}
