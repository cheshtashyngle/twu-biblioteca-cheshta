package com.twu.biblioteca;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        ArrayList<String[]> books = new ArrayList<String[]>();
        String[] book = {"Head First With Java", "Serran", "1990"};
        books.add(book);
        Library library = new Library(books);
        Parser parser = new Parser(library, view);
        ArrayList<String> menu = new ArrayList<String>();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view, parser, menu);
        bibliotecaApp.run();
    }
}
