package JavaCore.Enumeradores;

public enum TipoCliente {
    // Todos os atributos que tem em enums são constantes!
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int VALOR;
    private final String NomeRelatorio;

    TipoCliente(int valor, String NomeRelatorio){
        this.VALOR = valor;
        this.NomeRelatorio = NomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return NomeRelatorio;
    }
}
