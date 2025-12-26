package JavaCore.Associacao.testes;

import JavaCore.Associacao.Instituicao.Escola;
import JavaCore.Associacao.Instituicao.Professor;

public class teste3 {
    public static void main(String[] args) {
        // Associação Unidirecional para uma associação

        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Komochi");
        Professor[] professores = {professor1, professor2};

        Escola escola = new Escola("High School", professores);

        escola.imprime();
    }
}
