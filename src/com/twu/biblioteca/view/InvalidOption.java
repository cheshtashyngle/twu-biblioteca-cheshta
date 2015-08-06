package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;

public class InvalidOption implements View {
    private Console console;
    private View nextView;

    public InvalidOption(Console console, View nextView) {
        this.console = console;
        this.nextView = nextView;
    }

    @Override
    public void performAction() {
        console.print("Select a valid option!\n");
        nextView.performAction();
    }
}
