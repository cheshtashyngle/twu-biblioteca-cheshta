package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class MenuFormatterTest {

    @Test
    public void shouldReturnTheMenuString() {
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("ListBooks");
        Formatter menuFormatter = new MenuFormatter(menu);

        assertEquals("Menu\n1.ListBooks\n", menuFormatter.format());
    }
}
