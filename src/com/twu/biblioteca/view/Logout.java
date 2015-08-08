package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.User;

public class Logout implements View {
    private Console console;
    private View nextView;

    public Logout(Console console, View nextView) {
        this.console = console;
        this.nextView = nextView;
    }

    @Override
    public void performAction(User user) {
        console.print("Logout Successful\n");
        nextView.performAction(null);
    }
}
