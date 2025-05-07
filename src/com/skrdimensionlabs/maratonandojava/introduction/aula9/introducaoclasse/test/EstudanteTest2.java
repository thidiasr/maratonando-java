package com.skrdimensionlabs.maratonandojava.introduction.aula9.introducaoclasse.test;

import com.skrdimensionlabs.maratonandojava.introduction.aula9.introducaoclasse.dominio.Estudante;

public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
