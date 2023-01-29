package org.example.list.linkedListExamples.example2;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class ManageRosterImp implements IManageRoster{
    List<Player> players = new LinkedList<>();
    @Override
    public void addPlayer(Player player) {
        players.add(player);
        System.out.println("Se ha agregado a " + player.getNombre() + " al roster inicial");
    }

    @Override
    public Player getPlayer(int index) {
        if (index <= players.size())
            return players.get(index);
        else
            System.out.println("Por favor ingrese un index menor o igual a " + players.size() +
                    "El jugador en la posición anterior es ");
        return players.get(index - 1);
    }

    @Override
    public List<Player> getRoster() {
        return players;
    }

    @Override
    public void printRoster() {
        List<Player> players = getRoster();
        System.out.println("El equipo está compuesto por los jugadores: ");
        players.forEach(player -> {
            System.out.println(player.getNombre());
        });
    }
}
