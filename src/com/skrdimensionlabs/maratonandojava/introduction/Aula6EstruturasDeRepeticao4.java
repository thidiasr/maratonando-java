package com.skrdimensionlabs.maratonandojava.introduction;

public class Aula6EstruturasDeRepeticao4 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal/parcela;
            if(valorParcela > 1000){
                break;
            }
            System.out.println("Parcela: "+ parcela + "x R$"+ valorParcela);
        }


    }
}
