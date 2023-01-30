package org.example.set.example2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ManageHashsetImp implements IManageHashSet{

    Set<String> players = new HashSet<>();
    // Para crear un HashSet desde una LinkedList
    @Override
    public void addAllList(List<String> playersList) {
        players.addAll(playersList);
        System.out.println("Se ha creado el HashSet, tomando los elementos de una LinkedList");
    }


    // Para verificar si el HashSet está vacío
    @Override
    public String isHashSetEmpty() {
        if (this.getHashSet().isEmpty())
            return "EL HashSet está vacío. Por favor agregue elementos";
        else
            return "El HashSet contiene elementos";
    }

    @Override
    public Set<String> getHashSet() {
        return this.players;
    }
}
