package JavaCore.Associacao.testes;

import JavaCore.Associacao.Futebol.Jogador;
import JavaCore.Associacao.Futebol.Time;

public class teste4 {
    public static void main(String[] args) {
        // Associação Bidirecional

        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1};

        jogador1.setTime(time);
        time.setJogadores(jogadores);
        System.out.println("--- Jogadores ---");
        jogador1.imprime();
        System.out.println("--- Times ---");
        time.imprime();
    }
}
