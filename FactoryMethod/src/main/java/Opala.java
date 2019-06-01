public class Opala implements IVeiculo {
    public void imprimirNome() {
        System.out.println("Opalão V8");
    }

    public Integer qtdPassageiros() {
        return 5;
    }

    public boolean conversivel() {
        return false;
    }

    public CombustivelEnum combustivelUsado() {
        return CombustivelEnum.DIESEL;
    }
}
