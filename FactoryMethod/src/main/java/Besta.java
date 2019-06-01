public class Besta implements IVeiculo {
    public void imprimirNome() {
        System.out.println("Besta 12 Lugares");
    }

    public Integer qtdPassageiros() {
        return 12;
    }

    public boolean conversivel() {
        return false;
    }

    public CombustivelEnum combustivelUsado() {
        return null;
    }
}
