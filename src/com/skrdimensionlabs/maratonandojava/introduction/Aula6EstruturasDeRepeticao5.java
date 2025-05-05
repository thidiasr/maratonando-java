package com.skrdimensionlabs.maratonandojava.introduction;

public class Aula6EstruturasDeRepeticao5 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal/parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela: "+ parcela + "x R$"+ valorParcela);
        }
    }
}
