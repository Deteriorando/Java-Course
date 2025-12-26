package JavaCore.ModDeAcesso.exemplos.other.tests;

import JavaCore.ModDeAcesso.exemplos.other.Carro;
import JavaCore.ModDeAcesso.exemplos.other.Ferrari;

import java.sql.SQLOutput;

public class test1 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VelocidadeLimite);
        System.out.println(carro.comprador);
        carro.comprador.setNome("Kuririn");
        System.out.println(carro.comprador);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Ferrari 203");
        ferrari.imprimir();
    }
}
