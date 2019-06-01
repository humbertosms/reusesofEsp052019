import br.com.goiania.medidores.Estacao;
import br.com.goiania.observer.Internet;
import br.com.goianiaRaiz.observable.EstacaoMeteorologica;
import br.com.goianiaRaiz.observer.Interessado;

public class Main {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>       Nutella    >>>>>>>>>>>>>");
        Estacao a = new Estacao(15,15,15);
        System.out.println(a.toString());
        Internet inte = new Internet(a);
        a.setPressao(13);
        a.setTemperatura(-1);
        a.setUmidade(100);

        System.out.println(">>>>>>>>>>>>>       RAIZ    >>>>>>>>>>>>>");
        EstacaoMeteorologica meteorologica = new EstacaoMeteorologica(24,55,100);
        Interessado jornalDaquiObserver = new Interessado(meteorologica,"Jornal Daqui Observer");

        meteorologica.setTemperatura(10);

        Interessado climaTempo = new Interessado(meteorologica,"Clima Tempo");

        meteorologica.setUmidade(50);
        meteorologica.setPressao(10);

        meteorologica.unSubscribe(climaTempo);

        meteorologica.setPressao(100);
        meteorologica.setUmidade(1);

    }
}
