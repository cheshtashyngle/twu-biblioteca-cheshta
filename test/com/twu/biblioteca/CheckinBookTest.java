package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CheckinBookTest {

    @Test
    public void shouldTellLibraryToTellWhatBooksIsHasAndAskViewToPrint() {
        Library library = mock(Library.class);
        View view = mock(View.class);
        CheckinBook checkinBook = new CheckinBook(library, view, "Head First With Java");

        checkinBook.execute();

        verify(library).checkinBook("Head First With Java");
    }
}
