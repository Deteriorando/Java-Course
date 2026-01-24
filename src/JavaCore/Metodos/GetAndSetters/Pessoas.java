package JavaCore.Metodos.GetAndSetters;

public class Pessoas {
    private String nome;
    private int Idade;
    private char sexo;

    // get -> ele retorna(pega) parâmetros que são privados(private) ou protegidos(protected)
    // setter -> ele seta(injeta, coloca) valores nos parâmetros, seja privado ou protegido;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
