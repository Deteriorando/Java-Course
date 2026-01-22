package JavaCore.Polimorfismo.Servico;

import JavaCore.Polimorfismo.Repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar(){
        System.out.println("Salvando em arquivo!");
    }
}
