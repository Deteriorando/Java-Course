package JavaCore.Colecoes.hashcode;

import JavaCore.Colecoes.equals.exemple.Celular;
import JavaCore.Colecoes.equals.exemple.Smartphone;

public class EqualsTest {
    public static void main(String[] args) {
        /* O que é hashcode?
         * Hash Code é uma implementação de um método que vai dar códigos determinados a um determinado objeto.
         * Se o equals ele verifica o conteúdo, o Hash code ele dá um código ou etiqueta, como quiser interpretar.
         * Há varias formas de implementar um código hash em si, vária de cada necessidade de uso.
         */

        Smartphone s1 = new Smartphone("4ABS", "Motorola");
        Smartphone s2 = new Smartphone("4ABS", "Motorola");

        System.out.println("Equals da classe object: " + s1.equals(s2));

        //exemplo com equals com método próprio:
        Celular c1 = new Celular("98JKDS", "Samsung");
        Celular c2 = new Celular("98JKDS", "Samsung");
        System.out.println("Equals da própria classe: " + c1.equals(c2));

        // -- Fontes --
        // DevDojo: https://youtu.be/YWtGWgTlPwQ?si=wK8H-HtOX5Fyi22e
    }
}
