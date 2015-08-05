package com.twu.biblioteca.operations;

import com.twu.biblioteca.console.Console;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class InvalidOptionTest {

    @Test
    public void shouldTellViewToPrintInvalidMessageAndDisplayMenuAgain() {
        Console console = mock(Console.class);
        InvalidOption invalidOption = new InvalidOption(console);

        invalidOption.execute();

        verify(console).print("Select a valid option!\n");
    }
}
