package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MenuTest {

    @Test
    public void shouldReturnTheCorrectString() {
        Menu menu = new Menu();

        assertEquals("Menu\n1.ListBooks\n2.CheckoutBook\n3.CheckinBook\n4.CheckoutMovie\n5.Quit\n", menu.toString());
    }
}
