package com.twu.biblioteca;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> menu;

    public Menu() {
        menu = new ArrayList<String>();
        menu.add("ListBooks");
        menu.add("ListMovies");
        menu.add("CheckoutBook");
        menu.add("CheckinBook");
        menu.add("CheckoutMovie");
        menu.add("CheckinMovie");
        menu.add("Quit");
    }

    @Override
    public String toString() {
        String menuString = "Menu\n";
        for(int menuElement =0;menuElement < menu.size();menuElement++) {
            menuString = menuString + (menuElement+1) + "." + menu.get(menuElement) + "\n";
        }
        return menuString;
    }
}
