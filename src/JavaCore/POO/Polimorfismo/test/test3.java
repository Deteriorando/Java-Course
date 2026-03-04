package JavaCore.POO.Polimorfismo.test;

import JavaCore.POO.Polimorfismo.Dominio.Computador;
import JavaCore.POO.Polimorfismo.Dominio.Produto;
import JavaCore.POO.Polimorfismo.Dominio.Tomate;
import JavaCore.POO.Polimorfismo.Servico.CalculadoraImposto;

public class test3 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 3", 500);
        Tomate tomate = new Tomate("Americano", 10);

        tomate.setDataDeValidade("15/05/2026");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
