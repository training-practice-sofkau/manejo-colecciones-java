package org.example.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetpractice {
    public void ejemplo1(){
        Set<String> computadores = new HashSet<>();
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
        Set <String> trianguloslados = new HashSet<>();
        Set <String> triangulosAngulos = new HashSet<>();
        trianguloslados.add("Equilatero");
        trianguloslados.add("Isoceles");
        trianguloslados.add("Escaleno");
        triangulosAngulos.add("Rectangulo");
        triangulosAngulos.add("Acutangulo");
        trianguloslados.add("Onstusangulo");
        trianguloslados.addAll(triangulosAngulos);
        System.out.println("Clasificacion de los Triangulos:" + trianguloslados);
        System.out.println("Tamaño de la lista: "+ trianguloslados.size());
    }
    public void ejemplo3(){
        Set <String> profesiones = new HashSet<>();
        profesiones.add("Medico");
        profesiones.add("Ingeniero");
        profesiones.add("Abogados");
        profesiones.add("Veterinarios");
        System.out.println("Lista de profesiones");
        for (String labores:profesiones) {
            System.out.println(labores);
        }
        profesiones.remove("Abogados");
        System.out.println("Lista de profesiones Actualizada");
        for (String labores2:profesiones) {
            System.out.println(labores2);
        }
    }
}
