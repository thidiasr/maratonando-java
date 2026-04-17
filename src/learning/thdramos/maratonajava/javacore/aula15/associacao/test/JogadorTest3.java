package learning.thdramos.maratonajava.javacore.aula15.associacao.test;

import learning.thdramos.maratonajava.javacore.aula15.associacao.dominio.Jogador;
import learning.thdramos.maratonajava.javacore.aula15.associacao.dominio.Time;

public class JogadorTest3 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("KSCERATO");
        Jogador jogador2 = new Jogador("molodoy");
        Time time = new Time("Furia");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);
        System.out.println("---- Jogador ----");
        jogador1.imprime();
        System.out.println("---- Jogador ----");
        jogador2.imprime();
        System.out.println("---- Time ----");
        time.imprime();

    }
}
