package org.example.set;

public class Votante extends Persona {

    public Votante(int cc, String nombre, int voto, CasaVotaciones casaVotaciones) {
        super(cc, nombre, voto);
        System.out.println("votaste por el candidato: " + voto);
    }

    @Override
    public String toString() {
        return "Votante{} " + super.toString();
    }
}
