package org.example.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public void ejemploUnoHashSet() {
        // Crea un HashSet de objetos Persona
        Set<Persona> personas = new HashSet<>();

        // Añade objetos de la clase Persona a personas
        personas.add(new Persona("Miguel", 26));
        personas.add(new Persona("Mafer", 22));
        personas.add(new Persona("Andres", 27 ));

        // Imprime el HashSet
        System.out.println("Elementos en el conjunto: " + personas);

        // Comprobar si el set esta vacio
        boolean vacio = personas.isEmpty();
        System.out.println("La lista esta vacia? " + personas.isEmpty());

        //Eliminar un objeto de la clase Persona a personas
        personas.remove(new Persona("Andres",27));

        // Verifica si un objeto Persona está en el HashSet
        System.out.println("¿Está Ana en el conjunto?: " + personas.contains(new Persona("Andres", 27)));

        // Imprime el HashSet
        System.out.println("Elementos en el conjunto: " + personas);
    }

    public void ejemploDosHashSet() {
        // Crea un HashSet de objetos Libro
        Set<Libro> libros = new HashSet<>();
        // Añade objetos de la clase Libro a libros
        libros.add(new Libro("El mundo y sus demonios", "Carl Sagan", 1, 1995));
        libros.add(new Libro("La teoria del todo", "Stephen Hawking", 1, 2002));
        libros.add(new Libro("Cien años de soledad", "Gabriel Garcia Maquez", 1, 1967));
        libros.add(new Libro("Cien años de soledad", "Gabriel Garcia Maquez", 1, 1967));
        libros.add(new Libro("El mundo y sus demonios", "Carl Sagan", 1, 1995));

        // Imprime elos objetos
        System.out.println("Número de libros en el conjunto: " + libros.size());
        for (Libro lib : libros) {
            System.out.println(lib.getTitulo() + " por " + lib.getAutor() + " Edición " + lib.getEdicion() + " publicado en " + lib.getYear());
        }
    }

    public void ejemploTresHashSet() {
        HashSet<Empleado> empleados = new HashSet<>();

        empleados.add(new Empleado("Miguel Molina",123456789));
        empleados.add(new Empleado("Miguel Molina",123456789));
        empleados.add(new Empleado("Miguel Molina",987654321));
        empleados.add(new Empleado("Miguel Molina",987654321));

        System.out.println("Número de libros en el conjunto: " + empleados.size());
        for (Empleado emp : empleados) {
            System.out.println(emp.getNombre() + " " + emp.getCc());
        }

    }
}



