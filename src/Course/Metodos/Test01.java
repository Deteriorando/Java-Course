package Course.Metodos;

import Course.Metodos.Objects.Calculadora;
import Course.Metodos.Objects.VarArgs1;

public class Test01 {
    public static void main(String[] args) { // <- aqui é um varArg, ou seja, um array de String.
        Calculadora calculadora = new Calculadora();
        int[] num = {1,2,4,5,6};

        calculadora.somaArray(num);
        new VarArgs1().somarArray(1,2,3,4,5,5,67); // <- Quando é varArgs facilita a inserção de valores em um array.
    }
}
