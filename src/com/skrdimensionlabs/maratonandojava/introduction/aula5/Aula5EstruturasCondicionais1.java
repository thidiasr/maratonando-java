package com.skrdimensionlabs.maratonandojava.introduction.aula5;

public class Aula5EstruturasCondicionais1 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade <=18;
        if(isAutorizadoComprarBebida != false){
            System.out.println("Autorizado a comprar bebida!");
        }else{
            System.out.println("Não autorizado a comprar bebida!");
        }
        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida!");
        }

        System.out.println("Fora do if");
    }
}
