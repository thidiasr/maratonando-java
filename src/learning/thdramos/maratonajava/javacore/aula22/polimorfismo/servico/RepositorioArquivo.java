package learning.thdramos.maratonajava.javacore.aula22.polimorfismo.servico;

import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo!");
    }
}
