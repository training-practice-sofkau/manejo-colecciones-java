package org.example.set;

public class HashSet {

    public void ejecutar(){
        CasaVotaciones casaVotaciones = new CasaVotaciones("Nuestra Señora", "cr40#46-40");
        Votante votante1 = new Votante(2222222, "Efrain",1, casaVotaciones);
        Votante votante2 = new Votante(2222222, "Lorena",2, casaVotaciones);
        Votante votante3 = new Votante(2222222, "Cristian",3, casaVotaciones);
        Jurado jurado1 = new Jurado(2222222, "juan",1, casaVotaciones);
        casaVotaciones.agregarVotantes(votante1);
        casaVotaciones.agregarVotantes(votante2);
        casaVotaciones.agregarVotantes(votante3);
        casaVotaciones.agregarVotantes(jurado1);
        casaVotaciones.mostrarVotacion();
        casaVotaciones.numeroJurados();
        casaVotaciones.numeroVotantes();
    }

}
