package com.skrdimensionlabs.maratonandojava.introduction.aula7;

public class Aula7Arrays1 {
    public static void main(String[] args) {
        int[] idades = new int[4];
        idades[0] = 21;
        idades[1] = 35;
        idades[2] = 28;
        idades[3] = 28;

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
        System.out.println();

        for (int idade : idades){
            System.out.println(idade);
        }
    }
}
