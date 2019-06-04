package br.com.morteLenta.model.abstratos;

public abstract class Adicional extends Prato {

    protected Prato prato;

    public Adicional(Prato prato) {
        this.prato = prato;
    }

    abstract public String getDescricao();

}
