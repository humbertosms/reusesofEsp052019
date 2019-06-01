package br.com.strategy.netflix.transmissoes;

public class TransmissaoDupla implements IPreparadorNumeroTransmissoes {
    public int prepararAmbienteParaTransmissoesSimuntaneas() {
        return 2;
    }
}
