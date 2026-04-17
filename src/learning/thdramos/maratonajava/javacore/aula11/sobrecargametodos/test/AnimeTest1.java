package learning.thdramos.maratonajava.javacore.aula11.sobrecargametodos.test;

import learning.thdramos.maratonajava.javacore.aula11.sobrecargametodos.dominio.Anime;

public class AnimeTest1 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Pokemon", "Tv", 27);
        anime.init("Naruto", "Streaming", 12, "ação");
        anime.imprime();
    }
}