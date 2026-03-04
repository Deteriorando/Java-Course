package JavaCore.POO.Associacao.testes;

import JavaCore.POO.Associacao.Futebol.Jogador;
import JavaCore.POO.Associacao.Futebol.Time;

public class teste2 {
    public static void main(String[] args) {
        // Associação unidirecional para muitos.

        Time time = new Time("Seleção Brasileira");
        Jogador jogador1 = new Jogador("Neymar");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
