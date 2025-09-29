package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TarefaTest {
    private Tarefa t;

    @BeforeEach
    void setup() {
        t = new Tarefa(1);
    }

    @Test
    void constroi() {
        assertEquals(1, t.getId());
        assertEquals("", t.getDescricao());
        assertNull(t.getInicio());
        assertNull(t.getFim());
    }

    @Test
    void mudaDescricao() {
        t.setDescricao("descricao");
        assertEquals("descricao", t.getDescricao());
    }

    @Test
    void momentosValidos() {



    }

    @Test
    void momentosInvalido() {
        t.atualiza(criaMomento(24), criaMomento(12));
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            t.atualiza(criaMomento(24), criaMomento(12));
        });
        assertEquals("Momento Invalido!", e.getMessage());
    }

    private Momento criaMomento(int min) {
        Momento m = mock(Momento.class);
        when(m.ajusta(min,1, 59)).thenReturn((min));
        return m;
    }
}
