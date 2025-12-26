package JavaCore.Associacao.Futebol;

public class Time {
    private String nome;
    private Jogador[] Jogadores;

    public Time(String nome){
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores){
        this.nome = nome;
        this.Jogadores = jogadores;
    }

    public void imprime(){
        System.out.println(this.nome);

        if (Jogadores == null) return;
        for (Jogador j : Jogadores){
            System.out.println(j.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return Jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        Jogadores = jogadores;
    }
}
