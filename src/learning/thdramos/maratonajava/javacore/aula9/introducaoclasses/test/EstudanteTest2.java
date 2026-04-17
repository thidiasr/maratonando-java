package learning.thdramos.maratonajava.javacore.aula9.introducaoclasses.test;

import learning.thdramos.maratonajava.javacore.aula9.introducaoclasses.dominio.Estudante;

public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
