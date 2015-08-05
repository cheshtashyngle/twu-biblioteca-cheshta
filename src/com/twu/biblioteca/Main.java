package com.twu.biblioteca;

import com.twu.biblioteca.controller.BibliotecaApp;
import com.twu.biblioteca.menu.Menu;
import com.twu.biblioteca.model.*;
import com.twu.biblioteca.parser.Parser;
import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.view.MenuView;
import com.twu.biblioteca.view.View;
import com.twu.biblioteca.view.WelcomeView;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Console console = new Console();
        ArrayList<Item> books = new ArrayList<Item>();
        Book book = new Book("Head First With Java", "Serran", "1990");
        books.add(book);
        Section bookSection = new Section(books);
        ArrayList<Item> movies = new ArrayList<Item>();
        Movie movie = new Movie("ABCD2", "2015", "PrabhuDeva", 8);
        movies.add(movie);
        Section movieSection = new Section(movies);
        Library library = new Library(bookSection, movieSection);
        Parser parser = new Parser(library, console);
        Menu menu = new Menu();
        View menuView = new MenuView();;
        WelcomeView welcomeView = new WelcomeView(console, menuView);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(console, parser, menu, welcomeView);
        bibliotecaApp.run();
    }
}
