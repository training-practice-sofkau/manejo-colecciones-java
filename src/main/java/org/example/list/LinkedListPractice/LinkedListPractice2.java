package org.example.list.LinkedListPractice;

import java.util.LinkedList;

public class LinkedListPractice2 {

    public void ejecutar2(){

        LinkedList<Conectable> electrodomestico = new LinkedList<>();

        electrodomestico.add(new Lampara());
        electrodomestico.add(new Nevera());
        electrodomestico.add(new Lampara());

        for (Conectable aparato:electrodomestico) {
            aparato.encender();
            System.out.println(" " + aparato.estaEncendida());

        }

        Conectable lamparaInglesa= new Adaptador();
        lamparaInglesa.encender();
        System.out.println(" " + lamparaInglesa.estaEncendida());
    }

}

interface Conectable{
    public void encender();

    public void apagar();

    public boolean estaEncendida();

}

class Nevera implements Conectable {

    private boolean encendida;

    @Override
    public void encender() {
        encendida=true;

    }

    @Override
    public void apagar() {
        encendida=false;

    }

    @Override
    public boolean estaEncendida() {
        return encendida;
    }
}

class Lampara implements Conectable {
    private boolean encendida;

    public boolean estaEncendida() {
        return encendida;
    }

    @Override
    public void encender() {
        encendida=true;
    }

    @Override
    public void apagar() {
        encendida=false;
    }

}

class LamparaInglesa {
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }
    public void on () {

        isOn=true;
    }

    public void off() {

        isOn=false;
    }
}

class TelevisorIngles {
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }
    public void on () {

        isOn=true;
    }

    public void off() {

        isOn=false;
    }
}

class Adaptador implements Conectable {
    private LamparaInglesa lampara = new LamparaInglesa();

    public boolean estaEncendida() {
        return lampara.isOn();
    }
    public void encender() {
        lampara.on();
    }
    public void apagar() {
        lampara.off();
    }


}

