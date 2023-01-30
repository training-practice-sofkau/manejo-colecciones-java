package org.example.list.linkedListExamples.example1;

import java.util.LinkedList;

public interface IManageFriend {
    public void addFriend(Friend friend);
    public void addFriendAtIndex(Friend friend, int index);
    public void addFriendFirst(Friend friend);
    public LinkedList<Friend> getLinkedList();
}
