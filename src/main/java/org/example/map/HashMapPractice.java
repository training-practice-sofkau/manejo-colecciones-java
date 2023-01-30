package org.example.map;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {
    Municipio municipio = new Municipio();
    Carro carro = new Carro();
    Cedula cedula = new Cedula();

    public void ejecutar(){

        System.out.println("______________________________________________________________________EJERCICIOS HASH MAP_____________________________________________________________");
        System.out.println("________________________________________MUNICIPIOS_______________________________");
        municipio.ejecutar();
        System.out.println("__________________________________________CARROS________________________________");
        carro.ejecutar();
        System.out.println("__________________________________________CEDULA________________________________");
        cedula.ejecutar();
    }

}
 interface Operar{
    public void cargarRegistros();
    public void mostrar();
    public void actualizarRegistros();
    public void mostrarActualizacion();
    public void eliminar();
    public void consultarRegistro();

}

/**
 * Ejercicio 1
 */
class Municipio implements Operar{

    Map<String,Integer> municipiosMap = new HashMap<>();

    public void ejecutar(){
        cargarRegistros();
        mostrar();
        actualizarRegistros();
        mostrarActualizacion();
        consultarRegistro();
        eliminar();
    }

    @Override
    public void cargarRegistros() {
        System.out.println("Habitantes por municipios año 2018, registros cargados");
        municipiosMap.put("Tibacuy",6739);
        municipiosMap.put("Fusagasuga",123654);
        municipiosMap.put("Pasca",54387);
        municipiosMap.put("Facatativa",758937);
        municipiosMap.put("Sibate",749563);

    }


    @Override
    public void mostrar() {
        System.out.println("Habitantes por municipio para el año 2018"+municipiosMap);
    }

    @Override
    public void actualizarRegistros() {
        System.out.println("Habitantes por municipios año 2022, registros cargados");
        municipiosMap.put("Tibacuy",8749);
        municipiosMap.put("Fusagasuga",236541);
        municipiosMap.put("Pasca",438778);
        municipiosMap.put("Facatativa",5893732);
        municipiosMap.put("Sibate",49563);
        municipiosMap.put("Cabrera",4563);
        municipiosMap.put("Girardot",768763);
    }

    @Override
    public void mostrarActualizacion() {
        System.out.println("Habitantes por municipio para el año 2022"+municipiosMap);
    }


    @Override
    public void eliminar() {
        municipiosMap.remove("Sibate");
        System.out.println("Se ha eliminado el registro del municipio de Sibate");
    }

    @Override
    public void consultarRegistro() {
        int dato = municipiosMap.get("Sibate");
        System.out.println("Municipiio Sibate cuenta con "+dato);
    }

}

/**
 * Ejercicio 2
 */
class Carro implements Operar{

    Map<String,Double> carros = new HashMap<>();

    public void ejecutar(){
        cargarRegistros();
        mostrar();
        actualizarRegistros();
        mostrarActualizacion();
        consultarRegistro();
        eliminar();
    }

    @Override
    public void cargarRegistros() {
        System.out.println("Kilometros recorridos en 2 años de uso del vehiculo, registros cargados");
        carros.put("Renault",7649.6);
        carros.put("Chevrolet",654.5);
        carros.put("Mazda",54879.0);
        carros.put("Audi",7937.87);
        carros.put("Ford",949563.2);

    }


    @Override
    public void mostrar() {
        System.out.println("Kilometros recorridos en 2 años de uso del vehiculo"+carros);
    }

    @Override
    public void actualizarRegistros() {
        System.out.println("Kilometros recorridos en 5 años de uso del vehiculo, registros cargados");
        carros.put("Renault",87649.6);
        carros.put("Chevrolet",34654.5);
        carros.put("Mazda",678879.0);
        carros.put("Audi",87375.87);
        carros.put("Ford",8759867.2);
    }

    @Override
    public void mostrarActualizacion() {
        System.out.println("Kilometros recorridos en 5 años de uso del vehiculo"+carros);
    }


    @Override
    public void eliminar() {
        carros.remove("Mazda");
        System.out.println("Se ha eliminado el registro del vehiculo Mazda");
    }

    @Override
    public void consultarRegistro() {
        Double dato = carros.get("Mazda");
        System.out.println("El vehiculo Mazda cuenta con  "+dato+" kilometros recorridos");
    }

}

/**
 * Ejercicio 3
 */
class Cedula implements Operar{

    Map<Integer,String> cedulas = new HashMap<>();

    public void ejecutar(){
        cargarRegistros();
        mostrar();
        actualizarRegistros();
        mostrarActualizacion();
        consultarRegistro();
        eliminar();
    }

    @Override
    public void cargarRegistros() {
        System.out.println("Cedulas regitradas año 2022, registros cargados");
        cedulas.put(10798482,"Pedro Leon");
        cedulas.put(1069938795,"Andrea Rincon");
        cedulas.put(75693,"Julieth Vega");
        cedulas.put(98753,"Flor Neusa");
        cedulas.put(20996873,"Pablo Jimenez");

    }


    @Override
    public void mostrar() {
        System.out.println("Cedulas regitradas año 2022"+cedulas);
    }

    @Override
    public void actualizarRegistros() {
        System.out.println("Cambio de nombres en cedulas registradas en el año 2022, registros actualizados");
        cedulas.put(10798482,"Luis Leon");
        cedulas.put(1069938795,"Andres Rincon");
        cedulas.put(75693,"Julieth Ruiz");
        cedulas.put(98753,"Flor Rodriguez");
        cedulas.put(20996873,"Peter Patiño");
    }

    @Override
    public void mostrarActualizacion() {
        System.out.println("Cambio de nombres en cedulas registradas en el año 2022"+cedulas);
    }


    @Override
    public void eliminar() {
        cedulas.remove("20996873");
        System.out.println("Se ha eliminado el registro cedula de cuidadania numero 20996873");
    }

    @Override
    public void consultarRegistro() {
        String dato = cedulas.get(20996873);
        System.out.println("La cedula de cuidadania numero 20996873 pertenece a: "+dato);
    }

}