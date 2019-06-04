package br.com.morteLenta.model;

import br.com.morteLenta.model.abstratos.Prato;
import br.com.morteLenta.model.adicionais.Cebola;
import br.com.morteLenta.model.adicionais.DobroCarne;
import br.com.morteLenta.model.adicionais.Ovo;
import br.com.morteLenta.model.pratos.PratoA;
import br.com.morteLenta.model.pratos.PratoB;

public class Main {
    public static void main(String[] args) {
        Prato pratoA = new PratoA();
        System.out.format("%s --- R$ %.2f %n", pratoA.getDescricao(), pratoA.getPreco());

        Prato ovo = new Ovo(pratoA);
        System.out.format("Adicional de %s --- R$ %.2f %n", ovo.getDescricao(), ovo.getPreco());
        ovo = new Ovo(ovo);
        System.out.format("Adicional de %s --- R$ %.2f %n" , ovo.getDescricao() , ovo.getPreco());

        Prato pratoB = new PratoB();
        System.out.format("%s --- R$ %.2f %n",pratoB.getDescricao() , pratoB.getPreco());

        Prato cebola = new Cebola(pratoB);
        System.out.format("Adicional de %s --- R$ %.2f %n", cebola.getDescricao() ,cebola.getPreco());

        Prato dobroCarne = new DobroCarne(pratoB);
        System.out.format("Adicional de %s --- R$ %.2f %n%n%n%n%n", dobroCarne.getDescricao() ,dobroCarne.getPreco());
    }
}
