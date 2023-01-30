package org.example.colecciones.escenario2;

import org.example.colecciones.EscenarioBase;
import org.example.colecciones.clases.Parqueadero;

public class CorrerEscenario2 extends EscenarioBase {
    public CorrerEscenario2(){
        super("Escenario 2 (Parqueadero)");
    }

    public void correrEscenario(){
        this.anunciarEscenario();
        Parqueadero parqueadero = new Parqueadero();
        parqueadero.abrirParqueadero();
    }
}
