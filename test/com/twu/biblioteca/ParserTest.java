package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;


public class ParserTest {

    @Test
    public void shouldParseListBooksInputIntoListBooks() {
        String input = "ListBooks";
        Library library = mock(Library.class);
        View view = mock(View.class);
        Parser parser = new Parser(library, view);

        assertEquals(ListBooks.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseInvalidInputIntoInvalidOption() {
        String input = "2";
        Library library = mock(Library.class);
        View view = mock(View.class);
        Parser parser = new Parser(library, view);

        assertEquals(InvalidOption.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseQuitInputIntoInvalidOption() {
        String input = "Quit";
        Library library = mock(Library.class);
        View view = mock(View.class);
        Parser parser = new Parser(library, view);

        assertEquals(Quit.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseCheckoutBookInputIntoCheckoutBook() {
        String input = "CheckoutBook";
        Library library = mock(Library.class);
        View view = mock(View.class);
        Parser parser = new Parser(library, view);

        assertEquals(CheckoutBook.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseCheckinBookInputIntoCheckinBook() {
        String input = "CheckinBook";
        Library library = mock(Library.class);
        View view = mock(View.class);
        Parser parser = new Parser(library, view);

        assertEquals(CheckinBook.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseCheckinMovieInputIntoCheckinMovie() {
        String input = "CheckoutMovie";
        Library library = mock(Library.class);
        View view = mock(View.class);
        Parser parser = new Parser(library, view);

        assertEquals(CheckoutMovie.class, parser.parseCommand(input).getClass());
    }

}
