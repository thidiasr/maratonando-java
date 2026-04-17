package learning.thdramos.maratonajava.javacore.aula15.associacao.test;

import learning.thdramos.maratonajava.javacore.aula15.associacao.dominio.Jogador;
import learning.thdramos.maratonajava.javacore.aula15.associacao.dominio.Time;

public class JogadorTest2 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Fallen");
        Time time = new Time("Furia");

        jogador1.setTime(time);
        jogador1.imprime();

    }
}
