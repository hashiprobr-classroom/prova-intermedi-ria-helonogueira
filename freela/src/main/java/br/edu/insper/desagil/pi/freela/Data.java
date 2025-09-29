package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento {
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer, Integer> limite;

    public Data() {
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        this.limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void atualiza(int novoAno, int novoMes, int novoDia) {
        if (novoAno > 1970) {
            if (novoAno < 2070) {
                ano = novoAno;
            }
            ano = ajusta(novoAno, 1970, 2070);
        }
        if (novoMes > 1) {
            if (novoAno < 12) {
                mes = novoMes;
            }
            mes = ajusta(mes, 1, 12);
        }
        if (novoDia > 1) {
            if (novoAno < limite.get(mes)) {
                dia = novoDia;
            }
            dia = ajusta(novoDia, 1, limite.get(mes));
        }

    }

    @Override
    public int minutos() {
        int anos = getAno() - 1970;
        int dias = (anos*365)-365;
        int contagemDias = 0;
        for (int i =0; i<=getMes(); i++) {
            contagemDias += limite.get(i);
        }
        int totalDias = dias + (contagemDias - limite.get(getMes())) + getDia();

        return totalDias*24*60;
    }
}
