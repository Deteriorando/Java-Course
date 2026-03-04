package JavaCore.POO.Classes.Abstratas.testes;

import JavaCore.POO.Classes.Abstratas.dominio.Desenvolvedor;
import JavaCore.POO.Classes.Abstratas.dominio.Gerente;

public class test {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Shimoko", 6000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
