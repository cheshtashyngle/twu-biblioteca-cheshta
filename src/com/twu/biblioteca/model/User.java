package com.twu.biblioteca.model;

public class User {
    private String libraryNumber;
    private String password;

    public User(String libraryNumber, String password) {
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public boolean login(String libraryNumber, String password) {
        if(this.libraryNumber.equals(libraryNumber) && this.password.equals(password)) {
            return true;
        }
        return false;
    }
}