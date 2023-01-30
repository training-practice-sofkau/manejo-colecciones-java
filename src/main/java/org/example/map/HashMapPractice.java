package org.example.map;


import java.util.*;

public class HashMapPractice {

    public void conteoPalabras() {

        Map<String, Integer> conteo = new HashMap<>();

        String texto = "Este es el texto que sera analizado, se validara la cantidad de veces que una palabra se repite";

        String[] palabras = texto.split(" ");

        for (String palabra : palabras) {
            palabra = palabra.toLowerCase();
            if (conteo.containsKey(palabra)) {
                conteo.put(palabra, conteo.get(palabra) + 1);
            } else {
                conteo.put(palabra, 1);
            }
        }
        System.out.println("La frase a validar es: "+ texto);
        Set<String> keys = conteo.keySet();

        for (String key : keys) {
            System.out.println("La palabra "+ key + " se repite en el texto " + conteo.get(key) + " veces.");
        }
    }


    public void departamentoEmpleados() {
        Map<String, String> empleados = new HashMap<>();

        empleados.put("Mateo", "Sistemas");
        empleados.put("Pedro", "Recursos Humanos");
        empleados.put("Andres", "Marketing");
        empleados.put("Laura", "Nomina");
        empleados.put("Julia", "Secretaria");

        Set<String> keys = empleados.keySet();

        for (String key : keys) {
            System.out.println(key + " trabaja en el departamento de " + empleados.get(key));
        }
    }

    public void edadUsuarios() {
        Map<String, Integer> usuarios = new HashMap<>();

        usuarios.put("Mateo", 25);
        usuarios.put("Marcos", 30);
        usuarios.put("Lucas", 35);

        int edad = usuarios.get("Mateo");
        System.out.println("La edad de Mateo es: " + edad);

        for (Map.Entry<String, Integer> salida : usuarios.entrySet()) {
            System.out.println(salida.getKey() + ": " + salida.getValue());
        }
    }

    public void creacionEstudiantes11() {
        int idEstudiante = 0;
        HashSet<Integer> id = new HashSet<>();
        Map<Integer, LinkedList<Double>> notasAsignaturas = new HashMap<>();
        HashMap<Integer, String> hEstudiante = new HashMap();
        ArrayList<String> notas = new ArrayList<>();
        notas.add("Primer Corte");
        notas.add("Segundo Corte");
        notas.add("Tercer Corte");
        notas.add("Cuarto Corte");


        Estudiante estudiante1 = new BuilderEstudiantes()
                .nombre1("Carlos")
                .nombre2("Stiven")
                .apellido1("Perdomo")
                .apellido2("Ruiz")
                .curso("11-02")
                .build();
        id.add(idEstudiante++);
        hEstudiante.put(idEstudiante, estudiante1.toString());
        agregarNotas(notasAsignaturas, idEstudiante, 2.5, 4.9, 3.4, 3.6);


        Estudiante estudiante2 = new BuilderEstudiantes()
                .nombre1("Edgar")
                .apellido1("Andrade")
                .curso("11-02")
                .build();
        id.add(idEstudiante++);
        hEstudiante.put(idEstudiante, estudiante2.toString());
        agregarNotas(notasAsignaturas, idEstudiante, 4.8, 3.7, 3.4, 4.7);


        Estudiante estudiante3 = new BuilderEstudiantes()
                .nombre1("Nelson")
                .nombre2("Javier")
                .apellido1("Garzon")
                .apellido2("Gamez")
                .curso("11-01")
                .build();
        id.add(idEstudiante++);
        hEstudiante.put(idEstudiante, estudiante3.toString());
        agregarNotas(notasAsignaturas, idEstudiante, 1.2, 3.8, 3.3, 2.7);
        for (Integer key : hEstudiante.keySet()) {
            System.out.println("ID del estudiante: " + key + hEstudiante.get(key) + " Calificaciones: " + notasAsignaturas.get(key));
        }
    }

    // Investigando econtre qeu la sintaxis Double... es arreglo variable de longitud quepermite pasar un número variable de argumentos de tipo double al método
// Se tratan como un arreglo de doubles lo que permite que el método sea más flexible ya que no se tiene que especificar un número fijo de valores, sino que se pueden pasar cualquier cantidad de ellos.
    public static void agregarNotas(Map<Integer, LinkedList<Double>> notasAsignaturas, Integer id, double... notas) {
        LinkedList<Double> datos = notasAsignaturas.get(id);
        if (datos == null) {
            datos = new LinkedList<>();
            notasAsignaturas.put(id, datos);
        }
        for (double value : notas) {
            datos.add(value);
        }
    }
}


class Estudiante {

    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String curso;


    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    @Override
    public String toString() {
        String estudiante = "| Nombre: ";
        if (nombre1 != null) {
            estudiante += nombre1 + " ";
        }
        if (nombre2 != null) {
            estudiante += nombre2 + " ";
        }
        if (apellido1 != null) {
            estudiante += "| Apellido: " + apellido1 + " ";
        }
        if (apellido2 != null) {
            estudiante += apellido2 + " ";
        }
        if (curso != null) {
            estudiante += "| Curso: " + curso + "|";
        }
        return estudiante;
    }
}

class BuilderEstudiantes {
    private Estudiante estudiante;

    public BuilderEstudiantes() {
        estudiante = new Estudiante();
    }

    public BuilderEstudiantes nombre1(String nombre1) {
        estudiante.setNombre1(nombre1);
        return this;
    }

    public BuilderEstudiantes nombre2(String nombre2) {
        estudiante.setNombre2(nombre2);
        return this;
    }

    public BuilderEstudiantes apellido1(String apellido1) {
        estudiante.setApellido1(apellido1);
        return this;
    }

    public BuilderEstudiantes apellido2(String apellido2) {
        estudiante.setApellido2(apellido2);
        return this;
    }

    public BuilderEstudiantes curso(String curso) {
        estudiante.setCurso(curso);
        return this;
    }

    public Estudiante build() {
        return this.estudiante;
    }


}

