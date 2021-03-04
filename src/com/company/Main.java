package com.company;
import com.company.Notebook;

public class Main {

    public static void main(String[] args) {
        Notebook note = new Notebook();

        note.carregar();
        note.fechar();
        note.ligar();
        note.status();
        note.jogar();

    }
}
