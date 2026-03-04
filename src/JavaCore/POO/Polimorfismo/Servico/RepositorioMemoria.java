package JavaCore.POO.Polimorfismo.Servico;

import JavaCore.POO.Polimorfismo.Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar(){
        System.out.println("Salvando na Memória!");
    }
}
