package org.example.colecciones.clases;

import java.util.ArrayList;

public class ClientePanaderia extends Persona {
    private ArrayList<Pan> panes;

    public ClientePanaderia(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.panes = new ArrayList<>();
    }

    public void recibirPan (Pan pan){
        this.panes.add(pan);
    }

    public double calcularCuenta(){
        double total = 0;
        for (Pan pan : this.panes){
            total += pan.getPrecio();
        }
        return total;
    }

    public ArrayList<Pan> getPanes() {
        return this.panes;
    }
}
