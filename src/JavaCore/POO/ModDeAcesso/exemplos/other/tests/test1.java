package JavaCore.POO.ModDeAcesso.exemplos.other.tests;

import JavaCore.POO.ModDeAcesso.exemplos.other.Carro;
import JavaCore.POO.ModDeAcesso.exemplos.other.Ferrari;

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
