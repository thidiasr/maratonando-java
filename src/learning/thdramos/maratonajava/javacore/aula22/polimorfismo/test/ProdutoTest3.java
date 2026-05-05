package learning.thdramos.maratonajava.javacore.aula22.polimorfismo.test;

import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.dominio.Computador;
import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.dominio.Produto;
import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.dominio.Tomate;
import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest3 {
    static void main(String[] args) {
        Produto produto = new Computador("Avell ION A50", 6499);
        Tomate tomate = new Tomate("Tomate Cereja", 10.25);
        tomate.setDataValidade("10/05/2026");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
