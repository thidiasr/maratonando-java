package learning.thdramos.maratonajava.javacore.aula20.classesabstratas.test;

import learning.thdramos.maratonajava.javacore.aula20.classesabstratas.dominio.Desenvolvedor;
import learning.thdramos.maratonajava.javacore.aula20.classesabstratas.dominio.Funcionario;
import learning.thdramos.maratonajava.javacore.aula20.classesabstratas.dominio.Gerente;
import learning.thdramos.maratonajava.javacore.aula20.classesabstratas.dominio.Professor;

public class FuncionarioTest1 {
    static void main(String[] args) {
        Professor professor = new Professor("Bruna", 15000);
        Gerente gerente = new Gerente("Ricardo", 10000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Thiago", 16600);
        System.out.println(professor);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
