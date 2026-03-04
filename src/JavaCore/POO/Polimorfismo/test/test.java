package JavaCore.POO.Polimorfismo.test;

import JavaCore.POO.Polimorfismo.Dominio.Computador;
import JavaCore.POO.Polimorfismo.Dominio.Tomate;
import JavaCore.POO.Polimorfismo.Servico.CalculadoraImposto;

public class test {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate siciliano", 30);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
