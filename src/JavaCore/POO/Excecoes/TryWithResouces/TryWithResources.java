package JavaCore.POO.Excecoes.TryWithResouces;

import JavaCore.POO.Excecoes.ExececoesCostumizadas.Dominio.Leitor1;
import JavaCore.POO.Excecoes.ExececoesCostumizadas.Dominio.Leitor2;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){
        //Sintaxe do Try with Resources
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){
            // Try with Resources veio para melhorar a legibilidade do código
            //  E pode ajudar a fechar conexões, etc.
            // Ele sempre vai fazer a ordem inversa (b; a) por exemplo.
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void lerArquivo2() {
        // Código feio.
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
