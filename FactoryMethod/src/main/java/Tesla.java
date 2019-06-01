public class Tesla implements IVeiculo {
    public void imprimirNome() {
        System.out.println("Tesla Model 3");
    }

    public Integer qtdPassageiros() {
        return 5;
    }

    public CombustivelEnum combustivelUsado() {
        return null;
    }

    public boolean conversivel() {
        return false;
    }
}
