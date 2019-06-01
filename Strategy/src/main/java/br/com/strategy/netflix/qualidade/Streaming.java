package br.com.strategy.netflix.qualidade;

public class Streaming {

    Streaming(String tipoTransmissao) {
        this.tipoTransmissao = tipoTransmissao;
    }

    private String tipoTransmissao;

    public String getTipoTransmissao() {
        return tipoTransmissao;
    }

}
