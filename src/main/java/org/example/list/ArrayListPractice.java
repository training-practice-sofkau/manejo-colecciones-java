package org.example.list;
import java.util.ArrayList;

public class ArrayListPractice {
    public void ejecutarArray(){

        System.out.println("------EJEMPLO 1-------");

        ArrayList<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona("Juan", 22, 1));
        lista.add(new Persona("Carlos", 28, 2));
        lista.add(new Persona("Pedro", 30, 3));

        for (Persona person: lista){
            System.out.println("Numero: " + person.getNumero());
            System.out.println("Nombres: " + person.getNombre());
            System.out.println("Edad: " + person.getEdad());
        }

        System.out.println("------EJEMPLO 2-------");

        ArrayList<Carro> Lista2 = new ArrayList<Carro>();
        Lista2.add(new Carro("AHS 295", "Rojo"));
        System.out.println(Lista2.size());
        Lista2.add(new Carro("HYE 194", "Negro"));
        System.out.println(Lista2.size());

        System.out.println("------EJEMPLO 3-------");

        ArrayList<Tienda> Tienda = new ArrayList<Tienda>();
        Tienda tiendaLaEsquina = new Tienda(5,8,10,3);
        Tienda.add(tiendaLaEsquina);
        System.out.println("Se agregó una tienda");
        System.out.println(Tienda.size());
        Tienda.clear();
        System.out.println("Se eliminó una tienda");
        System.out.println(Tienda.size());



    }
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     * */
}
