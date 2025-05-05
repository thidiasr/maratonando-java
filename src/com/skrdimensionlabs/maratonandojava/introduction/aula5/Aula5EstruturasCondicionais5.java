package com.skrdimensionlabs.maratonandojava.introduction.aula5;

public class Aula5EstruturasCondicionais5 {
    public static void main(String[] args) {
        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("dom");
                break;
            case 2:
                System.out.println("seg");
                break;
            case 3:
                System.out.println("ter");
                break;
            case 4:
                System.out.println("qua");
                break;
            case 5:
                System.out.println("qui");
                break;
            case 6:
                System.out.println("sex");
                break;
            case 7:
                System.out.println("sab");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
            default:
                System.out.println("Opção inválida");
        }
    }
}
