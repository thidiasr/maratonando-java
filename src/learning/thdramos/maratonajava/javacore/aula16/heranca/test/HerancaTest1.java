package learning.thdramos.maratonajava.javacore.aula16.heranca.test;

import learning.thdramos.maratonajava.javacore.aula16.heranca.dominio.Endereco;
import learning.thdramos.maratonajava.javacore.aula16.heranca.dominio.Funcionario;
import learning.thdramos.maratonajava.javacore.aula16.heranca.dominio.Pessoa;

public class HerancaTest1 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 21");
        endereco.setCep("13186-200");
        Pessoa pessoa = new Pessoa("Ricardo");
        pessoa.setCpf("414.757.222-98");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-----------");
        Funcionario funcionario = new Funcionario("Fabricio","223.323.333-98");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5000);
        funcionario.imprime();

    }
}
