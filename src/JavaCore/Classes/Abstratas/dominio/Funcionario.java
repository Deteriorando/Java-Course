package JavaCore.Classes.Abstratas.dominio;

public abstract class Funcionario extends Pessoa {
    // Classes abstratas não podem ser inicializadas, apenas extendidas.

    protected String nome;
    protected double Salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        Salario = salario;
    }

    public abstract void CalcularBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo");
        // Você só precisa sobrescrever uma vez quando o uma classe abstrata extender outra classe abstrata, dentro da classe abstrata
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", Salario=" + Salario +
                '}';
    }
}
