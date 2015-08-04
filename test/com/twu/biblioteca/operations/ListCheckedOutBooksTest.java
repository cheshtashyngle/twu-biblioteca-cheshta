package com.twu.biblioteca.operations;

import org.junit.Test;
import com.twu.biblioteca.model.Item;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.operations.ListCheckOutBooks;
import com.twu.biblioteca.view.View;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ListCheckedOutBooksTest {

    @Test
    public void shouldTellLibraryToTellWhatCheckedOutBooksItHasAndAskViewToPrint() {
        Library library = mock(Library.class);
        View view = mock(View.class);
        ListCheckOutBooks listCheckedOutBooks = new ListCheckOutBooks(library, view);

        when(library.checkedOutBooks()).thenReturn(new ArrayList<Item>());
        listCheckedOutBooks.execute();

        verify(view).print("");
    }
}
