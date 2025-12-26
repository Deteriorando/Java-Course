package JavaCore.ModDeAcesso;

public class Protegida {
    // O modificador protegido ele é só pode ser usado entre classes que estiver no mesmo pacote.

    protected int numero;

    protected void registro(){

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
