package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

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
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("ListBooks");
        menu.add("Checkout");
        menu.add("Checkin");
        menu.add("Quit");

        String menuString = "Menu\n";
        for(int menuElement =0;menuElement < menu.size();menuElement++) {
            menuString = menuString + (menuElement+1) + "." + menu.get(menuElement) + "\n";
        }

        when(view.input()).thenReturn("ListBooks");
        when(parser.parseCommand("ListBooks")).thenReturn(command);
        invalidOption.execute();

        verify(view).print("Select a valid option!\n");
        verify(view).print(menuString);
        verify(view).input();
        verify(parser).parseCommand("ListBooks");
        verify(command).execute();
    }
}
