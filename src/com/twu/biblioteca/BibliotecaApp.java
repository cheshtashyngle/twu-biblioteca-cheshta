package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        String welcomeMessage = "Welcome to Biblioteca Library Management System";
        View view = new View();
        Formatter formatter;
        view.print(welcomeMessage);
        ArrayList books = new ArrayList();
        books.add("Head First With Java");
        formatter = new ListOfBooksFormatter(books);
        String output = formatter.format();
        view.print(output);
    }
}
