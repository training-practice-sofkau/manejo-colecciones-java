package org.example.set.example2;

import org.example.list.linkedListExamples.example2.IManageRoster;
import org.example.list.linkedListExamples.example2.ManageRosterImp;
import org.example.list.linkedListExamples.example2.Player;

import java.util.*;

public class HashSetPlayer {

    public void manageHashSet(){
        IManageHashSet iManageHashSet = new ManageHashsetImp();
        System.out.println(iManageHashSet.isHashSetEmpty());
        IManageRoster iManageRoster = new ManageRosterImp();
        // para crear un HashSet desde una LinkedList creada en linkedList.example2
        List<String> players = new LinkedList<>();
        players.add("Checho");
        players.add("Tiago");
        players.add("Pablo");
        iManageHashSet.addAllList(players);
        System.out.println(iManageHashSet.isHashSetEmpty());

    }
}
