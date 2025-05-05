package com.skrdimensionlabs.maratonandojava.introduction.aula5;

public class Aula5EstruturasCondicionais3 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 250 para a caridade";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;
        if(salario>5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        salario = 2800;

        //com operador ternário
        String resultado2 = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado2);

    }
}
