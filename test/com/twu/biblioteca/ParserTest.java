package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;


public class ParserTest {

    @Test
    public void shouldParseListBooksIntoListBooks() {
        String input = "ListBooks";
        Library library = mock(Library.class);
        View view = mock(View.class);
        Parser parser = new Parser(library, view);

        assertEquals(ListBooks.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseInvalidIntoInvalidOption() {
        String input = "2";
        Library library = mock(Library.class);
        View view = mock(View.class);
        Parser parser = new Parser(library, view);

        assertEquals(InvalidOption.class, parser.parseCommand(input).getClass());
    }

    @Test
    public void shouldParseQuitIntoInvalidOption() {
        String input = "Quit";
        Library library = mock(Library.class);
        View view = mock(View.class);
        Parser parser = new Parser(library, view);

        assertEquals(Quit.class, parser.parseCommand(input).getClass());
    }
}
