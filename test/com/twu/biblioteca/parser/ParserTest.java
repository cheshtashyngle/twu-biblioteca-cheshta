package com.twu.biblioteca.parser;

import com.twu.biblioteca.view.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;


public class ParserTest {

    @Test
    public void shouldParseListBooksInputIntoListBooks() {
        String input = "ListBooks";
        View listBooks = mock(ListBooks.class);
        View listCheckedOutBooks = mock(ListCheckOutBooks.class);
        View listMovies = mock(ListMovies.class);
        View listCheckedOutMovies = mock(ListCheckOutMovies.class);
        View checkoutBook = mock(CheckoutBook.class);
        View checkinBook = mock(CheckinBook.class);
        View checkoutMovie = mock(CheckoutMovie.class);
        View checkinMovie = mock(CheckinMovie.class);
        View quit = mock(Quit.class);
        View invalidOption = mock(InvalidOption.class);
        View login = mock(Login.class);
        View logout = mock(Logout.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout);
        assertEquals(listBooks.getClass(), parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseInvalidInputIntoInvalidOption() {
        String input = "InvalidOption";
        View listBooks = mock(ListBooks.class);
        View listCheckedOutBooks = mock(ListCheckOutBooks.class);
        View listMovies = mock(ListMovies.class);
        View listCheckedOutMovies = mock(ListCheckOutMovies.class);
        View checkoutBook = mock(CheckoutBook.class);
        View checkinBook = mock(CheckinBook.class);
        View checkoutMovie = mock(CheckoutMovie.class);
        View checkinMovie = mock(CheckinMovie.class);
        View quit = mock(Quit.class);
        View invalidOption = mock(InvalidOption.class);
        View login = mock(Login.class);
        View logout = mock(Logout.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout);
        assertEquals(invalidOption.getClass(), parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseQuitInputIntoQuit() {
        String input = "Quit";
        View listBooks = mock(ListBooks.class);
        View listCheckedOutBooks = mock(ListCheckOutBooks.class);
        View listMovies = mock(ListMovies.class);
        View listCheckedOutMovies = mock(ListCheckOutMovies.class);
        View checkoutBook = mock(CheckoutBook.class);
        View checkinBook = mock(CheckinBook.class);
        View checkoutMovie = mock(CheckoutMovie.class);
        View checkinMovie = mock(CheckinMovie.class);
        View quit = mock(Quit.class);
        View invalidOption = mock(InvalidOption.class);
        View login = mock(Login.class);
        View logout = mock(Logout.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout);
        assertEquals(quit.getClass(), parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseCheckoutBookInputIntoCheckoutBook() {
        String input = "CheckoutBook";
        View listBooks = mock(ListBooks.class);
        View listCheckedOutBooks = mock(ListCheckOutBooks.class);
        View listMovies = mock(ListMovies.class);
        View listCheckedOutMovies = mock(ListCheckOutMovies.class);
        View checkoutBook = mock(CheckoutBook.class);
        View checkinBook = mock(CheckinBook.class);
        View checkoutMovie = mock(CheckoutMovie.class);
        View checkinMovie = mock(CheckinMovie.class);
        View quit = mock(Quit.class);
        View invalidOption = mock(InvalidOption.class);
        View login = mock(Login.class);
        View logout = mock(Logout.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout);
        assertEquals(checkoutBook.getClass(), parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseCheckinBookInputIntoCheckinBook() {
        String input = "CheckinBook";
        View listBooks = mock(ListBooks.class);
        View listCheckedOutBooks = mock(ListCheckOutBooks.class);
        View listMovies = mock(ListMovies.class);
        View listCheckedOutMovies = mock(ListCheckOutMovies.class);
        View checkoutBook = mock(CheckoutBook.class);
        View checkinBook = mock(CheckinBook.class);
        View checkoutMovie = mock(CheckoutMovie.class);
        View checkinMovie = mock(CheckinMovie.class);
        View quit = mock(Quit.class);
        View invalidOption = mock(InvalidOption.class);
        View login = mock(Login.class);
        View logout = mock(Logout.class);


        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout);
        assertEquals(checkinBook.getClass(), parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseCheckoutMovieInputIntoCheckoutMovie() {
        String input = "CheckoutMovie";
        View listBooks = mock(ListBooks.class);
        View listCheckedOutBooks = mock(ListCheckOutBooks.class);
        View listMovies = mock(ListMovies.class);
        View listCheckedOutMovies = mock(ListCheckOutMovies.class);
        View checkoutBook = mock(CheckoutBook.class);
        View checkinBook = mock(CheckinBook.class);
        View checkoutMovie = mock(CheckoutMovie.class);
        View checkinMovie = mock(CheckinMovie.class);
        View quit = mock(Quit.class);
        View invalidOption = mock(InvalidOption.class);
        View login = mock(Login.class);
        View logout = mock(Logout.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout);
        assertEquals(checkoutMovie.getClass(), parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseListMoviesInputListMovies() {
        String input = "ListMovies";
        View listBooks = mock(ListBooks.class);
        View listCheckedOutBooks = mock(ListCheckOutBooks.class);
        View listMovies = mock(ListMovies.class);
        View listCheckedOutMovies = mock(ListCheckOutMovies.class);
        View checkoutBook = mock(CheckoutBook.class);
        View checkinBook = mock(CheckinBook.class);
        View checkoutMovie = mock(CheckoutMovie.class);
        View checkinMovie = mock(CheckinMovie.class);
        View quit = mock(Quit.class);
        View invalidOption = mock(InvalidOption.class);
        View login = mock(Login.class);
        View logout = mock(Logout.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout);
        assertEquals(listMovies.getClass(), parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseCheckinMoviesInputCheckinMovies() {
        String input = "CheckinMovie";
        View listBooks = mock(ListBooks.class);
        View listCheckedOutBooks = mock(ListCheckOutBooks.class);
        View listMovies = mock(ListMovies.class);
        View listCheckedOutMovies = mock(ListCheckOutMovies.class);
        View checkoutBook = mock(CheckoutBook.class);
        View checkinBook = mock(CheckinBook.class);
        View checkoutMovie = mock(CheckoutMovie.class);
        View checkinMovie = mock(CheckinMovie.class);
        View quit = mock(Quit.class);
        View invalidOption = mock(InvalidOption.class);
        View login = mock(Login.class);
        View logout = mock(Logout.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout);
        assertEquals(checkinMovie.getClass(), parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseListCheckedOutBookInputIntoCheckedOutBook() {
        String input = "ListCheckedOutBooks";
        View listBooks = mock(ListBooks.class);
        View listCheckedOutBooks = mock(ListCheckOutBooks.class);
        View listMovies = mock(ListMovies.class);
        View listCheckedOutMovies = mock(ListCheckOutMovies.class);
        View checkoutBook = mock(CheckoutBook.class);
        View checkinBook = mock(CheckinBook.class);
        View checkoutMovie = mock(CheckoutMovie.class);
        View checkinMovie = mock(CheckinMovie.class);
        View quit = mock(Quit.class);
        View invalidOption = mock(InvalidOption.class);
        View login = mock(Login.class);
        View logout = mock(Logout.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout);        assertEquals(listCheckedOutBooks.getClass(), parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseListCheckedOutMovieInputIntoCheckedOutMovie() {
        String input = "ListCheckedOutMovies";
        View listBooks = mock(ListBooks.class);
        View listCheckedOutBooks = mock(ListCheckOutBooks.class);
        View listMovies = mock(ListMovies.class);
        View listCheckedOutMovies = mock(ListCheckOutMovies.class);
        View checkoutBook = mock(CheckoutBook.class);
        View checkinBook = mock(CheckinBook.class);
        View checkoutMovie = mock(CheckoutMovie.class);
        View checkinMovie = mock(CheckinMovie.class);
        View quit = mock(Quit.class);
        View invalidOption = mock(InvalidOption.class);
        View login = mock(Login.class);
        View logout = mock(Logout.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout);        assertEquals(listCheckedOutMovies.getClass(), parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseLoginInputIntoLogin() {
        String input = "Login";
        View listBooks = mock(ListBooks.class);
        View listCheckedOutBooks = mock(ListCheckOutBooks.class);
        View listMovies = mock(ListMovies.class);
        View listCheckedOutMovies = mock(ListCheckOutMovies.class);
        View checkoutBook = mock(CheckoutBook.class);
        View checkinBook = mock(CheckinBook.class);
        View checkoutMovie = mock(CheckoutMovie.class);
        View checkinMovie = mock(CheckinMovie.class);
        View quit = mock(Quit.class);
        View invalidOption = mock(InvalidOption.class);
        View login = mock(Login.class);
        View logout = mock(Logout.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout);
        assertEquals(login.getClass(), parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseLogoutInputIntoLogout() {
        String input = "Logout";
        View listBooks = mock(ListBooks.class);
        View listCheckedOutBooks = mock(ListCheckOutBooks.class);
        View listMovies = mock(ListMovies.class);
        View listCheckedOutMovies = mock(ListCheckOutMovies.class);
        View checkoutBook = mock(CheckoutBook.class);
        View checkinBook = mock(CheckinBook.class);
        View checkoutMovie = mock(CheckoutMovie.class);
        View checkinMovie = mock(CheckinMovie.class);
        View quit = mock(Quit.class);
        View invalidOption = mock(InvalidOption.class);
        View login = mock(Login.class);
        View logout = mock(Logout.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout);

        assertEquals(logout.getClass(), parser.parseCommand(input).getClass());
    }
}
