package org.example.set.example1;

public class ExampleHashSetWeek {

    public void manageHashSet(){
        IManageWeek iManageWeek = new ManageWeekImp();

        // Se agregan días al HashSet, tomando los elementos del Enum Day y usando el método addDay definido en IManageWeek
        iManageWeek.addDay(Day.LUNES);
        iManageWeek.addDay(Day.MARTES);
        iManageWeek.addDay(Day.MIERCOLES);
        iManageWeek.addDay(Day.JUEVES);
        iManageWeek.addDay(Day.VIERNES);
        iManageWeek.addDay(Day.SABADO);
        iManageWeek.addDay(Day.DOMINGO);

        // Se imprime el HashSet generado usando el método printWeek
        iManageWeek.printWeek();

    }
}
