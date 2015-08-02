package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MenuTest {

    @Test
    public void shouldReturnTheCorrectString() {
        Menu menu = new Menu();

        assertEquals("Menu\n1.ListBooks\n2.ListCheckedOutBooks\n3.ListMovies\n4.ListCheckedOutMovies\n5.CheckoutBook\n6.CheckinBook\n7.CheckoutMovie\n8.CheckinMovie\n9.Quit\n", menu.toString());
    }
}
