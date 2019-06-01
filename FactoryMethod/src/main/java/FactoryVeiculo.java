public class FactoryVeiculo implements IFactory {
    public IVeiculo criarVeiculo(CondicaoMeterologica condicao, Integer qtdPassageiros) throws Exception {
        /*if (kms > 500)
            throw new Exception("Quilometragem excedida! Limite de 500 kms");*/
        if (qtdPassageiros <= 2)
            return new Tesla();
        if (qtdPassageiros <= 5) {
            if (condicao.equals(CondicaoMeterologica.SOL))
                return new EscorteXR3Conversivel();
            if (condicao.equals(CondicaoMeterologica.CHUVA))
                return new Opala();
        }else
            return new Besta();
        return null;
    }

}
