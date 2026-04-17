package learning.thdramos.maratonajava.javacore.aula15.associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.printf("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.printf("Digite M ou F para seu sexo: ");
        char sexo = sc.next().charAt(0);
        System.out.println("\n-----------------");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
        sc.close();
    }
}
