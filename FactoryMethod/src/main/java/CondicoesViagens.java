public class CondicoesViagens {
    public static void main(String[] args) {
        try {
            FactoryVeiculo fabrica = new FactoryVeiculo();
            IVeiculo carro = fabrica.criarVeiculo(CondicaoMeterologica.CHUVA,5);
            carro.imprimirNome();

            carro = fabrica.criarVeiculo(CondicaoMeterologica.SOL, 15);

            carro.imprimirNome();

            System.out.println("FUDEU GREVE DOS CAMINHONEIROS!!!!  ");
            FactoryVeiculoCrise crise = new FactoryVeiculoCrise();

            carro = crise.criarVeiculo(null,null);
            carro.imprimirNome();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
