package org.example.list.arrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     * */

    /**
     * *************   Ejercicio # 1  ********
     */
    private Persona personas[];
    private int contadorPersonas;
    public ArrayListPractice() {
        this.personas = new Persona[9];
    }

    public void agregarPersona(Persona persona){
        this.personas[this.contadorPersonas++] = persona;
    }
    public void mostrarInformacionPersona(){

        for (int i = 0; i < this.contadorPersonas; i++){
            System.out.println(this.personas[i]);
        }
    }

    public static void ejecutar(){
        System.out.println("*****   Ejercicio # 1  *******\n");
        Persona persona1 = new Persona().setNombre("Antonio").setEdad(45);
        Persona persona2 = new Persona().setNombre("Yarledis").setEdad(40);
        ArrayListPractice arrayListPractice = new ArrayListPractice();
        arrayListPractice.agregarPersona(persona1);
        arrayListPractice.agregarPersona(persona2);
        arrayListPractice.mostrarInformacionPersona();
    }

    /**
     * *************   Ejercicio # 2  ********
     */

    public static void ejecutarEjercicio2(){
        System.out.println();
        System.out.println("*****   Ejercicio # 2  *******\n");
        List<Computador> lista = new ArrayList<>();
        lista.add(new Computador("Portatil","Asus", 12.5));
        lista.add(new Computador("Pc de escritorio","Lenovo", 15.5));
        lista.add(new Computador("Portatil","Asus", 12.5));
        lista.add(new Computador("Portatil","Lg", 11.6));

        lista.forEach(informacion -> {
            System.out.println("Información del computador = " + informacion +"\n");
        });

    }


    /**
     * *************   Ejercicio # 3  ********
     */

    public static void ejecutarEjercicio3(){
        System.out.println("*****   Ejercicio # 3  *******\n");
        List<Pais> pais = new ArrayList<>();
        pais.add(new Pais("Colombia"));
        pais.add(new Pais("Chile"));
        pais.add(new Pais("España"));
        pais.add(new Pais("Panama"));
        pais.forEach(informacion->{
            System.out.println("El nombre del pais es: " + informacion);
        });

    }
    public static void ejecutarPrincipal(){
        ejecutar();
        ejecutarEjercicio2();
        ejecutarEjercicio3();

    }

}
