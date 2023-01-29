package org.example.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEjemplo2 {

    public void main() {
        Set<Estudiante> estudiantes = new HashSet<>();

        estudiantes.add(new Estudiante("Juan", 20));
        estudiantes.add(new Estudiante("Pedro", 22));
        estudiantes.add(new Estudiante("Miguel", 21));
        estudiantes.add(new Estudiante("Ana", 23));
        estudiantes.add(new Estudiante("Juan", 20));

        System.out.println("Estudiantes: " + estudiantes);
    }
}

    class Estudiante {
        private String nombre;
        private int edad;

        public Estudiante(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + edad;
            result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Estudiante other = (Estudiante) obj;
            if (edad != other.edad)
                return false;
            if (nombre == null) {
                if (other.nombre != null)
                    return false;
            } else if (!nombre.equals(other.nombre))
                return false;
            return true;
        }

        @Override
        public String toString() {
            return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
        }
    }


