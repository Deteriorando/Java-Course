package JavaCore.Polimorfismo.Servico;

import JavaCore.Polimorfismo.Dominio.Computador;
import JavaCore.Polimorfismo.Dominio.Produto;
import JavaCore.Polimorfismo.Dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("-------------------------------------");
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de Validade: " + tomate.getDataDeValidade());

            /* Outras formas de fazer casting do produto
             *
             * 1 - String dataValidade = ((Tomate) produto).getDataDeValidade();
             * 2 - System.out.println("Data de Validade: " + ((Tomate) produto).getDataDeValidade());
             * */
        }
    }
}
