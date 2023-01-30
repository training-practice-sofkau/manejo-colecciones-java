package org.example.set;

public class BarrioFactoryArmenia {

    public Barrio construirNuevoBarrio(String nombre){
        if (nombre == null) {
            return null;
        }
        //equalsIgnoreCase - Compara dos strings para ver si son iguales ignorando entre mayusculas y minusculas
        if (nombre.equalsIgnoreCase("Alfonso Lopez")) {
            return new AlfonsoLopez();
        } else if (nombre.equalsIgnoreCase("Manantiales")) {
            return new Manantiales();
        } else if (nombre.equalsIgnoreCase("La Patria")) {
            return new LaPatria();
        }else{
            return null;
        }

    }
}
