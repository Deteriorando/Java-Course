package JavaCore.POO.Heranca.testes;

import JavaCore.POO.Heranca.exemplos.Endereco;
import JavaCore.POO.Heranca.exemplos.Funcionario;
import JavaCore.POO.Heranca.exemplos.Pessoa;

public class Teste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("rua Monge flores");
        endereco.setCep("12342-089");

        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("708.302.780-60");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("123.098.578-55");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500);

        funcionario.imprime();
    }
}
