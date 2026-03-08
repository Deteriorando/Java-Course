package JavaCore.Colecoes.equals;

import JavaCore.Colecoes.equals.exemple.Celular;
import JavaCore.Colecoes.equals.exemple.Smartphone;

public class EqualsTest {
    public static void main(String[] args) {
        // O equals() é o método que define o que significa dois objetos serem iguais para a sua aplicação.
        // equals() ≠ (==).
        // O operador de igualdade(==) ele apenas compara a referencia de valores em mémoria.
        // O equals() ele compara o conteúdo dos objetos.

        /* O que acontece se não sobrescrever o equals?
        * 1 - O Java começa a comparar "Endereços", e não "Dados".
        * Acontece que a classe que não tem o equals sobrescrito na classe, ela vai usar o equals da classe object.
        * O equals da classe object compara endereços de mémoria e não o conteúdo dos dados que tem estão dentro dos atributos.
        *
        * 2 - Quebra total das coleções.
        * Praticamente todas as coleções, dependem do equals para funcionarem de forma correta
        * caso usamos o equals somente da classe object, poderemos ter erros silênciosos que podem ser
        * horríveis de saber resolver.
        *
        * 3 - Métodos de busca que não funcionam
        * Métodos de busca dependem 100% do equals para funcionarem.
        */


        // exemplo do equals da classe object:
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
