package org.example.set.example1;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ManageWeekImp implements IManageWeek{
    Set<Day> days = new HashSet<>();
    @Override
    public void addDay(Day day) {
        days.add(day);
        System.out.println("Se ha agregado el día " + day + " al hasSet days");
    }


    @Override
    public void printWeek() {
        Iterator<Day> element = days.iterator();
        System.out.println("Los elementos en el HashSet dias son: ");
        while(element.hasNext()){
            System.out.println(element.next());
        }
    }
}
