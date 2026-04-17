package learning.thdramos.maratonajava.javacore.aula10.introducaometodos.test;

import learning.thdramos.maratonajava.javacore.aula10.introducaometodos.dominio.Estudante;

public class EstudanteTest2 {
        public static void main (String[] args){
            Estudante estudante1 = new Estudante();
            Estudante estudante2 = new Estudante();

            estudante1.nome = "Bruna";
            estudante1.idade = 24;
            estudante1.sexo = 'F';

            estudante2.nome = "Thiago";
            estudante2.idade = 25;
            estudante2.sexo = 'M';

            estudante1.imprime();
            estudante2.imprime();

        }
}
