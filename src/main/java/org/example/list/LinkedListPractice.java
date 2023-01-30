package org.example.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

    public  void ejecutar() {

        List<User> usuarios = new LinkedList<>();
        System.out.println("Lista de usuarios: ");
        usuarios.add(new User ("Jhon", "Jhon@gmail.com", "58game"));
        usuarios.add(new User ("Rita", "Lope@gmail.com", "kl_458"));
        usuarios.add(new User ("Camila", "Kay@gmail.com", "llave25"));
        //agregar al final

        System.out.println("Final de la lista: ");
        usuarios.add(new User ("Pedro", "rueda@gmail.com", "bogota5"));
     //agregar al principio
        System.out.println("Principio de la lista: ");
        usuarios.add(0, new User("Ana", "lima@gmail.com", "4587lima"));


       for(User usuario : usuarios){
           System.out.println("Usuario: " + usuario.getName() );
       }
    //remover de lista enlazadas
        String usuarioRemover = "Jhon";
       for (User usuario1 : usuarios){
           if(usuario1.getName().equals(usuarioRemover)){
               usuarios.remove(usuario1);
               break;
           }
       }
        System.out.println("Lista de usuarios nueva:");
        for(User usuario : usuarios){
            System.out.println("Usuario: " + usuario.getName() );
        }

    }
}

class User{
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
