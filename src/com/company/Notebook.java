package com.company;

public class Notebook {
    private boolean aberto;
    private boolean ligado;
    protected boolean carregando;


    void status() {
        System.out.println("Informações atuais do notebook");
        System.out.println("Aberto: " + this.aberto);
        System.out.println("Ligado: " + this.ligado);
        System.out.println("Carregando: " + this.carregando);
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isCarregando(){
        return carregando;
    }

    public void setCarregando(boolean carregando){
        this.carregando = carregando;
    }

    public void abrir() {
        if (!this.aberto) {
            this.aberto = true;
            System.out.println("Voce abriu o notebook!");
        } else {
            System.out.println("Seu notebook já está aberto!");
        }
    }

    public void fechar() {
        if (this.aberto) {
            this.aberto = false;
            System.out.println("Voce fechou o notebook!");
        } else {
            System.out.println("Já está fechado!");
        }
    }

    public void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("Voce ligou o notebook!");
        } else {
            System.out.println("Seu notebook já está ligado!");
        }
    }

    public void desligar() {
        if (ligado) {
            this.ligado = false;
            System.out.println("Voce desligou o notebook!");
        } else {
            System.out.println("Já está desligado!");
        }
    }

    public void carregar() {
        if (!carregando) {
            this.carregando = true;
            System.out.println("Voce conectou o notebook na tomada!");
        } else {
            System.out.println("Seu notebook já está carregando!");
        }
    }

    public void jogar() {
        if (!this.aberto & !this.ligado) {
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

    public void programar() {
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

