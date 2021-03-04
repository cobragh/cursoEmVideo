package com.company;

public class Notebook {
    boolean aberto;
    boolean ligado;
    boolean carregando;


    void status() {
        System.out.println("Informações atuais do notebook");
        System.out.println("Aberto: " + this.aberto);
        System.out.println("Ligado: " + this.ligado);
        System.out.println("Carregando: " + this.carregando);
    }

    void abrir() {
        if (!this.aberto) {
            this.aberto = true;
        } else {
            System.out.println("Seu notebook já está aberto!");
        }
    }

    void fechar() {
        if (this.aberto) {
            this.aberto = false;
        } else {
            System.out.println("Já está fechado!");
        }
    }

    void ligar() {
        if (!this.ligado) {
            this.ligado = true;
        } else {
            System.out.println("Seu notebook já está ligado!");
        }
    }

    void desligar() {
        if (ligado) {
            this.ligado = false;
        } else {
            System.out.println("Já está desligado!");
        }
    }

    void carregar() {
        if (!carregando) {
            this.carregando = true;
        } else {
            System.out.println("Seu notebook já está carregando!");
        }
    }

    void jogar() {
        if (!this.aberto& !this.ligado) {
            System.out.println("Voce deve abrir e ligar o notebook antes!");
        } else {
            if (!this.aberto) {
                System.out.println("Voce deve abrir o notebook antes!");
            }
            if (!this.ligado) {
                System.out.println("Voce deve ligar o notebook antes!");
            }
        }
        if (aberto & ligado) {
            System.out.println("Pode abrir seu cs ou valorinho!");
        }

    }

    void programar() {
        if (!aberto & !ligado) {
            System.out.println("Voce deve abrir e ligar o notebook antes!");
        } else {
            if (!aberto) {
                System.out.println("Voce deve abrir o notebook antes!");
            }
            if (!ligado) {
                System.out.println("Voce deve ligar o notebook antes!");
            }
        }
        if (aberto & ligado) {
            System.out.println("Pode programar a vontade!");
        }
    }
}

