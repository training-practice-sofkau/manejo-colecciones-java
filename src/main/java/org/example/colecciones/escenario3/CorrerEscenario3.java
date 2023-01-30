package org.example.colecciones.escenario3;

import org.example.colecciones.EscenarioBase;
import org.example.colecciones.clases.Panaderia;

public class CorrerEscenario3 extends EscenarioBase {
    public CorrerEscenario3(){
        super("Escenario 3 (Panadería)");
    }

    public void correrEscenario(){
        this.anunciarEscenario();
        Panaderia panaderia = new Panaderia();
        panaderia.abrirPanaderia();
    }
}
