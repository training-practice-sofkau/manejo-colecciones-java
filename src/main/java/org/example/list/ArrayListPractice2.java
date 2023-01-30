package org.example.list;

import java.util.ArrayList;

public class ArrayListPractice2 {
    public void ejectuar(){
            ArrayList<Book> books = new ArrayList<>();
            books.add(new Book("Matando a Mockingbird", "Harper Lee", 281));
            books.add(new Book("Orgullo y prejuicio", "Jane Austen", 279));
            books.add(new Book("Harry Potter 1", "J.K. Rowing", 380));

            Book secondBook = books.get(1);
            books.remove(secondBook);

            for (Book book : books) {
                System.out.println("Titulo: " + book.getTitle() + " Autor: " + book.getAuthor() + " Paginas: " + book.getPages());
            }
        }
    }

class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}

