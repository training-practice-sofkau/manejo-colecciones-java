package org.example.set;

public class Jurado extends Persona {

    public Jurado(int cc, String nombre, int voto, CasaVotaciones casaVotaciones) {
        super(cc, nombre, voto);
    }

    @Override
    public String toString() {
        return "Jurado{} " + super.toString();
    }
}
