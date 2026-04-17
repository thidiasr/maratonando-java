package learning.thdramos.maratonajava.javacore.aula15.associacao.test;

import learning.thdramos.maratonajava.javacore.aula15.associacao.dominio.Escola;
import learning.thdramos.maratonajava.javacore.aula15.associacao.dominio.Professor;

public class EscolaTest1 {
    static void main(String[] args) {
        Professor professor1 = new Professor("Bruna Ricco");
        Professor professor2 = new Professor("Julio Reacher");

        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Pectrus",professores);

        escola.imprime();
    }
}
