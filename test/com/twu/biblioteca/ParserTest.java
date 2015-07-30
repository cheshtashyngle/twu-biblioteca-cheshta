package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ParserTest {

    @Test
    public void shouldParse1IntoListBooks() {
        String input = "1";
        Parser parser = new Parser(input);

        assertEquals(ListBooks.class, parser.parseCommand().getClass());
    }
}
