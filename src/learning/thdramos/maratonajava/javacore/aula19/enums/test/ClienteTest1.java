package learning.thdramos.maratonajava.javacore.aula19.enums.test;

import learning.thdramos.maratonajava.javacore.aula19.enums.dominio.Cliente;
import learning.thdramos.maratonajava.javacore.aula19.enums.dominio.TipoPagamento;
import learning.thdramos.maratonajava.javacore.aula19.enums.dominio.TipoCliente;

public class ClienteTest1 {
    static void main(String[] args) {
        Cliente cliente1 = new Cliente("Carlos", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Mecanica 5stars", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Mercado Dia", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente4 = new Cliente("Bruna", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println();
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getFormName());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
