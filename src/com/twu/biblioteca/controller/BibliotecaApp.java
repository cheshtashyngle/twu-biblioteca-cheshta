package com.twu.biblioteca.controller;

import com.twu.biblioteca.view.View;

public class BibliotecaApp {
    private View startView;

    public BibliotecaApp(View startView) {
        this.startView = startView;
    }

    public void run() {
        startView.performAction();
    }
}
