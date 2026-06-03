package com.example.command;

public class DevolverLivroComando implements Comando {

    private Livro livro;

    public DevolverLivroComando(Livro livro) {
        this.livro = livro;
    }

    @Override
    public void executar() {
        livro.devolver();
    }
}