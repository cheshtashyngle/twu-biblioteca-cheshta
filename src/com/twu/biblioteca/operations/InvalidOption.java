package com.twu.biblioteca.operations;

import com.twu.biblioteca.menu.Menu;
import com.twu.biblioteca.parser.Parser;
import com.twu.biblioteca.console.Console;

public class InvalidOption implements Command {
    private Console console;
    private Parser parser;

    public InvalidOption(Console console, Parser parser) {
        this.console = console;
        this.parser = parser;
    }

    @Override
    public void execute() {
        String invalidMessage = "Select a valid option!\n";
        Menu menu = new Menu();
        console.print(invalidMessage);
        console.print(menu.toString());
        String input = console.input();
        Command command = parser.parseCommand(input);
        command.execute();
    }
}
