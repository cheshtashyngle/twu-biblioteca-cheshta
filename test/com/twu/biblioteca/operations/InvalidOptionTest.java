package com.twu.biblioteca.operations;

import com.twu.biblioteca.parser.Parser;
import com.twu.biblioteca.menu.Menu;
import com.twu.biblioteca.console.Console;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class InvalidOptionTest {

    @Test
    public void shouldTellViewToPrintInvalidMessageAndDisplayMenuAgain() {
        Console console = mock(Console.class);
        Parser parser = mock(Parser.class);
        Command command = mock(ListBooks.class);
        InvalidOption invalidOption = new InvalidOption(console, parser);
        Menu menu = new Menu();

        when(console.input()).thenReturn("ListBooks");
        when(parser.parseCommand("ListBooks")).thenReturn(command);
        invalidOption.execute();

        verify(console).print("Select a valid option!\n");
        verify(console).print(menu.toString());
        verify(console).input();
        verify(parser).parseCommand("ListBooks");
        verify(command).execute();
    }
}
