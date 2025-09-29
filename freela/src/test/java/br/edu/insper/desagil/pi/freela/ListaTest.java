package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListaTest {

    private Lista l;

    @BeforeEach
    void setup() {
        l = new Lista();
    }

    @Test
    void constroi() {
        assertEquals(0, l.getTarefas().size());
    }

    @Test
    void adicionaIguais() {
        Tarefa tarefa = new Tarefa(1);
        l.adiciona(tarefa);
        l.adiciona(tarefa);
        assertEquals(1, l.getTarefas().size());
    }


}
