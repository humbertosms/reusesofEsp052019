public interface IVeiculo {
    void imprimirNome();
    Integer qtdPassageiros();
    boolean conversivel();
    CombustivelEnum combustivelUsado();
}
