package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento {
    private int hora;
    private int minuto;
    private Data data;

    public DataHorario(Data data) {
        this.hora = 0;
        this.minuto = 0;
        this.data = data;

    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void atualiza (int novaHora, int novoMinuto) {
        if (novaHora > 0) {
            if (novaHora < 23) {
                hora = novaHora;
            }
            hora = ajusta(novaHora, 0, 23);
        }
        if (novoMinuto > 0) {
            if (novoMinuto < 59) {
                minuto = novoMinuto;
            }
            minuto = ajusta(novoMinuto, 0, 59);
        }

    }

    @Override
    public int minutos(){
        return ((data.minutos()/60)/24) * getHora()*getMinuto();
    }
    

}
