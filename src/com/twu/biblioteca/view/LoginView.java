package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.parser.Parser;

public class LoginView implements View {
    private Console console;

    public LoginView(Console console) {
        this.console = console;
    }

    @Override
    public void performAction() {
        String[] menu = {"Login", "Quit"};
        for(String menuElement : menu) {
            console.print(menuElement);
            console.print("\n");
        }
    }
}
