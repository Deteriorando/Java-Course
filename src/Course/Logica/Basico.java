package Course.Logica;

public class Basico {
    public static void main(String[] args) {
        int a = 50;
        float b = 1.5f;
        double c = 1.55;
        char d = 'm'; // so pode colocar characteres
        String f = "Hello world";

        if (a == 50){
            a = 10;
            System.out.println(a);
        } else {
            System.out.println("Não existe nenhum número");
        }

        while (a <= 50){
            System.out.println(a);
            a++;
        }
    }
}
