package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.parser.Parser;


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
    public void performAction() {
        String[] menu = {"ListBooks", "ListCheckedOutBooks", "ListMovies", "ListCheckedOutMovies", "CheckoutBook", "CheckinBook", "CheckoutMovie", "CheckinMovie",  "Quit"};
        for(String menuElement : menu) {
            console.print(menuElement);
            console.print("\n");
        }
        nextView = parser.parseCommand(console.input());
        nextView.performAction();
    }
}