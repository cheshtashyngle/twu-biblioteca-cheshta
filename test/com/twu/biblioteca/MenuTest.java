package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MenuTest {

    @Test
    public void shouldReturnTheCorrectString() {
        Menu menu = new Menu();

        assertEquals("Menu\n1.ListBooks\n2.ListMovies\n3.CheckoutBook\n4.CheckinBook\n5.CheckoutMovie\n6.CheckinMovie\n7.Quit\n", menu.toString());
    }
}
