package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CheckinTest {

    @Test
    public void shouldTellLibraryToTellWhatBooksIsHasAndAskViewToPrint() {
        Library library = mock(Library.class);
        View view = mock(View.class);
        Checkin checkin = new Checkin(library, view, "Head First With Java");

        checkin.execute();

        verify(library).checkin("Head First With Java");
    }
}
