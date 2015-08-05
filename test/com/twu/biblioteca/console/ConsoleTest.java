package com.twu.biblioteca.console;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ConsoleTest {
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
        Console console = new Console();
        String welcomeMessage = "Welcome to Biblioteca Library Management System\n";
        console.print(welcomeMessage);

        assertEquals("Welcome to Biblioteca Library Management System\n", os.toString());
    }

    @Test
    public void shouldReturnTheCorrectInput() {
        Console console = new Console();

        assertEquals("My", console.input());
    }

    @After
    public void cleanUpStream() {
        System.setOut(printStreamOut);
        System.setIn(printStreamIn);
    }
}