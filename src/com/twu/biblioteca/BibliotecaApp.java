package com.twu.biblioteca;

import java.util.ArrayList;


public class BibliotecaApp {
    private View view;
    private Parser parser;
    private ArrayList<String> menu;
    private String welcomeMessage;
    private String menuString;

    public BibliotecaApp(View view, Parser parser, ArrayList<String> menu) {
        this.view = view;
        this.parser = parser;
        welcomeMessage = "Welcome to Biblioteca Library Management System\n";
        this.menu = menu;
        menu.add("ListBooks");
        menu.add("Checkout");
        menu.add("Checkin");
        menu.add("Quit");
        menuString = "Menu\n";
        for(int menuElement =0;menuElement < menu.size();menuElement++) {
            menuString = menuString + (menuElement+1) + "." + menu.get(menuElement) + "\n";
        }
    }

    public void run() {
        view.print(welcomeMessage);
        while(true) {
            view.print(menuString);
            String input = view.input();
            Command command = parser.parseCommand(input);
            command.execute();
        }
    }
}
