public class FactoryVeiculoCrise implements IFactory {
    public IVeiculo criarVeiculo(CondicaoMeterologica condicaoMeterologica, Integer quantidadePessoas) throws Exception {
        return new Tesla();
    }


}
