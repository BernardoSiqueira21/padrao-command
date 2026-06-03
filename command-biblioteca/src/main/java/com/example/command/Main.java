package com.example.command;

public class Main {

    public static void main(String[] args) {

        Livro livro = new Livro("Padrões de Projeto");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarComando(
                new EmprestarLivroComando(livro));

        biblioteca.executarComandos();

        System.out.println(
                "Livro emprestado: "
                        + livro.isEmprestado());
    }
}