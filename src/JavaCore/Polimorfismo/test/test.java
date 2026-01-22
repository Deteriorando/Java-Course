package JavaCore.Polimorfismo.test;

import JavaCore.Polimorfismo.Dominio.Computador;
import JavaCore.Polimorfismo.Dominio.Tomate;
import JavaCore.Polimorfismo.Servico.CalculadoraImposto;

public class test {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate siciliano", 30);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
