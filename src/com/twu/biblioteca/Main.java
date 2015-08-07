package com.twu.biblioteca;

import com.twu.biblioteca.controller.BibliotecaApp;
import com.twu.biblioteca.model.*;
import com.twu.biblioteca.parser.Parser;
import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.view.*;

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
        MenuView menuView = new MenuView(console);;
        View listBooks = new ListBooks(library, console, menuView);
        View listCheckedOutBooks = new ListCheckOutBooks(library, console, menuView);
        View listMovies = new ListMovies(library, console, menuView);
        View listCheckedOutMovies = new ListCheckOutMovies(library, console, menuView);
        View checkoutBook = new CheckoutBook(library, console, menuView);
        View checkinBook = new CheckinBook(library, console, menuView);
        View checkoutMovie = new CheckoutMovie(library, console, menuView);
        View checkinMovie = new CheckinMovie(library, console, menuView);
        View quit = new Quit();
        View invalidOption = new InvalidOption(console, menuView);
        View login = new Login();
        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption);
        menuView.setParser(parser);
        WelcomeView welcomeView = new WelcomeView(console, menuView);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(welcomeView);
        bibliotecaApp.run();
    }
}
