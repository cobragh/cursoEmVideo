package com.company;

import com.company.Notebook;

public class Main {

    public static void main(String[] args) {
        Notebook note = new Notebook();

        note.abrir();
        note.ligar();
        note.status();
        note.jogar();
    }
}
