package com.skrdimensionlabs.maratonandojava.introduction;

public class Aula4Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;

        System.out.println(numero02+numero01);
        System.out.println(numero02-numero01);
        System.out.println(numero02*numero01);
        System.out.println(resultado);

        //%
        int resto = 21%7;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualVinte = 10==20;
        boolean isDezIgualDez = 10==10;
        boolean isDezDiferenteDez = 10!=10;
        boolean isDezDiferenteVinte = 10!=20;
        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        System.out.println("isDezIgualDez: "+isDezIgualDez);
        System.out.println("isDezDiferenteDez: "+isDezDiferenteDez);
        System.out.println("isDezDiferenteVinte: "+isDezDiferenteVinte);


        // o + após uma string funciona como concatenação e não como operador
        System.out.println("Valor: "+numero02+numero01);

        // && (AND)  ||  (or)

        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinte = idade <30 && salario > 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta: "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinte: "+isDentroDaLeiMenorQueTrinte);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel: "+isPlaystationCincoCompravel);

        // = += -= *= /= %=

        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000;//1800
        bonus *= 2; //3600
        bonus /= 2; //1800
        bonus %= 2; //0
        System.out.println(bonus);

        // == e --

        int contador = 0;
        contador += 1; //contador = contador +1;
        contador++;
        contador--;
        System.out.println(contador++);
        System.out.println(contador);


    }
}
