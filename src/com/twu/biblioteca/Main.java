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
        Book book1 = new Book("Head First With Java", "Serran", "1990");
        Book book2 = new Book("Complete Reference", "Java Author", "2001");
        books.add(book1);
        books.add(book2);
        Section bookSection = new Section(books);
        ArrayList<Item> movies = new ArrayList<Item>();
        Movie movie = new Movie("ABCD2", "2015", "PrabhuDeva", 8);
        movies.add(movie);
        Section movieSection = new Section(movies);
        Library library = new Library(bookSection, movieSection);
        MenuView menuView = new MenuView(console);
        ArrayList<User> users = new ArrayList<User>();
        User user1 = new User("000-2015", "000-2015", "Student1", "student@gmail.com", "1234567890", false);
        User user2 = new User("001-2015", "001-2015", "Student1", "student@gmail.com", "1234567890", false);
        User user3 = new User("999-2015", "999-2015", "Student1", "student@gmail.com", "1234567890", true);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        Authenticator authenticator = new Authenticator(users);
        LoginMenuView loginMenuView = new LoginMenuView(console);
        Login login = new Login(console, authenticator, menuView, loginMenuView);
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
        View logout = new Logout(console, loginMenuView);
        View profile = new Profile(console, menuView);
        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout, profile);
        menuView.setParser(parser);
        loginMenuView.setParser(parser);
        WelcomeView welcomeView = new WelcomeView(console, loginMenuView);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(welcomeView);
        bibliotecaApp.run();
    }
}
