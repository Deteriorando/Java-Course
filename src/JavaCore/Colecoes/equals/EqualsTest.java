package JavaCore.Colecoes.equals;

import JavaCore.Colecoes.equals.exemple.Smartphone;

public class EqualsTest {
    public static void main(String[] args) {
        // O equals() é o método que define o que significa dois objetos serem iguais para a sua aplicação.
        // equals() ≠ (==).
        // O operador de igualdade(==) ele apenas compara a referencia de valores em mémoria.
        // O equals() ele compara o conteúdo dos objetos.

        /* O que acontece se não sobrescrever o equals?
        * Toda comparação com equals() irá verificar, primeiro, se existe uma sobrescrição do mesmo em ambas as classes. Caso não haja em alguma delas,
        * o método padrão da classe Object será utilizado. E, no nosso caso, pode ser que os laptops sejam considerados iguais.
        * Uma outra limitação que ocorrerá caso o método não seja sobrescrito, é que não será possível utilizar o objeto como chave em uma tabela hashing.
        * Ora, se o método não foi sobrescrito, não será possível encontrar um objeto X na minha tabela! A não ser que eu esteja utilizando o próprio X que
        * foi inserido nela, já que o método equals da classe Object utiliza o comparador “ == “ para verificar se duas referências são iguais. Ou seja, caso
        * tenhamos duas referências diferentes de um mesmo objeto, eles serão considerados diferentes.
        */

        Smartphone s1 = new Smartphone("4ABS", "Motorola");
        Smartphone s2 = new Smartphone("4ABS", "Motorola");

        System.out.println(s1.equals(s2));


        // -- Fontes --
        // DevDojo: https://youtu.be/YWtGWgTlPwQ?si=wK8H-HtOX5Fyi22e
        // DEVMEDIA: https://www.devmedia.com.br/sobrescrevendo-o-metodo-equals-em-java/26484?utm_dev=google_ads_pmax&gad_source=1&gad_campaignid=22326280955&gclid=Cj0KCQiA2bTNBhDjARIsAK89wlFp7mwItZ-5lZ487fTPGKeKdLKdmzb3KJ70OCwS578M3upqblYnv1AaAoquEALw_wcB
    }
}
