package JavaCore.Metodos.Objects;

public class Calculadora {
    protected int result;

    public int somar(int num1, int num2){
        result = num1 + num2;
        return result;
    }

    public int subtrair(int num1, int num2){
        result = num1 - num2;
        return result;
    }

    public int dividir(int num1, int num2){
        result = num1 / num2;
        return result;
    }

    public int multiplicar(int num1, int num2){
        result = num1 * num2;
        return result;
    }

    public void imprimir(){
        System.out.println(this.result);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}
