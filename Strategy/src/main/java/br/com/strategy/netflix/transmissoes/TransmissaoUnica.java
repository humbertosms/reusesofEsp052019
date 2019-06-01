package br.com.strategy.netflix.transmissoes;

public class TransmissaoUnica implements IPreparadorNumeroTransmissoes{
    public int prepararAmbienteParaTransmissoesSimuntaneas() {
        return 1;
    }
}
