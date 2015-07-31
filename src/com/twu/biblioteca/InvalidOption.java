package com.twu.biblioteca;

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
        Menu menu = new Menu();
        view.print(invalidMessage);
        view.print(menu.toString());
        String input = view.input();
        Command command = parser.parseCommand(input);
        command.execute();
    }
}
