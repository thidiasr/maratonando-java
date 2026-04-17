package learning.thdramos.maratonajava.introducao.aula9.introducaoclasse.test;

import learning.thdramos.maratonajava.introducao.aula9.introducaoclasse.dominio.Professor;

public class ProfessorTest1 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Roberto";
        professor.idade = 45;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);

    }
}
