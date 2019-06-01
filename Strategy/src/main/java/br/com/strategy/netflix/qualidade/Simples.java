package br.com.strategy.netflix.qualidade;

public class Simples implements IContentTransformer{
    public Streaming converterQualidade() {
        return new Streaming("Simples");
    }
}
