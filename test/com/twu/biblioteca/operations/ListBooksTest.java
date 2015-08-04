package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Item;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.operations.ListBooks;
import com.twu.biblioteca.view.View;
import org.junit.Test;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class ListBooksTest {

    @Test
    public void shouldTellLibraryToTellWhatBooksItHasAndAskViewToPrint() {
        Library library = mock(Library.class);
        View view = mock(View.class);
        ListBooks listBooks = new ListBooks(library, view);

        when(library.books()).thenReturn(new ArrayList<Item>());
        listBooks.execute();

        verify(view).print("");
    }
}
