package com.twu.biblioteca.operations;

import com.twu.biblioteca.operations.Command;

public class Quit implements Command {

    @Override
    public void execute() {
        System.exit(0);
    }
}
