package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MenuTest {

    @Test
    public void shouldReturnTheCorrectString() {
        Menu menu = new Menu();

        assertEquals("Menu\n1.ListBooks\n2.ListCheckedOutBooks\n3.ListMovies\n4.CheckoutBook\n5.CheckinBook\n6.CheckoutMovie\n7.CheckinMovie\n8.Quit\n", menu.toString());
    }
}
