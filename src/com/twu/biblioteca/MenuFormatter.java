package com.twu.biblioteca;

import java.util.ArrayList;

public class MenuFormatter implements Formatter {
    private ArrayList<String> menu;

    public MenuFormatter(ArrayList<String> menu) {
        this.menu = menu;
    }

    @Override
    public String format() {
        String menuString = "Menu\n";
        for(int menuElement =0;menuElement < menu.size();menuElement++) {
            menuString = menuString + (menuElement+1) + "." + menu.get(menuElement) + "\n";
        }
        return menuString;
    }
}
