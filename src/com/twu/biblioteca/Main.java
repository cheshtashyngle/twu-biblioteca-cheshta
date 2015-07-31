package com.twu.biblioteca;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        ArrayList<Book> books = new ArrayList<Book>();
        Book book = new Book("Head First With Java", "Serran", "1990");
        books.add(book);
        Library library = new Library(books);
        Parser parser = new Parser(library, view);
        Menu menu = new Menu();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view, parser, menu);
        bibliotecaApp.run();
    }
}
