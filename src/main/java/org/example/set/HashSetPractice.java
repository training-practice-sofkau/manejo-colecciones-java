package org.example.set;

import java.util.HashSet;
import java.util.Objects;

public class HashSetPractice {

    public void ejecutarHashset(){
        HashSet<Persona> lista=new HashSet<>();
        Persona p1=new Persona("Juan",123,333,17);
        Persona p2=new Persona("Camilo",234,333,18);
        Persona p3=new Persona("Pedro",345,333,20);
        Persona p4=new Persona("Vanesa",123,789,25);
        Persona p5=new Persona("Guillermo",201,412,24);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        for(Persona persona:lista){
            System.out.println(persona.getNombre());
        }
        System.out.println(lista.contains(p5));
        if(!lista.contains(p5)){
            lista.add(p5);
        }



    }
}

class Persona{
    private String nombre;
    private int id;
    private int num;
    private int edad;

    public Persona(String nombre, int id, int num, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.num = num;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return id == persona.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
