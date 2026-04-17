package learning.thdramos.maratonajava.javacore.aula10.introducaometodos.test;

import learning.thdramos.maratonajava.javacore.aula10.introducaometodos.dominio.Calculadora;

public class CalculadoraTest1 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando CalculadoraTest1");

    }
}
