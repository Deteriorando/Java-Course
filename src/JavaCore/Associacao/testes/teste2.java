package JavaCore.Associacao.testes;

import JavaCore.Associacao.Futebol.Jogador;
import JavaCore.Associacao.Futebol.Time;

public class teste2 {
    public static void main(String[] args) {
        // Associação unidirecional para muitos.

        Time time = new Time("Seleção Brasileira");
        Jogador jogador1 = new Jogador("Neymar");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
