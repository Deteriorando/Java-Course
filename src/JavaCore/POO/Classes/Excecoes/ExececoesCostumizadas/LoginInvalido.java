package JavaCore.POO.Classes.Excecoes.ExececoesCostumizadas;

public class LoginInvalido extends Exception {
    public LoginInvalido(String message) {
        super(message);
    }

    public LoginInvalido() {
        super("Login invalido!");
    }
}
