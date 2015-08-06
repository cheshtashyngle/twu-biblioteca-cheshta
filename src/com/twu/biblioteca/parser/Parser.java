package com.twu.biblioteca.parser;

import com.twu.biblioteca.view.*;

public class Parser {

    private View listBooks;
    private View listCheckedOutBooks;
    private View listMovies;
    private View listCheckedOutMovies;
    private View checkoutBook;
    private View checkinBook;
    private View checkoutMovie;
    private View checkinMovie;
    private View quit;
    private View invalidOption;

    public Parser(View listBooks, View listCheckedOutBooks, View listMovies, View listCheckedOutMovies, View checkoutBook, View checkinBook, View checkoutMovie, View checkinMovie, View quit, View invalidOption) {
        this.listBooks = listBooks;
        this.listCheckedOutBooks = listCheckedOutBooks;
        this.listMovies = listMovies;
        this.listCheckedOutMovies = listCheckedOutMovies;
        this.checkoutBook = checkoutBook;
        this.checkinBook = checkinBook;
        this.checkoutMovie = checkoutMovie;
        this.checkinMovie = checkinMovie;
        this.quit = quit;
        this.invalidOption = invalidOption;
    }

    public View parseCommand(String input) {
        if(input.equals("ListBooks")) {
            return listBooks;
        }
        else if(input.equals("ListCheckedOutBooks")) {
            return listCheckedOutBooks;
        }
        else if(input.equals("ListMovies")) {
            return listMovies;
        }
        else if(input.equals("ListCheckedOutMovies")) {
            return listCheckedOutMovies;
        }
        else if(input.equals("CheckoutBook")) {
            return checkoutBook;
        }
        else if(input.equals("CheckinBook")) {
            return checkinBook;
        }
        else if(input.equals("CheckoutMovie")) {
            return checkoutMovie;
        }
        else if(input.equals("CheckinMovie")) {
            return checkinMovie;
        }
        else if(input.equals("Quit")) {
            return quit;
        }
        else {
            return invalidOption;
        }
    }
}
