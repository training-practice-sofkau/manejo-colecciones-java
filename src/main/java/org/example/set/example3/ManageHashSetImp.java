package org.example.set.example3;

import java.util.HashSet;
import java.util.Set;

public class ManageHashSetImp implements IManageHashSet{

    Set<String> someText = new HashSet<>();
    @Override
    public void addElement(String text) {
        someText.add(text);
        System.out.println("Se ha agregado el elemento " + text + " al HashSet");
    }

    @Override
    public String lookForElement(String text) {
        if (someText.contains(text)){
            return "El HashSet contiene el elemento " + text;
        } else
            return "El HashSet no contiene el elemento " + text;
    }

    @Override
    public void deleteElement(String text) {
        System.out.println("Se eliminará el elemento " + text + " del HashSet");
        someText.remove(text);
    }
}
