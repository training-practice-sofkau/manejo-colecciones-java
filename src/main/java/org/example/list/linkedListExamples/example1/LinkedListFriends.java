package org.example.list.linkedListExamples.example1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListFriends {
    public void createLinkedList(){
        // Se crea la LinkedList
        List<Friend> friends = new LinkedList<>();
        IManageFriend iManageFriend = new ManageFriendImp();
        // Se crean instancias de la clase Friend

        Friend friend1 = new Friend("Monica");
        Friend friend2 = new Friend("Phoebe");
        Friend friend3 = new Friend("Rachel");
        Friend friend4 = new Friend("Joey");
        Friend friend5 = new Friend("Chandler");
        Friend friend6 = new Friend("Ross");

        // Se agrega una instancia en la primera posición de la LinkedList friends
        iManageFriend.addFriend(friend1);
        // Se agrega una instancia a la LinkedList friends
        iManageFriend.addFriend(friend2);
        // se agrega una instancia a la linkedList friends en un index
        iManageFriend.addFriendAtIndex(friend3, 2);
    }
}
