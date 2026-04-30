package learning.thdramos.maratonajava.javacore.aula22.polimorfismo.test;

import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.dominio.Computador;
import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.dominio.Tomate;
import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest1 {
    static void main(String[] args) {
        Computador computador = new Computador("Avell Storm 305", 4099);
        Tomate tomate = new Tomate("Tomate Italiano", 9.75);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
