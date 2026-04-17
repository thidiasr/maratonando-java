package learning.thdramos.maratonajava.javacore.aula12.construtores.test;

import learning.thdramos.maratonajava.javacore.aula12.construtores.dominio.Anime;

public class AnimeTest1 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto","Steaming",12, "Ação","Pierrot");
        anime.imprime();
    }
}
