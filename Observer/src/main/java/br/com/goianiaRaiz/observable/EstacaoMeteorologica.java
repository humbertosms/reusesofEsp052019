package br.com.goianiaRaiz.observable;

import br.com.goianiaRaiz.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica implements IObservable {
    private double temperatura;
    private double pressao;
    private double umidade;
    private List<IObserver> observadores =  new ArrayList<IObserver>();

    public EstacaoMeteorologica(double temperatura, double pressao, double umidade) {
        this.temperatura = temperatura;
        this.pressao = pressao;
        this.umidade = umidade;

    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        this.noitificarClintes();
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
        this.noitificarClintes();
    }

    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
        this.noitificarClintes();
    }


    public void subscribe(IObserver cliente) {
        this.observadores.add(cliente);
    }

    public void unSubscribe(IObserver cliente) {
        this.observadores.remove(cliente);
    }

    public void noitificarClintes() {
        for (IObserver observadore : observadores) {
            observadore.notificar();
        }

    }
}
