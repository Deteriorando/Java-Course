package JavaCore.POO.Polimorfismo.Servico;

import JavaCore.POO.Polimorfismo.Repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar(){
        System.out.println("Salvando em arquivo!");
    }
}
