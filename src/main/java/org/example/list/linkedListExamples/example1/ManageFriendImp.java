package org.example.list.linkedListExamples.example1;

import java.util.LinkedList;

public class ManageFriendImp implements IManageFriend{
    LinkedList<Friend> friends = new LinkedList<>();

    @Override
    // para agregar un elemento a la lista
    public void addFriend(Friend friend) {
        friends.add(friend);
        System.out.println("Se agregó " + friend.getName() + " a la lista friends");
    }

    @Override
    // para agregar elemento en un index especifico
    public void addFriendAtIndex(Friend friend, int index) {
        if (friends.size() >= index){
            friends.add(index, friend);
            System.out.println("Se ha agregado a " + friend.getName() + " a la lista friends");
        } else
            System.out.println("Por favor elija otro index menor o igual a " + friends.size() );

    }

    @Override
    // para agregar un elemento en la primera posición
    public void addFriendFirst(Friend friend) {
        if (friends.get(0) != null){
            friends.addFirst(friend);
        } else
            System.out.println("La primera posición ya está ocupado con " + friends.get(0)+
                    "Por favor elige otra posición");
    }

    @Override
    public LinkedList<Friend> getLinkedList() {
        return this.friends;
    }
}
