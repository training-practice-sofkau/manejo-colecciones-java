package org.example.colecciones.clases;

import java.util.HashMap;

public class Persona {
    protected HashMap<String, String> informacionPersonal;
    public Persona(String nombre, String apellido, String cedula){
        this.informacionPersonal = new HashMap<>();
        this.informacionPersonal.put("nombre", nombre);
        this.informacionPersonal.put("apellido", apellido);
        this.informacionPersonal.put("cedula", cedula);
    }

    public String getNombre (){
        return this.informacionPersonal.get("nombre");
    }

    public String getApellido (){
        return this.informacionPersonal.get("apellido");
    }

    public String getCedula (){
        return  this.informacionPersonal.get("cedula");
    }

    public void setNombre (String nombre){
        this.informacionPersonal.put("nombre", nombre);
    }

    public void setApellido (String apellido){
        this.informacionPersonal.put("apellido", apellido);
    }

    public void setCedula (String cedula){
        this.informacionPersonal.put("cedula", cedula);
    }

    @Override
    public int hashCode(){
        /**
         * Función para hacer que la cédula sea el identificador único
         * de las instancias de persona dentro de un Hash Set.
         */
        final int numero = 31;
        int resultado = 1;
        String cedula = this.getCedula();
        resultado = numero * resultado + ((cedula == null)? 0 : cedula.hashCode());
        return resultado;
    }
}
