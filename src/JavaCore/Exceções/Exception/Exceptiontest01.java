package JavaCore.Exceções.Exception;

import java.io.File;
import java.io.IOException;

public class Exceptiontest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("src/Arquivos/test.txt");
        try {
            boolean isCreatedFile = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreatedFile);
        } catch (IOException e){
            // NUNCA DEIXA VAZIO O CATCH
            e.printStackTrace();
        }
    }
}
