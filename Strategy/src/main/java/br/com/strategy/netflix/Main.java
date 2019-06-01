package br.com.strategy.netflix;

import br.com.strategy.netflix.assinatura.Assinatura;
import br.com.strategy.netflix.qualidade.Hd;
import br.com.strategy.netflix.qualidade.IContentTransformer;
import br.com.strategy.netflix.qualidade.Simples;
import br.com.strategy.netflix.qualidade.UltraHd;
import br.com.strategy.netflix.transmissoes.IPreparadorNumeroTransmissoes;
import br.com.strategy.netflix.transmissoes.TransmissaoDupla;
import br.com.strategy.netflix.transmissoes.TransmissaoQuadrupla;
import br.com.strategy.netflix.transmissoes.TransmissaoUnica;
import br.com.strategy.netflix.valores.IPreco;
import br.com.strategy.netflix.valores.PrecoBasico;
import br.com.strategy.netflix.valores.PrecoPadrao;
import br.com.strategy.netflix.valores.PrecoPremium;

public class Main {
    public static void main(String[] args) {
        /// Plano Basico
        IPreco preco = new PrecoBasico();
        IContentTransformer qualidade = new Simples();
        IPreparadorNumeroTransmissoes numeroTransmissoes = new TransmissaoUnica();

        Assinatura basico = new Assinatura(preco,qualidade,numeroTransmissoes);

        System.out.println(basico);

        // Plano Padrão
        preco =  new PrecoPadrao();
        qualidade = new Hd();
        numeroTransmissoes = new TransmissaoDupla();

        Assinatura padrao = new Assinatura(preco,qualidade,numeroTransmissoes);

        System.out.println(padrao);

        // Plano Premium
        preco = new PrecoPremium();
        qualidade = new UltraHd();
        numeroTransmissoes = new TransmissaoQuadrupla();

        Assinatura premium = new Assinatura(preco,qualidade,numeroTransmissoes);
        System.out.println(premium);

    }
}
