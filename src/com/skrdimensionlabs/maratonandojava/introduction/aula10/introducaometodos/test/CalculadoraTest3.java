package com.skrdimensionlabs.maratonandojava.introduction.aula10.introducaometodos.test;

import com.skrdimensionlabs.maratonandojava.introduction.aula10.introducaometodos.dominio.Calculadora;

public class CalculadoraTest3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(20,0));
        System.out.println("----------------");
        calculadora.imprimeDivisaoDoisNumeros(86,0);

    }
}
