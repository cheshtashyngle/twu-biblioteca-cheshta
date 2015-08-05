package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;


public class MenuView implements View {
    private Console console;
    private View nextView;

    public MenuView(Console console, View nextView) {
        this.console = console;
        this.nextView = nextView;
    }

    @Override
    public void performAction() {
        String[] menu = {"ListBooks", "ListCheckedOutBooks", "ListMovies", "ListCheckedOutMovies", "CheckoutBook", "CheckinBook", "CheckoutMovie", "CheckinMovie",  "Quit"};
        for(String menuElement : menu) {
            console.print(menuElement);
            console.print("\n");
        }
        nextView.performAction();
    }
}
