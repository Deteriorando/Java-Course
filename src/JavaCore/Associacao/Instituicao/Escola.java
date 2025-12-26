package JavaCore.Associacao.Instituicao;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome){
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores){
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println(this.nome);

        if (professores == null) return;

        for (Professor p : professores){
            System.out.println(p.getNome());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
