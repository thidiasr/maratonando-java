package learning.thdramos.maratonajava.javacore.aula17.sobrescrita.dominio;

public class Anime {
    private String nome;

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Anime(String name) {
        this.nome = name;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }
}
