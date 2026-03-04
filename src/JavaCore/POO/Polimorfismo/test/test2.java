package JavaCore.POO.Polimorfismo.test;

import JavaCore.POO.Polimorfismo.Dominio.Computador;
import JavaCore.POO.Polimorfismo.Dominio.Produto;
import JavaCore.POO.Polimorfismo.Dominio.Tomate;

public class test2 {
    public static void main(String[] args) {
        /* Podemos usar uma váriavel que herde de uma super classe,
         e referenciar a uma subclasse desde que seja uma classe genérica */
        Produto produto = new Computador("Ryzen 9", 500);
        Produto tomate = new Tomate("Americano", 10);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
    }
}
