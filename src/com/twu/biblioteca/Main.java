package com.twu.biblioteca;

import com.twu.biblioteca.controller.BibliotecaApp;
import com.twu.biblioteca.model.*;
import com.twu.biblioteca.model.Authenticator;
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
        MenuView menuView = new MenuView(console);
        ArrayList<User> users = new ArrayList<User>();
        User user1 = new User("000-2015", "000-2015", "customer");
        User user2 = new User("001-2015", "001-2015", "customer");
        users.add(user1);
        users.add(user2);
        Authenticator authenticator = new Authenticator(users);
        LoginMenuView loginMenuView = new LoginMenuView(console);
        Login login = new Login(console, authenticator, menuView, loginMenuView);
        View listBooks = new ListBooks(library, console, menuView);
        View listCheckedOutBooks = new ListCheckOutBooks(library, console, menuView, login);
        View listMovies = new ListMovies(library, console, menuView);
        View listCheckedOutMovies = new ListCheckOutMovies(library, console, menuView, login);
        View checkoutBook = new CheckoutBook(library, console, menuView, login);
        View checkinBook = new CheckinBook(library, console, menuView, login);
        View checkoutMovie = new CheckoutMovie(library, console, menuView, login);
        View checkinMovie = new CheckinMovie(library, console, menuView, login);
        View quit = new Quit();
        View invalidOption = new InvalidOption(console, menuView);
        View logout = new Logout();
        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout);
        menuView.setParser(parser);
        loginMenuView.setParser(parser);
        WelcomeView welcomeView = new WelcomeView(console, loginMenuView);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(welcomeView);
        bibliotecaApp.run();
    }
}
