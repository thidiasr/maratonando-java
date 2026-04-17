package learning.thdramos.maratonajava.javacore.aula10.introducaometodos.test;

import learning.thdramos.maratonajava.javacore.aula10.introducaometodos.dominio.Estudante;
import learning.thdramos.maratonajava.javacore.aula10.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest1 {
    public static void main (String[] args){
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Bruna";
        estudante1.idade = 24;
        estudante1.sexo = 'F';

        estudante2.nome = "Thiago";
        estudante2.idade = 25;
        estudante2.sexo = 'M';

        impressora.imprime(estudante1);
        System.out.println();
        impressora.imprime(estudante2);

        System.out.println();
        impressora.imprime(estudante1);
        System.out.println();
        impressora.imprime(estudante2);

    }
}
