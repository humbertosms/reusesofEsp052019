package br.com.morteLenta.model.adicionais;

import br.com.morteLenta.model.abstratos.Adicional;
import br.com.morteLenta.model.abstratos.Prato;

public class DobroCarne extends Adicional {
    public DobroCarne(Prato prato) {
        super(prato);
    }

    @Override
    public String getDescricao() {
        return "Dobro de carne";
    }

    @Override
    public double getPreco() {
        return prato.getPreco() +12.5;
    }
}
