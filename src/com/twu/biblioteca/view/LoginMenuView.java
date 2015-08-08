package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.parser.Parser;


public class LoginMenuView implements View {
    private Console console;
    private View nextView;
    private Parser parser;

    public LoginMenuView(Console console) {
        this.console = console;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    @Override
    public void performAction(User user) {
        String[] menu = {"Login", "Quit"};
        for(String menuElement : menu) {
            console.print(menuElement);
            console.print("\n");
        }
        String input = console.input();
        nextView = parser.parseCommand(input);
        nextView.performAction(user);
    }
}