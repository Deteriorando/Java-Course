package JavaCore.Colecoes.hashcode;

import JavaCore.Colecoes.equals.exemple.Celular;
import JavaCore.Colecoes.equals.exemple.Smartphone;

public class EqualsTest {
    public static void main(String[] args) {
        // O que é hashcode?

        Smartphone s1 = new Smartphone("4ABS", "Motorola");
        Smartphone s2 = new Smartphone("4ABS", "Motorola");

        System.out.println("Equals da classe object: " + s1.equals(s2));

        //exemplo com equals com método próprio:
        Celular c1 = new Celular("98JKDS", "Samsung");
        Celular c2 = new Celular("98JKDS", "Samsung");
        System.out.println("Equals da própria classe: " + c1.equals(c2));

        // -- Fontes --
        // DevDojo: https://youtu.be/YWtGWgTlPwQ?si=wK8H-HtOX5Fyi22e
        // DEVMEDIA: https://www.devmedia.com.br/sobrescrevendo-o-metodo-equals-em-java/26484?utm_dev=google_ads_pmax&gad_source=1&gad_campaignid=22326280955&gclid=Cj0KCQiA2bTNBhDjARIsAK89wlFp7mwItZ-5lZ487fTPGKeKdLKdmzb3KJ70OCwS578M3upqblYnv1AaAoquEALw_wcB
    }
}
