package com.twu.biblioteca.operations;

import com.twu.biblioteca.parser.Parser;
import com.twu.biblioteca.menu.Menu;
import com.twu.biblioteca.operations.Command;
import com.twu.biblioteca.operations.InvalidOption;
import com.twu.biblioteca.operations.ListBooks;
import com.twu.biblioteca.view.View;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class InvalidOptionTest {

    @Test
    public void shouldTellViewToPrintInvalidMessageAndDisplayMenuAgain() {
        View view = mock(View.class);
        Parser parser = mock(Parser.class);
        Command command = mock(ListBooks.class);
        InvalidOption invalidOption = new InvalidOption(view, parser);
        Menu menu = new Menu();

        when(view.input()).thenReturn("ListBooks");
        when(parser.parseCommand("ListBooks")).thenReturn(command);
        invalidOption.execute();

        verify(view).print("Select a valid option!\n");
        verify(view).print(menu.toString());
        verify(view).input();
        verify(parser).parseCommand("ListBooks");
        verify(command).execute();
    }
}
