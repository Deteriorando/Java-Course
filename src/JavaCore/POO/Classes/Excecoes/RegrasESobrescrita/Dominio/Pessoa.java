package JavaCore.POO.Classes.Excecoes.RegrasESobrescrita.Dominio;

import JavaCore.POO.Classes.Excecoes.ExececoesCostumizadas.LoginInvalido;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalido, FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}
