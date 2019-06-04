package br.com.morteLenta.model.abstratos;

public abstract class Prato {

    protected String descricao;

    protected Prato() {
        descricao = "";
    }

    abstract public double getPreco();

    public String getDescricao() {
        return descricao;
    }

}
