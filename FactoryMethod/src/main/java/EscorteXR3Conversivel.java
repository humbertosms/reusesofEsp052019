public class EscorteXR3Conversivel implements IVeiculo {
    public void imprimirNome() {
        System.out.println("Escortão da massa");
    }

    public Integer qtdPassageiros() {
        return 5;
    }

    public boolean conversivel() {
        return true;
    }

    public CombustivelEnum combustivelUsado() {
        return null;
    }
}
