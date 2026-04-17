package learning.thdramos.maratonajava.javacore.aula10.introducaometodos.test;


import learning.thdramos.maratonajava.javacore.aula10.introducaometodos.dominio.Pessoa;

public class PessoaTest1 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Luiza", 3);


        pessoa.setNome("Luiza");
        pessoa.setIdade(-3);
        pessoa.imprime();
    }
}
