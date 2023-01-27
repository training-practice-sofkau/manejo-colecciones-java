package org.example.list;

public class TransporteFactory {

    public Transporte crearTransporte(String tipo){

        if(tipo == null) {
            return null;
        }

        if (tipo.equalsIgnoreCase("Camion")){
            return new Camion();
        } else if (tipo.equalsIgnoreCase("Barco")) {
            return new Barco();
        } else if (tipo.equalsIgnoreCase("Moto")) {
            return new Moto();
        }else {
            return null;
        }

    }
}

