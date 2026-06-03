package com.example.command;

public class Livro {

    private String titulo;
    private boolean emprestado;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.emprestado = false;
    }

    public void emprestar() {
        emprestado = true;
    }

    public void devolver() {
        emprestado = false;
    }

    public boolean isEmprestado() {
        return emprestado;
    }
}