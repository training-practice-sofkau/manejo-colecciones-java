package org.example.list.linkedListExamples.example2;

public class LinkedListRoster {

    public void roster() {

        IManageRoster iManageRoster = new ManageRosterImp();
        Player player4 = new Player("Lebron James");
        Player player5 = new Player("Nikola Jokic");
        Player player3 = new Player("Kevin Durant");
        Player player1 = new Player("Stephen Curry");
        Player player2 = new Player("Klay Thompson");
        Player player6 = new Player("Jason Tatum");

        // se agregan jugadores a la LinkedList llamando al método addPlayer de la clase ManageRosterImp
        iManageRoster.addPlayer(player1);
        iManageRoster.addPlayer(player2);
        iManageRoster.addPlayer(player3);
        iManageRoster.addPlayer(player4);
        iManageRoster.addPlayer(player5);

        // se busca un jugador en una posición específica en la LinkedList con el método getPlayer de la clase ManageRosterImp

        System.out.println("El jugador en la posición de point guard es " + iManageRoster.getPlayer(0).getNombre());
        System.out.println("EL jugador en la posición de center es " + iManageRoster.getPlayer(4).getNombre());

        // para imprimir el equipo completo se utilizan  printRoster de la clase ManageRosterImp
        iManageRoster.printRoster();



    }



}
