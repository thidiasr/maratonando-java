package learning.thdramos.maratonajava.javacore.aula21.interfaces.dominio;

public class FileLoader implements DataLoader{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo.");
    }
}
