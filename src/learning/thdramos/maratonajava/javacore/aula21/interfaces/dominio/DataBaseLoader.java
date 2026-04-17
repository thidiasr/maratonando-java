package learning.thdramos.maratonajava.javacore.aula21.interfaces.dominio;

public class DataBaseLoader implements DataLoader {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }
}
