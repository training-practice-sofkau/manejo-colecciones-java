package org.example.map;

import java.util.HashMap;

public class HashMapPractice_ejemplo1 {

    public  void main() {
        //creo mi coleccion , en especial la clase de esta que necesite

        HashMap<String,Empleado> personal_empresa=new HashMap<String,Empleado>();

        //agrego mis objetos a la coleccion con su respectiva clave-valor
        personal_empresa.put("001", new Empleado("Fermin Rodriguez"));
        personal_empresa.put("002", new Empleado("Majo Hernandez"));
        personal_empresa.put("003", new Empleado("Paola Hurtado"));
        personal_empresa.put("004", new Empleado("Luisa Perez"));
        personal_empresa.put("005", new Empleado("Samuel Marin"));

        //imprimo mi HashMap completo

        System.out.println(personal_empresa);

        //modifico
        personal_empresa.remove("004");
        System.out.println(personal_empresa);




    }

}
class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado(String n){
        nombre=n;
        sueldo=25000;
    }
    public String toString(){
        return "[ Nombre de la persona:"+ " "+ nombre + " "+ "su sueldo es: "+ " "+ sueldo +" "+"]";

    }
}


