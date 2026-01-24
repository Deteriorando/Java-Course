package JavaCore.Interface.Dominio;

// quando trabalhamos com ‘interface’ para extender até a ‘interface’ usamos "implements"
// Nas ‘interfaces’ podemos também implementar mais de uma ‘interface’
public class DataBaseLoader implements DataLoader, DataRemover {

    // É obrigatório a implementação dos métodos da ‘interface’!
    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de dados...");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados do Banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados...");
    }

    // Métodos estáticos sempre vão pertencer à classe, e não precisam ser sobrescritos.
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DataBaseLoader");
    }
}
