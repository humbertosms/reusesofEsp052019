package br.com.strategy.netflix.qualidade;

public class UltraHd implements IContentTransformer {

    public Streaming converterQualidade() {
        return new Streaming("UltraHD");
    }
}
