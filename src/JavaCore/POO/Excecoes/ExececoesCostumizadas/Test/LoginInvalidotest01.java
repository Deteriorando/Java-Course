package JavaCore.POO.Excecoes.ExececoesCostumizadas.Test;

import JavaCore.POO.Excecoes.ExececoesCostumizadas.LoginInvalido;

import java.util.Scanner;

public class LoginInvalidotest01 {
    public static void main(String[] args) {
        try {
            Logar();
        } catch (LoginInvalido e) {
            e.printStackTrace();
        }
    }

    private static void Logar() throws LoginInvalido{
        Scanner scan = new Scanner(System.in);

        String user = "Goku";
        String senha = "ssj";

        System.out.print("Usuário: ");
        String userDigitado = scan.nextLine();

        System.out.print("Senha: ");
        String senhaDigitado = scan.nextLine();

        if (!userDigitado.equals(user) || !senhaDigitado.equals(senha)){
            throw new LoginInvalido("Usuário e senha inválidos!");
        }

        System.out.println("Usuário logado com sucesso!");
    }
}
