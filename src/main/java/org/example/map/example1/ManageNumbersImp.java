package org.example.map.example1;

import java.util.HashMap;
import java.util.Map;

public class ManageNumbersImp implements IManageNumbers{

    Map<String, Numbers> numbers = new HashMap<>();

    @Override
    public void addKeyValue(String key, Numbers number) {
        numbers.put(key, number);
        System.out.println("Se ha agreado la pareja key, value " +  key + "," + number + " al HashMap");
    }

    @Override
    public String checkKey(String key) {
        if (numbers.containsKey(key)){
            return "EL HashMap contiene la llave " + key;
        } else
            return "EL HashMap no contiene la llave " + key;
    }

    @Override
    public String checkValue(Numbers number) {
        if (numbers.containsValue(number)){
            return "El HasMap contiene el valor " + number;
        } else
            return "EL HashMap no contiene el valor " + number;
    }
}
