package learning.thdramos.maratonajava.javacore.aula22.polimorfismo.test;

import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.repositorio.Repositorio;
import learning.thdramos.maratonajava.javacore.aula22.polimorfismo.servico.RepositorioBancoDeDados;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTest1 {
    static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        List<String> seriesList = new LinkedList<>();
        seriesList.add("The Office");
        seriesList.add("The Big Bang Theory");
        seriesList.add("Supernatural");
        seriesList.add("The Boys");
        System.out.println(seriesList);

    }
}
