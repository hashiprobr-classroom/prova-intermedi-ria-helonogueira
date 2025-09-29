package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class DataHorarioTest {
    private DataHorario d;


    @BeforeEach
    void setup() {
        Data data = mock(Data.class);
        d = new DataHorario(data);
    }

    @Test
    void constroi() {
        assertEquals(0, d.getHora());
        assertEquals(0, d.getMinuto());
        assertEquals(0, d.minutos());
    }

    @Test
    void horarioBaixo() {
        d.atualiza(-1,-1);
        assertEquals(0, d.getHora());
        assertEquals(0, d.getMinuto());
        assertEquals(0, d.minutos());
    }

    @Test
    void horarioAlto() {
        d.atualiza(24,60);
        assertEquals(23, d.getHora());
        assertEquals(59, d.getMinuto());
    }


}
