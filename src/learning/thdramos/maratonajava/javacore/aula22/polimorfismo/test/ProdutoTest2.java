package learning.thdramos.maratonajava.javacore.aula22.polimorfismo.test;

import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.dominio.Computador;
import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.dominio.Produto;
import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.dominio.Tomate;

public class ProdutoTest2 {
    static void main(String[] args) {
        Produto produto = new Computador("Avell ION A50", 6499);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-----------------------------");
        Produto produto2 = new Tomate("Tomate Cereja", 10.25);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("-----------------------------");
    }
}
