package org.example.map.example2;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class ManageCiudadImp implements IManageCiudad{
    Map<String, Ciudad> ciudades = new HashMap<>();
    @Override
    public void addKeyValue(String key, Ciudad ciudad) {
        ciudades.putIfAbsent(key, ciudad);
        System.out.println("Se ha agregado el par key, value " + key + ", " + ciudad);
    }

    @Override
    public void deleteKeyValue(String key) {
        ciudades.remove(key);
        System.out.println("Se ha eliminado el valor asociado a la key " + key);
    }

    @Override
    public void printHashMap() {
        System.out.println("Los elementos del HashMap son:");
        ciudades.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
}
