package learning.thdramos.maratonajava.javacore.aula10.introducaometodos.test;

import learning.thdramos.maratonajava.javacore.aula10.introducaometodos.dominio.Calculadora;

public class CalculadoraTest4 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumero(num1,num2);
        System.out.println("Dentro CalculadoraTest4");
        System.out.println(num1);
        System.out.println(num2);
    }
}
