package com.twu.biblioteca;

import java.util.Scanner;


public class View {

    public void print(String s) {
        System.out.print(s);
    }

    public String input() {
        Scanner sc = new Scanner(System.in);
            return sc.next();
    }
}
