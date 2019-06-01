package br.com.strategy.netflix.transmissoes;

public class TransmissaoQuadrupla implements IPreparadorNumeroTransmissoes{
    public int prepararAmbienteParaTransmissoesSimuntaneas() {
        return 4;
    }
}
