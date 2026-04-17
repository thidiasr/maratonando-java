package learning.thdramos.maratonajava.introducao.aula9.introducaoclasse.test;

import learning.thdramos.maratonajava.introducao.aula9.introducaoclasse.dominio.Estudante;
import learning.thdramos.maratonajava.introducao.aula9.introducaoclasse.dominio.ImpressoraEstudante;

public class EstudanteTest1 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Jorge";
        estudante1.idade = 23;
        estudante1.sexo = 'M';

        estudante2.nome = "Roberto";
        estudante2.idade = 19;
        estudante2.sexo = 'M';

        estudante1.imprime();
        estudante2.imprime();

    }
}
