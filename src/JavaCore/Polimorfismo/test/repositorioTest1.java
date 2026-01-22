package JavaCore.Polimorfismo.test;

import JavaCore.Polimorfismo.Repositorio.Repositorio;
import JavaCore.Polimorfismo.Servico.RepositorioBancodeDados;

public class repositorioTest1 {
    public static void main(String[] args) {
        // Usando o tipo genérico para referenciar um tipo especifico de objeto!
        // Desde que seja uma implementação ou um herança.
        Repositorio repositorio = new RepositorioBancodeDados();
        repositorio.salvar();
    }
}
