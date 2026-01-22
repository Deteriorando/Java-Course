package JavaCore.Exceções.Exception;

public class Exceptiontest02 {
    public static void main(String[] args) {
        divisao(1, 0);
    }

    private static int divisao(int a, int b){
        // Exceções do tipo unchecked não precisam necessariamente ser tratadas.
        if (b == 0){
            throw new IllegalArgumentException("Não existe divisor por 0");
        }
        return a/b;
    }
}
