package JavaCore.Classes.Abstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void CalcularBonus() {
        this.Salario = this.Salario + this.Salario * 0.1;
    }
}
