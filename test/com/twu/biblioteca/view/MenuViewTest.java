package com.twu.biblioteca.view;

import com.twu.biblioteca.console.Console;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class MenuViewTest {

    @Test
    public void shouldDisplayMenuAndShouldCallNextView() {
        Console console = mock(Console.class);
        View inputView = mock(InputView.class);
        MenuView menuView = new MenuView(console, inputView);

        menuView.performAction();

        String[] menu = {"ListBooks", "ListCheckedOutBooks", "ListMovies", "ListCheckedOutMovies", "CheckoutBook", "CheckinBook", "CheckoutMovie", "CheckinMovie",  "Quit"};
        for (String menuElement : menu) {
            verify(console).print(menuElement);
        }
        verify(console, times(9)).print("\n");
        verify(inputView).performAction();
    }
}