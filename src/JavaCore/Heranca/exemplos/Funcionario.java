package JavaCore.Heranca.exemplos;

public class Funcionario extends Pessoa {
    private double Salario;
    static {
        System.out.println("Bloco estático Funcionario inicializado!");
    }

    {
        System.out.println("Bloco de inicialização 1 Funcionario foi inicializado!");
    }

    {
        System.out.println("Bloco de inicialização 2 Funcionario foi inicializado!");
    }

    public Funcionario(String nome){
        super(nome);
    }

    //Super
    @Override
    public void imprime(){
        super.imprime();
        System.out.println(this.Salario);
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }
}
