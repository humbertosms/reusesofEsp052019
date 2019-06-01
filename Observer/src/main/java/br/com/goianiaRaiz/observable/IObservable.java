package br.com.goianiaRaiz.observable;

import br.com.goianiaRaiz.observer.IObserver;

public interface IObservable {
    void subscribe(IObserver cliente);
    void unSubscribe(IObserver cliente);
    void noitificarClintes();
}
