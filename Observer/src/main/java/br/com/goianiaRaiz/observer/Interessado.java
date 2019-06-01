package br.com.goianiaRaiz.observer;

import br.com.goianiaRaiz.observable.EstacaoMeteorologica;

public class Interessado implements IObserver {
    EstacaoMeteorologica estacao;
    String nome;
    public Interessado(EstacaoMeteorologica estacao,String nome) {
        this.nome = nome;
        this.estacao = estacao;
        estacao.subscribe(this);
    }

    public void notificar() {
        System.out.format("%s - Temperatua: %.2f , Umidade: %.2f , Pressão: %.2f %n",
                this.nome,
                estacao.getTemperatura(),
                estacao.getUmidade(),
                estacao.getPressao());
    }
}
