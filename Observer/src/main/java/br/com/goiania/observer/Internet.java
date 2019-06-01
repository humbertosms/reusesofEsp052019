package br.com.goiania.observer;

import br.com.goiania.medidores.Estacao;

import java.util.Observable;
import java.util.Observer;

public class Internet implements Observer {

    Observable estacao;

    public Internet(Observable estacao) {
        this.estacao = estacao;
        estacao.addObserver(this);
    }

    public void update(Observable estacaoSubject, Object o) {
        if (estacaoSubject instanceof Estacao){
            estacao = estacaoSubject;
            System.out.println(estacao);
        }
    }
}
