public interface IFactory {
    IVeiculo criarVeiculo(CondicaoMeterologica condicaoMeterologica,Integer quantidadePessoas) throws Exception;

}
