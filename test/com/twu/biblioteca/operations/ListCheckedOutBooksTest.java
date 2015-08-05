package com.twu.biblioteca.operations;

import org.junit.Test;
import com.twu.biblioteca.model.Item;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.console.Console;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ListCheckedOutBooksTest {

    @Test
    public void shouldTellLibraryToTellWhatCheckedOutBooksItHasAndAskViewToPrint() {
        Library library = mock(Library.class);
        Console console = mock(Console.class);
        ListCheckOutBooks listCheckedOutBooks = new ListCheckOutBooks(library, console);

        when(library.checkedOutBooks()).thenReturn(new ArrayList<Item>());
        listCheckedOutBooks.execute();

        verify(console).print("");
    }
}
