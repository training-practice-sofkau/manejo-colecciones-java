package org.example.map.example3;

import java.util.HashMap;
import java.util.Map;

public class ManageEstadioImp implements IManageEstadio{

    Map<String, Ciudad> estadios = new HashMap<>();
    @Override
    public void addKeyValue(String key, Ciudad ciudad) {
        estadios.put(key, ciudad);
        System.out.println("Se agregó la pareja key,value " + key + "," + ciudad + " al HashMap");
    }

    @Override
    public void getValue(String key) {
        System.out.println("La ciudad donde se encuentra el estadio " + key + " es: " + estadios.get(key));
    }

    @Override
    public void getSize() {
        System.out.println("El número de estadios registrados en el HashMap son: " + estadios.size());
    }
}
