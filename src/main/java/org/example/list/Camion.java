package org.example.list;

public class Camion implements Transporte{

    @Override
    public void entregar() {
        System.out.println("Entregar paquetes por tierra en cajas");
        //return null;
    }
}
