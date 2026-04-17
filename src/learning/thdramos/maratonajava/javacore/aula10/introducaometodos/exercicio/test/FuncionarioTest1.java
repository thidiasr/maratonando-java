package learning.thdramos.maratonajava.javacore.aula10.introducaometodos.exercicio.test;

import learning.thdramos.maratonajava.javacore.aula10.introducaometodos.exercicio.dominio.Funcionario;

public class FuncionarioTest1 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Julia");
        funcionario.setIdade(24);
        funcionario.setSalarios(new double[]{1400, 1600, 1480});
        funcionario.imprime();
        System.out.println("Media: " +funcionario.getMedia());

    }
}
