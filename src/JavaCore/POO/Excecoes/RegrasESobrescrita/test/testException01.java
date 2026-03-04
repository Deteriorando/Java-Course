package JavaCore.POO.Excecoes.RegrasESobrescrita.test;

import JavaCore.POO.Excecoes.ExececoesCostumizadas.LoginInvalido;
import JavaCore.POO.Excecoes.RegrasESobrescrita.Dominio.Funcionario;
import JavaCore.POO.Excecoes.RegrasESobrescrita.Dominio.Pessoa;

public class testException01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalido e) {
            throw new RuntimeException(e);
        }
    }
}
