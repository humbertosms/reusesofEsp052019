package br.com.morteLenta.model.pratos;

import br.com.morteLenta.model.abstratos.Prato;

public class PratoA extends Prato {

    public PratoA() {
        descricao = "Prato A";
    }

    @Override
    public double getPreco() {
        return 10.0;
    }
}
