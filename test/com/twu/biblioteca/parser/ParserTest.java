package com.twu.biblioteca.parser;

import com.twu.biblioteca.model.*;
import com.twu.biblioteca.operations.*;
import com.twu.biblioteca.console.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;


public class ParserTest {

    @Test
    public void shouldParseListBooksInputIntoListBooks() {
        String input = "ListBooks";
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        Parser parser = new Parser(library, console);

        assertEquals(ListBooks.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseInvalidInputIntoInvalidOption() {
        String input = "2";
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        Parser parser = new Parser(library, console);

        assertEquals(InvalidOption.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseQuitInputIntoInvalidOption() {
        String input = "Quit";
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        Parser parser = new Parser(library, console);

        assertEquals(Quit.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseCheckoutBookInputIntoCheckoutBook() {
        String input = "CheckoutBook-Head First With Java";
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        Parser parser = new Parser(library, console);

        assertEquals(CheckoutBook.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseCheckinBookInputIntoCheckinBook() {
        String input = "CheckinBook-Head First With Java";
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        Parser parser = new Parser(library, console);

        assertEquals(CheckinBook.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseCheckinMovieInputIntoCheckinMovie() {
        String input = "CheckoutMovie-ABCD2";
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        Parser parser = new Parser(library, console);

        assertEquals(CheckoutMovie.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseListMoviesInputListMovies() {
        String input = "ListMovies";
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        Parser parser = new Parser(library, console);

        assertEquals(ListMovies.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseCheckinMoviesInputCheckinMovies() {
        String input = "CheckinMovie-ABCD2";
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        Parser parser = new Parser(library, console);

        assertEquals(CheckinMovie.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseListCheckedOutBookInputIntoCheckedOutBook() {
        String input = "ListCheckedOutBooks";
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        Parser parser = new Parser(library, console);

        assertEquals(ListCheckOutBooks.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseListCheckedOutMovieInputIntoCheckedOutMovie() {
        String input = "ListCheckedOutMovies";
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        Parser parser = new Parser(library, console);

        assertEquals(ListCheckOutMovies.class, parser.parseCommand(input).getClass());
    }
}
