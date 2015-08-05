package com.twu.biblioteca.controller;

import com.twu.biblioteca.menu.Menu;
import com.twu.biblioteca.parser.Parser;
import com.twu.biblioteca.operations.Command;
import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.view.View;

public class BibliotecaApp {
    private Console console;
    private Parser parser;
    private Menu menu;
    private View startView;

    public BibliotecaApp(Console console, Parser parser, Menu menu, View startView) {
        this.console = console;
        this.parser = parser;
        this.menu = menu;
        this.startView = startView;
    }

    public void run() {
        startView.performAction();
        while(true) {
            console.print(menu.toString());
            String input = console.input();
            Command command = parser.parseCommand(input);
            command.execute();
        }
    }
}
