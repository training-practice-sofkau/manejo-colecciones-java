package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     */
    public void ejecutar() {
        System.out.println("Ejemplo 1");
        List<Departamento> departamentos = new ArrayList<>();
        departamentos.add(new Departamento("Cundinamarca", "Bogotá", 11181000, 242102));
        departamentos.add(new Departamento("Valle del Cauca", "Cali", 1118100, 24212));
        for (Departamento departamento : departamentos) {
            departamento.imprimirDepartamento();
        }
        System.out.println("Ejemplo 2 ");
        Dell dell = new Dell();
        Apple apple = new Apple();

        Saludo saludo = new Saludo();
        saludo.agregarMarcaComputadora(dell, apple);
        //saludo.agregarMarcaComputadora(apple);

        saludo.ejecutarSoftware();

        System.out.println("Ejemplo 3 ");
        Computador computador = new Computador();
        computador.agregarComponente(new Driver());
        computador.agregarComponente(new Software());
        computador.ejecutarComponente();
    }

    class Departamento {
        String departamento;
        String capital;
        int habitates;
        float area;

        public Departamento(String departamento, String capital, int habitates, float area) {
            this.departamento = departamento;
            this.capital = capital;
            this.habitates = habitates;
            this.area = area;
        }
        public void imprimirDepartamento() {
            System.out.println("Departamento= " + departamento);
            System.out.println("Capital= " + capital);
            System.out.println("Habitantes= " + habitates);
            System.out.println("Area(km2)= " + area);
        }
    }
}

/**
 * Ejemplo hola mundo desde diferentes computadoras.
 */
abstract class MarcaComputadora {
    abstract void ejecutarSoftware();
}

class Dell extends MarcaComputadora {
    void ejecutarSoftware() {
        System.out.println("Hola mundo desde Dell");
    }
}

class Apple extends MarcaComputadora {
    void ejecutarSoftware() {
        System.out.println("Hola mundo desde Apple");
    }
}

class Saludo {
    ArrayList<MarcaComputadora> marcasComputadora = new ArrayList<>();


    void agregarMarcaComputadora(Dell dell, Apple apple){
            marcasComputadora.add(dell);
            marcasComputadora.add(apple);
    }


    void ejecutarSoftware( ){
        for (MarcaComputadora  marcaComputadora : marcasComputadora){
            marcaComputadora.ejecutarSoftware();
        }
    }
}
/**
 * Ejemplo hola mundo desde diferentes computadoras.
 */
interface Ejecutable{
    void ejecutar();
}
class Software implements Ejecutable{

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando software");
    }
}

class Driver implements Ejecutable{

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando drive");
    }
}

class Computador{
    private ArrayList<Ejecutable> ejecutableArrayList = new ArrayList<>();

    void agregarComponente(Ejecutable ejecutable){
        ejecutableArrayList.add(ejecutable);
    }

    void ejecutarComponente(){
        for(Ejecutable ejecutable: ejecutableArrayList){
            ejecutable.ejecutar();
        }
    }
}