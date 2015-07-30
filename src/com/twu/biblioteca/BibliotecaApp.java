package com.twu.biblioteca;

import java.util.ArrayList;


public class BibliotecaApp {

    public static void main(String[] args) {
        String welcomeMessage = "Welcome to Biblioteca Library Management System\n";
        View view = new View();
        Formatter formatter;
        view.print(welcomeMessage);
        ArrayList<String[]> books = new ArrayList<String[]>();
        String[] book1 = {"Head First With Java", "Serran", "1990"};
        books.add(book1);
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("ListBooks");
        formatter = new MenuFormatter(menu);
        String output = formatter.format();
        view.print(output);
    }
}
