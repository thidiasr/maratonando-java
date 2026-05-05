package learning.thdramos.maratonajava.javacore.aula22.polimorfismo.servico;

import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória!");
    }
}
