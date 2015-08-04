package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.operations.CheckinBook;
import com.twu.biblioteca.view.View;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CheckinBookTest {

    @Test
    public void shouldTellLibraryToPerformCheckin() {
        Library library = mock(Library.class);
        View view = mock(View.class);
        CheckinBook checkinBook = new CheckinBook(library, view, "Head First With Java");

        checkinBook.execute();

        verify(library).checkinBook("Head First With Java");
    }
}
