package JavaCore.Metodos;

public class Metodos {
    private int a;

    //Métodos que não retorna nenhum valor específico
    public void imprimir(){
        System.out.println("Ola!");
    }

    public void valores(int a){
        a = 10;
        System.out.println(a);
    }

    // Metodos que retorna valores

    public int valores1(int a){
        a = 1;
        return a;
    }

    public String palavra(String palavra){
        return palavra;
    }
}
