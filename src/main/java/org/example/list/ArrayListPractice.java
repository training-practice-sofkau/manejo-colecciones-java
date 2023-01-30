package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     * */
    public  void ejecutar(){

        List<Departamento> departamentos = new ArrayList<>();
        departamentos.add(new Departamento("Cundinamarca", "Bogotá", 11181000, 242102 ));
        departamentos.add(new Departamento("Valle del Cauca", "Cali", 1118100, 24212 ));
        for (Departamento departamento: departamentos){
            departamento.imprimirDepartamento();

        }


    }

    class Departamento{


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

        public void imprimirDepartamento(){
            System.out.println("Departamento= "+ departamento);
            System.out.println("Capital= "+ capital);
            System.out.println("Habitantes= "+ habitates);
            System.out.println("Area(km2)= "+ area);
        }
    }








}
