package org.example.list.linkedListExamples.example2;

import java.util.List;

public interface IManageRoster {
    public void addPlayer(Player player);
    public Player getPlayer(int index);
    public List<Player> getRoster();
    public void printRoster();
}
