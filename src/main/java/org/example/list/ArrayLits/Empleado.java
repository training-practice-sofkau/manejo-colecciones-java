package org.example.list.ArrayLits;

public class Empleado extends Persona{
    private static int idEmpleado = 0;
    public Empleado(String nombre) {
        super(nombre);
        idEmpleado++;
    }

    @Override
    public void mostrarPersona() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Empleado{} " + super.toString();
    }


}
