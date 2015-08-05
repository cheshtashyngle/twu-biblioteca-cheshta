package com.twu.biblioteca.console;

import java.util.Scanner;


public class Console {

    public void print(String s) {
        System.out.print(s);
    }

    public String input() {
        Scanner sc = new Scanner(System.in);
            return sc.nextLine();
    }
}
