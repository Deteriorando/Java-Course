package JavaCore.ModDeAcesso;

import JavaCore.ModDeAcesso.exemplos.Carro;

public class Estatico {
    // O modificador estático ele faz com que o atributo pertence à classe toda, compartilhando do mesmo valor a todos os objetos existentes.

    protected static double valor = 250;

    public static void main(String[] args) {
        System.out.println(Carro.VelocidadeLimite);
    }
}
