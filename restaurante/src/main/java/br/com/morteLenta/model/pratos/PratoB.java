package br.com.morteLenta.model.pratos;

import br.com.morteLenta.model.abstratos.Prato;

public class PratoB extends Prato {

    public PratoB() {
        descricao = "Prato B";
    }

    @Override
    public double getPreco() {
        return 12.0;
    }
}
