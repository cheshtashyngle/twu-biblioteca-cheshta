package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;

public class WelcomeView implements View {
    private Console console;
    private View nextView;

    public WelcomeView(Console console, View nextView) {
        this.console = console;
        this.nextView = nextView;
    }

    @Override
    public void performAction() {
        console.print("Welcome to Biblioteca Library Management System\n");
        nextView.performAction();
    }
}
