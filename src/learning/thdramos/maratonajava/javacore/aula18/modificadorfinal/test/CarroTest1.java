package learning.thdramos.maratonajava.javacore.aula18.modificadorfinal.test;

import learning.thdramos.maratonajava.javacore.aula18.modificadorfinal.dominio.Carro;
import learning.thdramos.maratonajava.javacore.aula18.modificadorfinal.dominio.Comprador;
import learning.thdramos.maratonajava.javacore.aula18.modificadorfinal.dominio.Nissan;

public class CarroTest1 {
    static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kakashi");
        System.out.println(carro.COMPRADOR);
        Nissan nissan = new Nissan();
        nissan.setNome("Silvia S13");
        nissan.imprime();
    }
}
