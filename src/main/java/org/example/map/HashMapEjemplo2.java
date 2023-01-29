package org.example.map;

import java.util.HashMap;

public class HashMapEjemplo2 {
    public void main() {
        // Crear un HashMap para almacenar información sobre estudiantes y sus calificaciones
        HashMap<String, Integer> estudiantes = new HashMap<>();
        estudiantes.put("Bryan", 85);
        estudiantes.put("Angie", 80);
        estudiantes.put("Maria Jose", 77);
        estudiantes.put("Homero Simpson", 20);

        // Imprimir la información sobre los estudiantes en el mapa
        System.out.println("Información sobre los estudiantes: " + estudiantes);

        // Obtener la calificación de un estudiante específico
        Integer calificacion = estudiantes.get("Homero Simpson");
        System.out.println("Calificación de Homero Simpson: " + calificacion);

        // Modificar la calificación de un estudiante
        estudiantes.put("Homero Simpson", 95);

        // Imprimir la información sobre los estudiantes en el mapa después de modificar
        System.out.println("Información sobre los estudiantes después de modificar: " + estudiantes);
    }
}
