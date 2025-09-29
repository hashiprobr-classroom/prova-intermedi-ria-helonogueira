package br.edu.insper.desagil.pi.freela;

public abstract class Momento {

    public int ajusta(int valor, int min, int max) {
        if (valor < min) {
            return min;
        } else if (valor > max) {
            return max;
        } else {
            return valor;
        }
    }

    public abstract int minutos();
}
