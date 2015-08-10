package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.User;

public class Profile implements View {
    private Console console;
    private View nextView;

    public Profile(Console console, View view) {
        this.console = console;
        this.nextView = view;
    }

    @Override
    public void performAction(User user) {
        console.print(user.toString());
        nextView.performAction(user);
    }
}
