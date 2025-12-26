package JavaCore.ModDeAcesso.exemplos;

public class Carro {
    protected String nome;
    protected int VelocidadeMaxima;
    public static int VelocidadeLimite = 250;

    public Carro(String nome, int velocidadeMaxima){
        this.nome = nome;
        this.VelocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("----------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.VelocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.VelocidadeLimite); // <- Acessado dessa forma atráves da classe
    }

    public String getNome() {
        return nome;
    }
    public int getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        VelocidadeMaxima = velocidadeMaxima;
    }
}
