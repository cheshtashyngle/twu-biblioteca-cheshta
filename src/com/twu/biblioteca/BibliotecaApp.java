package com.twu.biblioteca;

import java.util.ArrayList;


public class BibliotecaApp {
    private View view;
    private Parser parser;

    public BibliotecaApp(View view, Parser parser) {
        this.view = view;
        this.parser = parser;
    }

    public void run() {
        String welcomeMessage = "Welcome to Biblioteca Library Management System\n";
        view.print(welcomeMessage);
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("ListBooks");
        String menuString = "Menu\n";
        for(int menuElement =0;menuElement < menu.size();menuElement++) {
            menuString = menuString + (menuElement+1) + "." + menu.get(menuElement) + "\n";
        }
        view.print(menuString);
        String input = view.input();
        Command command = parser.parseCommand(input);
        command.execute();
    }
}
