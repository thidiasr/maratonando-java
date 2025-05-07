package com.skrdimensionlabs.maratonandojava.introduction.aula9.introducaoclasse.test;

import com.skrdimensionlabs.maratonandojava.introduction.aula9.introducaoclasse.dominio.Professor;

public class ProfessorTest1 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Roberto";
        professor.idade = 45;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);

    }
}
