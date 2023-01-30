package org.example.list;

public class Barco implements Transporte{

    @Override
    public void entregar() {
        System.out.println("Entregar paquetes por Barco en Contenedores");
        //return null;
    }
}
