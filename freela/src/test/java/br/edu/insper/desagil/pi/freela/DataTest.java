package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {

    @Test
    void constroi() {
        Data d = new Data();
        assertEquals(1, d.getDia());
        assertEquals(1, d.getMes());
        assertEquals(1970, d.getAno());
        assertEquals(0, d.minutos());
    }

    @Test
    void dataBaixa() {
        Data d = new Data();
        d.atualiza(1969, 0,0);
        assertEquals(1,d.getDia());
        assertEquals(1, d.getMes());
        assertEquals(1970, d.getAno());
    }

    @Test
    void dataAlta() {
        Data d = new Data();
        d.atualiza(2071, 13, 32);
        assertEquals(31, d.getDia());
        assertEquals(2070, d.getAno());

    }

}
