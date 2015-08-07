package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;

public class LoginMenuView implements View {
    private Console console;

    public LoginMenuView(Console console) {
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
