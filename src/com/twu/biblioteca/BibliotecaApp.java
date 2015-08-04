package com.twu.biblioteca;

public class BibliotecaApp {
    private View view;
    private Parser parser;
    private String welcomeMessage;
    private Menu menu;

    public BibliotecaApp(View view, Parser parser, Menu menu) {
        this.view = view;
        this.parser = parser;
        welcomeMessage = "Welcome to Biblioteca Library Management System\n";
        this.menu = menu;
    }

    public void run() {
        view.print(welcomeMessage);
        while(true) {
            view.print(menu.toString());
            String input = view.input();
            Command command = parser.parseCommand(input);
            command.execute();
        }
    }
}
