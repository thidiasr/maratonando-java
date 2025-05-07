package com.skrdimensionlabs.maratonandojava.introduction.aula10.introducaometodos.test;

import com.skrdimensionlabs.maratonandojava.introduction.aula10.introducaometodos.dominio.Calculadora;

public class CalculadoraTest5 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(25,32,15);
    }
}
