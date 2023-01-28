package org.example.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CasaVotaciones {
    Set<Persona> votantes;
    Set<Persona> jurados;
    Set<CasaVotaciones> casaVotaciones;

    List<Integer> votos;
    private String nombre;
    private String direccion;

    public CasaVotaciones(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        votantes = new HashSet<>();
        jurados = new HashSet<>();
        votos = new ArrayList<>();
        casaVotaciones = new HashSet<>();
    }

    public void numeroVotantes(){
        System.out.println(votantes.size());
    }

    public void numeroJurados(){
        System.out.println(jurados.size());
    }

    public void agregarVotantes(Persona votante){
        votantes.add(votante);
        votos.add(votante.getVoto());
        System.out.println("Gracias por votar " + votante.getNombre());
    };

    public void agregarJurados(Persona jurado){
        jurados.add(jurado);
        System.out.println("Gracias por ser jurado " + jurado.toString());

    };

    public void agregarCasaVotanciones(CasaVotaciones casaVotacion){
        casaVotaciones.add(casaVotacion);
        System.out.println(toString());
    }

    public void mostrarVotacion(){
        System.out.println(votos);
    }

    @Override
    public String toString() {
        return "CasaVotaciones{" +
                "casaVotaciones=" + casaVotaciones +
                '}';
    }
}
