package br.com.strategy.netflix.assinatura;

import br.com.strategy.netflix.qualidade.IContentTransformer;
import br.com.strategy.netflix.qualidade.Streaming;
import br.com.strategy.netflix.transmissoes.IPreparadorNumeroTransmissoes;
import br.com.strategy.netflix.valores.IPreco;

public class Assinatura {
    private IPreco preco;
    private IContentTransformer qualidade;
    private IPreparadorNumeroTransmissoes numeroTransmissoes;

    public Assinatura(IPreco preco, IContentTransformer qualidade, IPreparadorNumeroTransmissoes numeroTransmissoes) {
        this.preco = preco;
        this.qualidade = qualidade;
        this.numeroTransmissoes = numeroTransmissoes;
    }

    public double getPreco() {
        return preco.getPreco();
    }

    public Streaming getQualidade() {
        return qualidade.converterQualidade();
    }

    public int getNumeroTransmissoes() {
        return numeroTransmissoes.prepararAmbienteParaTransmissoesSimuntaneas();
    }

    @Override
    public String toString() {
        return (this.preco.getPreco()==21.90d? " Plano Básico ":(this.preco.getPreco()==32.90d?" Plano Padrão ":" Plano Premium "))+
                " Preço :"+this.preco.getPreco() +
                " Qualidade :"+this.qualidade.converterQualidade().getTipoTransmissao()+
                " Numero de usuários:"+ this.numeroTransmissoes.prepararAmbienteParaTransmissoesSimuntaneas();
    }
}
