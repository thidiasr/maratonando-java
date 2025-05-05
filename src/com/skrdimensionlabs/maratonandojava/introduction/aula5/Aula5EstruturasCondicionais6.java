package com.skrdimensionlabs.maratonandojava.introduction.aula5;

public class Aula5EstruturasCondicionais6 {
    public static void main(String[] args) {
        int dia = 4;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
