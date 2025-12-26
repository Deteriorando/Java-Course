package JavaCore.Enumeradores.test;

import JavaCore.Enumeradores.Cliente;
import JavaCore.Enumeradores.TipoCliente;
import JavaCore.Enumeradores.TipoPagamento;

public class test {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Dengi", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Goku", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
