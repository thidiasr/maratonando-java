package com.skrdimensionlabs.maratonandojava.introduction.aula9.introducaoclasse.dominio;

public class ImpressoraEstudante {
    public void imprime (Estudante estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("-------------");
    }
}
