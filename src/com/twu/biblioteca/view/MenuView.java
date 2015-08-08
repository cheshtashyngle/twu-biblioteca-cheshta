package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.parser.Parser;

import java.util.ArrayList;


public class MenuView implements View {
    private Console console;
    private Parser parser;
    private View nextView;

    public  MenuView(Console console) {
        this.console = console;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    @Override
    public void performAction(User user) {
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("ListBooks");
        menu.add("ListMovies");
        menu.add("CheckoutBook");
        menu.add("CheckinBook");
        menu.add("CheckoutMovie");
        menu.add("CheckinMovie");
        menu.add("Profile");
        menu.add("Logout");
        menu.add("Quit");
        if(user.isLibrarian()) {
            menu.add("ListCheckedOutBooks");
            menu.add("ListCheckedInMovies");
        }
        for(String menuElement : menu) {
            console.print(menuElement);
            console.print("\n");
        }
        nextView = parser.parseCommand(console.input());
        nextView.performAction(user);
    }
}