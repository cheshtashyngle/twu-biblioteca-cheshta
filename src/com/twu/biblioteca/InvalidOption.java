package com.twu.biblioteca;

import java.util.ArrayList;

public class InvalidOption implements Command{
    private View view;
    private Parser parser;

    public InvalidOption(View view, Parser parser) {
        this.view = view;
        this.parser = parser;
    }

    @Override
    public void execute() {
        String invalidMessage = "Select a valid option!\n";
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("ListBooks");
        menu.add("Checkout");
        menu.add("Checkin");
        menu.add("Quit");
        String menuString = "Menu\n";
        for(int menuElement =0;menuElement < menu.size();menuElement++) {
            menuString = menuString + (menuElement+1) + "." + menu.get(menuElement) + "\n";
        }
        view.print(invalidMessage);
        view.print(menuString);
        String input = view.input();
        Command command = parser.parseCommand(input);
        command.execute();
    }
}
