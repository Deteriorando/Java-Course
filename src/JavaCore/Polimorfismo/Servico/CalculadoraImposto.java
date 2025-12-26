package JavaCore.Polimorfismo.Servico;

import JavaCore.Polimorfismo.Dominio.Computador;
import JavaCore.Polimorfismo.Dominio.Tomate;

public class CalculadoraImposto {
    public static void CalcularImpostoComputador(Computador computador){
        System.out.println("Calculando o imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

    public static void CalcularImpostoTomate(Tomate tomate){
        System.out.println("Calculando o imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
