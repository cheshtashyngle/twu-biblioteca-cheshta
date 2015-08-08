package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.Authenticator;
import com.twu.biblioteca.model.User;


public class Login implements View {
    private Console console;
    private Authenticator authenticator;
    private View loginSuccessfulView;
    private View loginUnSuccessfulView;
    private User currentUser;

    public Login(Console console, Authenticator authenticator, View loginSuccessfulView, View loginUnSuccessfulView) {
        this.console = console;
        this.authenticator = authenticator;
        this.loginSuccessfulView = loginSuccessfulView;
        this.loginUnSuccessfulView = loginUnSuccessfulView;
    }

    @Override
    public void performAction() {
        console.print("Enter your Library Number\n");
        String libraryNumber = console.input();
        console.print("Enter your password\n");
        String password = console.input();
        currentUser = authenticator.authenticate(libraryNumber, password);
        if(currentUser == null) {
            console.print("Login unsuccessful\n");
            loginUnSuccessfulView.performAction();
        }
        else {
            console.print("Login successful\n");
            loginSuccessfulView.performAction();
        }
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
