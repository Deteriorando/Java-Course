package JavaCore.Metodos.ModStatico;

public class Carro {
    protected String nome;
    protected int VelocidadeMaxima;
    private static double VelocidadeLimite = 250;

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

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.VelocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.VelocidadeLimite;
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
