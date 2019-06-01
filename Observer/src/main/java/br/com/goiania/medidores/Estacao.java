package br.com.goiania.medidores;

import com.google.gson.Gson;

import java.util.Observable;

public class Estacao extends Observable {
    private double temperatura;
    private double pressao;
    private double umidade;

    public Estacao(double temperatura, double pressao, double umidade) {
        this.temperatura = temperatura;
        this.pressao = pressao;
        this.umidade = umidade;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        setChanged();
        notifyObservers();
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
        setChanged();
        notifyObservers();
    }

    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "{'temperatura':"+temperatura+",'pressao':"+pressao+",'umidade':"+umidade+"}";
        //return new Gson().toJson(this,this.getClass());
        }
}
