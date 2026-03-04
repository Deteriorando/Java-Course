package JavaCore.POO.Excecoes.RegrasESobrescrita.Dominio;

import JavaCore.POO.Excecoes.ExececoesCostumizadas.LoginInvalido;

public class Funcionario extends Pessoa{
    // - Regra de sobrescrita em exceções -
    // 1. Você não é obrigado a declarar as mesmas exceções que a classe pai tem.
    /* 2. Você pode declarar apenas uma, todas exceções, ou exceções especificas, desde que não tenha exceções mais genéricas que a classe pai tem. */

    @Override
    public void salvar() throws LoginInvalido, ArithmeticException{
        System.out.println("Salvando funcionario");
    }

}
