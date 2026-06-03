package com.example.command;

public class EmprestarLivroComando implements Comando {

    private Livro livro;

    public EmprestarLivroComando(Livro livro) {
        this.livro = livro;
    }

    @Override
    public void executar() {
        livro.emprestar();
    }
}