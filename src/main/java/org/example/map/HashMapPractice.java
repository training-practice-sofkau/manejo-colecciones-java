package org.example.map;

import java.util.*;


public class HashMapPractice {
    public static void ejecutar() {
        System.out.println("Registro de estudiantes");
        Estudiante estudiante1 = new Estudiante(1, "Guadir", 22, new Date());
        Estudiante estudiante2 = new Estudiante(2, "Paguay", 23, new Date());
        Estudiante estudiante3 = new Estudiante(3, "Taimal", 20, new Date());
        Map<String, Estudiante> lista = new HashMap<>();
        lista.put("1", estudiante1);
        lista.put("2", estudiante2);
        lista.put("3", estudiante3);

        for (Map.Entry<String, Estudiante> e : lista.entrySet()) {
            System.out.println(e);
        }


        System.out.println("Lanzando dados");

        Dado dado1 = new Dado(6);
        System.out.println("Primer Lanzamiento: " + dado1.lanzar());

        Dado dado2 = new Dado(6);
        System.out.println("Lanzamiento Lanzamiento: " + dado2.lanzar());
    }
    }




/**
 * Ejemplo 1
 */
class Dado {
    int numCaras;
    HashMap<Integer, Integer> caraResultado;
    Random random = new Random();

    public Dado(int numCaras) {
        this.numCaras = 6;
        this.caraResultado = new HashMap<>();
        for (int i = 1; i <= numCaras; i++) {
            caraResultado.put(i, i);
        }
    }

    public int lanzar() {
        int caraAleatoria = random.nextInt(numCaras) + 1;
        return caraResultado.get(caraAleatoria);
    }
}




/**
 * Ejemplo 2
 */
class Estudiante {
    private int id;
    private String apellido;
    private int edad;
    private Date fechaIngreso;

    public Estudiante(int id, String apellido, int edad, Date fechaIngreso) {
        this.id = id;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
    }

    public Estudiante() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}
