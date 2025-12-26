package JavaCore.ModDeAcesso.exemplos.other;

public class Carro {
    protected String nome;
    protected int VelocidadeMaxima;
    public static final int VelocidadeLimite = 250;
    public final Comprador comprador = new Comprador();

    public void imprimir(){
        System.out.println("----------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.VelocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.VelocidadeLimite);
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
