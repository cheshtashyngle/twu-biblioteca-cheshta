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
        View profile = mock(Profile.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout, profile);
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
        View profile = mock(Profile.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout, profile);
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
        View profile = mock(Profile.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout, profile);
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
        View profile = mock(Profile.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout, profile);
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
        View profile = mock(Profile.class);


        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout, profile);
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
        View profile = mock(Profile.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout, profile);
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
        View profile = mock(Profile.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout, profile);
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
        View profile = mock(Profile.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout, profile);
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
        View profile = mock(Profile.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout, profile);
        assertEquals(listCheckedOutBooks.getClass(), parser.parseCommand(input).getClass());
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
        View profile = mock(Profile.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout, profile);
        assertEquals(listCheckedOutMovies.getClass(), parser.parseCommand(input).getClass());      }

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
        View profile = mock(Profile.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout, profile);
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
        View profile = mock(Profile.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout, profile);
        assertEquals(logout.getClass(), parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseProfileInputIntoProfile() {
        String input = "Profile";
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
        View profile = mock(Profile.class);

        Parser parser = new Parser(listBooks, listCheckedOutBooks, listMovies, listCheckedOutMovies, checkoutBook, checkinBook, checkoutMovie, checkinMovie, quit, login, invalidOption, logout, profile);
        assertEquals(profile.getClass(), parser.parseCommand(input).getClass());
    }
}
