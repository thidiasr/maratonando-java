package learning.thdramos.maratonajava.javacore.aula10.introducaometodos.test;

import learning.thdramos.maratonajava.javacore.aula10.introducaometodos.dominio.Calculadora;

public class CalculadoraTest2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(10, 25);
        System.out.println("Finalizando CalculadoraTest2");
    }
}
