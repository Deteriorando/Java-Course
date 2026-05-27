package JavaCore.POO.Classes.Excecoes.RegrasESobrescrita.test;

import JavaCore.POO.Classes.Excecoes.ExececoesCostumizadas.LoginInvalido;
import JavaCore.POO.Classes.Excecoes.RegrasESobrescrita.Dominio.Funcionario;
import JavaCore.POO.Classes.Excecoes.RegrasESobrescrita.Dominio.Pessoa;

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
