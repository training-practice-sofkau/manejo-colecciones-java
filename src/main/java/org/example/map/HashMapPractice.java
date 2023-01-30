package org.example.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class HashMapPractice {
    public static void ejecutar(){

        Paciente paciente1 = new Paciente("Juan Perez", "01/01/2000", 1);
        Paciente paciente2 = new Paciente("María Rueda", "02/01/2000", 2);

        Medico medico1 = new Medico("Dr. Juan", 1);
        Medico medico2 = new Medico("Dr. Maria", 2);

        Consulta consulta1 = new Consulta("01/01/2021 10:00", paciente1, medico1);
        Consulta consulta2 = new Consulta("01/02/2021 10:00", paciente2, medico1);
        Consulta consulta3 = new Consulta("01/03/2021 10:00", paciente1, medico2);

        paciente1.consultas.add(consulta1);
        paciente2.consultas.add(consulta2);
        paciente2.consultas.add(consulta3);

        medico1.pacientes.add(paciente1);
        medico1.pacientes.add(paciente2);
        medico2.pacientes.add(paciente2);

        HashMap<Integer, Paciente> pacientesMap = new HashMap<>();
        pacientesMap.put(paciente1.id, paciente1);
        pacientesMap.put(paciente2.id, paciente2);

        HashMap<Integer, Medico> medicosMap = new HashMap<>();
        medicosMap.put(medico1.id, medico1);
        medicosMap.put(medico2.id, medico2);

        //Iterando lista pacientes.

        for (Paciente paciente : pacientesMap.values()) {
            System.out.println("Paciente: " + paciente.nombre);

            System.out.println("Fecha de nacimiento: " + paciente.fechaNacimiento);

        }


    }






}




class Paciente {
    String nombre;
    String fechaNacimiento;
    int id;
    List<Consulta> consultas;

    public Paciente(String nombre, String fechaNacimiento, int id) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.id = id;
        this.consultas = new ArrayList<>();
    }
}

class Medico {
    String nombre;
    int id;
    List<Paciente> pacientes;

    public Medico(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.pacientes = new ArrayList<>();
    }
}

class Consulta {
    String fechaHora;
    Paciente paciente;
    Medico medico;

    public Consulta(String fechaHora, Paciente paciente, Medico medico) {
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
    }
}




