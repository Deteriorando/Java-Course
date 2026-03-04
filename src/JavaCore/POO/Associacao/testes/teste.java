package JavaCore.POO.Associacao.testes;

import JavaCore.POO.Associacao.Futebol.Jogador;

public class teste {
    public static void main(String[] args) {
        // Array com objetos.

        Jogador jogador1 = new Jogador("Péle");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Neymar");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador J : jogadores){
            J.imprime();
        }

    }
}
