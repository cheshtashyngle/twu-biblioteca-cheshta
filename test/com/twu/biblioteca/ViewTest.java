package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewTest {
    private ByteArrayOutputStream os = new ByteArrayOutputStream();
    PrintStream printStream;

    @Before
    public void setUpStream() {
        printStream = System.out;
        System.setOut(new PrintStream(os));
    }

    @Test
    public void shouldPrintCorrectWelcomeMessage() {
        View view = new View();
        String welcomeMessage = "Welcome to Biblioteca Library Management System\n";
        view.print(welcomeMessage);

        assertEquals("Welcome to Biblioteca Library Management System\n", os.toString());
    }

    @After
    public void cleanUpStream() {
        System.setOut(printStream);
    }
}

