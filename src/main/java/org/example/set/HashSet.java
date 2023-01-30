package org.example.set;

import org.example.list.Producto;

import java.util.Set;

public class HashSet {
    public void ejemplo1(){
        Set<String> computadores = new java.util.HashSet<>();
        computadores.add("Lenovo");
        computadores.add("Apple");
        computadores.add("Toshiba");
        computadores.add("Dell");

        System.out.println("El numero de Computadores cargados son: "+ computadores.size());
        System.out.println("Lista de computadores");
        System.out.println(computadores);
        if (computadores.equals("Acer")){
            System.out.println("Se encontro un comoputador Acer");
        }else {
            System.out.println("No se encontro ningun computador Acer");
        }
    }
    public void ejemplo2(){

    }
    public void ejemplo3(){

    }
}
