package learning.thdramos.maratonajava.javacore.aula22.polimorfismo.servico;

import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.dominio.Computador;
import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.dominio.Produto;
import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto!");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            System.out.println(((Tomate) produto).getDataValidade());
        }
    }

}
