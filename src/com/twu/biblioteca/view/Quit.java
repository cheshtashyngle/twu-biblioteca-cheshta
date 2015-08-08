package com.twu.biblioteca.view;


import com.twu.biblioteca.model.User;

public class Quit implements View {

    @Override
    public void performAction(User user) {
        System.exit(0);
    }
}
