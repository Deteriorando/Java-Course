package JavaCore.Classes.Abstratas.dominio;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void CalcularBonus() {
        this.Salario = this.Salario + this.Salario * 0.2;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", Salario=" + Salario +
                '}';
    }
}
