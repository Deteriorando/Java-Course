package JavaCore.Interface.Dominio;

public interface DataLoader {
    // Interface cria metodos publicos e abstratos.
    // É usa meio como um contrato.

    int MAX_DATA_SIZE = 10;

    // Não precisa fazer assim, e nem tem necessidade.
    // é só pra saber que isso existe e como é feito!
    public abstract void load();

    // Caso você não quiser usar abstract basta usar o default que você consegue abrir o bloco do código.
    default void checkPermission(){
        System.out.println("Checando permissões...");
    }

    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
