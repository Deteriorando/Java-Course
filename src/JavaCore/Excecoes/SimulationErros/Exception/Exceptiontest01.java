package JavaCore.Excecoes.SimulationErros.Exception;

import java.io.File;
import java.io.IOException;

public class Exceptiontest01 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    //Erros do tipo checked que precisam fazer um tratamento.
    public static void criarNovoArquivo() throws IOException{
        File file = new File("src/Arquivos/test.txt");
        try {
            boolean isCreatedFile = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreatedFile);
        } catch (IOException e){
            // NUNCA DEIXA VAZIO O CATCH
            e.printStackTrace();
            throw e; // <- podemos relançar o a exceção pra cima
        }
    }

    public static void criarNovoArquivo2(){
        File file = new File("src/Arquivos/test.txt");
        try {
            boolean isCreatedFile = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreatedFile);
        } catch (IOException e){
            // NUNCA DEIXA VAZIO O CATCH
            e.printStackTrace();
            throw new RuntimeException("Erro na hora de criar arquivo");
        }
    }
}
