package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewTest {
    private ByteArrayOutputStream os = new ByteArrayOutputStream();
    private ByteArrayInputStream is = new ByteArrayInputStream("My".getBytes());
    PrintStream printStreamOut;
    InputStream printStreamIn;

    @Before
    public void setUpStream() {
        printStreamOut = System.out;
        printStreamIn = System.in;
        System.setOut(new PrintStream(os));
        System.setIn(is);
    }

    @Test
    public void shouldPrintCorrectWelcomeMessage() {
        View view = new View();
        String welcomeMessage = "Welcome to Biblioteca Library Management System\n";
        view.print(welcomeMessage);

        assertEquals("Welcome to Biblioteca Library Management System\n", os.toString());
    }

    @Test
    public void shouldReturnTheCorrectInput() {
        View view = new View();

        assertEquals("My", view.input());
    }

    @After
    public void cleanUpStream() {
        System.setOut(printStreamOut);
        System.setIn(printStreamIn);
    }
}