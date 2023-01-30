package org.example.colecciones.escenario1;

import org.example.colecciones.EscenarioBase;
import org.example.colecciones.clases.Supermercado;

public class CorrerEscenario1 extends EscenarioBase {

    public CorrerEscenario1(){
        super("Escenario 1 (supermercado)");
    }
    public void correrEscenario(){
        this.anunciarEscenario();
        Supermercado supermercado = new Supermercado();
        supermercado.abrirSuperMercado();
        System.out.println("--Fin del escenario--");
    }
}
