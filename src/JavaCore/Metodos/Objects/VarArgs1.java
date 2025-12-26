package JavaCore.Metodos.Objects;

public class VarArgs1 {
    // VarArgs
    public void somarArray(int... numero){
        int soma = 0;
        for (int num : numero){
            soma += num;
        }

        System.out.println(soma);
    }
}
