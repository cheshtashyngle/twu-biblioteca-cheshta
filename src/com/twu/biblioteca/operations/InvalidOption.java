package com.twu.biblioteca.operations;

import com.twu.biblioteca.console.Console;

public class InvalidOption implements Command {
    private Console console;

    public InvalidOption(Console console) {
        this.console = console;
    }

    @Override
    public void execute() {
        console.print("Select a valid option!\n");
    }
}
