package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MenuTest {

    @Test
    public void shouldReturnTheCorrectString() {
        Menu menu = new Menu();

        assertEquals("Menu\n1.ListBooks\n2.Checkout\n3.Checkin\n4.Quit\n", menu.toString());
    }
}
