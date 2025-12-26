package JavaCore.Heranca.exemplos;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;
    static {
        System.out.println("Bloco estático Pessoa inicializado!");
    }

    {
        System.out.println("Bloco de inicialização 1 pessoa foi inicializado!");
    }

    {
        System.out.println("Bloco de inicialização 2 pessoa foi inicializado!");
    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, String Cpf){
        this(nome);
        this.cpf = Cpf;
    }

    public void imprime(){
        System.out.println("--------------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Endereco: " + this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
