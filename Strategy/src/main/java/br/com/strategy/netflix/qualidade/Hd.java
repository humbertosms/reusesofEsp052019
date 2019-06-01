package br.com.strategy.netflix.qualidade;

public class Hd implements IContentTransformer {
    public Streaming converterQualidade() {
        return new Streaming("HD");
    }
}
