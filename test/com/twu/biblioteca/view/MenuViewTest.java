package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.parser.Parser;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class MenuViewTest {

    @Test
    public void shouldDisplayMenuAndShouldCallNextView() {
        Console console = mock(Console.class);
        MenuView menuView = new MenuView(console);
        Parser parser = mock(Parser.class);
        View listBooks = mock(ListBooks.class);
        User user = new User("000-2015", "000-2015", "Student1", "student@gmail.com", "1234567890", false);
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("ListBooks");
        menu.add("ListMovies");
        menu.add("CheckoutBook");
        menu.add("CheckinBook");
        menu.add("CheckoutMovie");
        menu.add("CheckinMovie");
        menu.add("Profile");
        menu.add("Logout");
        menu.add("Quit");

        menuView.setParser(parser);
        when(console.input()).thenReturn("ListBooks");
        when(parser.parseCommand(anyString())).thenReturn(listBooks);
        menuView.performAction(user);

        for(String menuElement : menu) {
            verify(console).print(menuElement);
        }
        verify(console,times(9)).print("\n");
        verify(listBooks).performAction(user);
    }
}