package JavaCore.Polimorfismo.Servico;

import JavaCore.Polimorfismo.Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar(){
        System.out.println("Salvando na Memória!");
    }
}
