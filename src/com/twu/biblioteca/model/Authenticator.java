package com.twu.biblioteca.model;

import java.util.ArrayList;

public class Authenticator {
    ArrayList<User> users;

    public Authenticator(ArrayList<User> users) {
        this.users = users;
    }

    public User authenticate(String libraryNumber, String password) {
        for(User user : users) {
            if(user.hasLoginCredentials(libraryNumber, password))
                return user;
        }
        return null;
    }
}
