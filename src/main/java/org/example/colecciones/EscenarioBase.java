package org.example.colecciones;

public abstract class EscenarioBase {
    protected String titulo;

    public EscenarioBase(String titulo){
        this.titulo = titulo;
    }

    public abstract void correrEscenario();

    public void anunciarEscenario(){
        System.out.println(this.titulo);
        System.out.println("--------------");
    }
}
