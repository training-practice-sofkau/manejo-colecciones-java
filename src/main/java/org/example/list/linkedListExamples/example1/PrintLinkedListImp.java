package org.example.list.linkedListExamples.example1;

import java.util.LinkedList;
import java.util.List;

public class PrintLinkedListImp implements IPrintLinkedList{
    @Override
    public void printLinkedList(List<Friend> friends) {

        for (Friend friend : friends){
            System.out.println(friend.getName());
        }
    }
}
