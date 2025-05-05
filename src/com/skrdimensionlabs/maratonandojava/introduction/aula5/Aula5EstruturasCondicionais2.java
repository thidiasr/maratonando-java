package com.skrdimensionlabs.maratonandojava.introduction.aula5;

public class Aula5EstruturasCondicionais2 {
    public static void main(String[] args) {
        /*
        idade < 15 categoria infantil
        idade >= 15 && idade < 18 categoria juvenil
        idae >=18 categoria adulto
        */
        int idade = 25;
        String categoria;
        if(idade <15){
            categoria = "Categoria infantil.";
        }else if(idade >=15 && idade <18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
