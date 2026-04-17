package learning.thdramos.maratonajava.javacore.aula9.introducaoclasses.exercicio.test;

import learning.thdramos.maratonajava.javacore.aula9.introducaoclasses.exercicio.dominio.Carro;

import java.util.Scanner;

public class CarroTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro1 = new Carro();
        Carro carro2;
        carro2 = new Carro();

        System.out.print("Qual o nome do primeiro veículo: ");
        carro1.name = sc.nextLine();
        System.out.print("Qual o modelo do primeiro veículo: ");
        carro1.model = sc.nextLine();
        System.out.print("Qual o ano do primeiro veículo: ");
        carro1.year = sc.nextInt();

        sc.nextLine();
        System.out.print("Qual o nome do segundo veículo: ");
        carro2.name = sc.nextLine();
        System.out.print("Qual o modelo do segundo veículo: ");
        carro2.model = sc.nextLine();
        System.out.print("Qual o ano do segundo veículo: ");
        carro2.year = sc.nextInt();
        System.out.println();

        System.out.println("Primeiro veículo:");
        carro1.imprime();
        System.out.println("Segundo veículo:");
        carro2.imprime();

        sc.close();
    }
}
