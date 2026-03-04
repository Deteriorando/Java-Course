package JavaCore.POO.Polimorfismo.Servico;

import JavaCore.POO.Polimorfismo.Repositorio.Repositorio;

public class RepositorioBancodeDados implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando no banco de dados!");
    }
}
