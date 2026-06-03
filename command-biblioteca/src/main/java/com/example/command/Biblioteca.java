package com.example.command;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Comando> comandos = new ArrayList<>();

    public void adicionarComando(Comando comando) {
        comandos.add(comando);
    }

    public void executarComandos() {
        for (Comando comando : comandos) {
            comando.executar();
        }
    }
}