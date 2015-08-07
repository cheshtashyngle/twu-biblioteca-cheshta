package com.twu.biblioteca.model;

public class User {
    private String libraryNumber;
    private String password;
    private String role;

    public User(String libraryNumber, String password, String role) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.role = role;
    }

    public boolean hasLoginCredentials(String libraryNumber, String password) {
        if(this.libraryNumber.equals(libraryNumber) && this.password.equals(password)) {
            return true;
        }
        return false;
    }
}