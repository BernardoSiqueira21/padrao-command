package com.example.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    @Test
    void deveEmprestarLivro() {

        Livro livro = new Livro("Java");

        Comando comando =
                new EmprestarLivroComando(livro);

        comando.executar();

        assertTrue(livro.isEmprestado());
    }

    @Test
    void deveDevolverLivro() {

        Livro livro = new Livro("Java");

        livro.emprestar();

        Comando comando =
                new DevolverLivroComando(livro);

        comando.executar();

        assertFalse(livro.isEmprestado());
    }
}