package org.example.set.example2;

import org.example.list.linkedListExamples.example2.Player;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface IManageHashSet {
    Set<Player> players = new HashSet<>();
    public void addAllList(List<String> players);
    public String isHashSetEmpty();

    public Set<String> getHashSet();
}
