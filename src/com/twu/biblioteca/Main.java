package com.twu.biblioteca;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        ArrayList<Item> books = new ArrayList<Item>();
        Book book = new Book("Head First With Java", "Serran", "1990");
        books.add(book);
        Section bookSection = new Section(books);
        ArrayList<Item> movies = new ArrayList<Item>();
        Movie movie = new Movie("ABCD2", "2015", "PrabhuDeva", 8);
        movies.add(movie);
        Section movieSection = new Section(movies);
        Library library = new Library(bookSection, movieSection);
        Parser parser = new Parser(library, view);
        Menu menu = new Menu();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(view, parser, menu);
        bibliotecaApp.run();
    }
}
