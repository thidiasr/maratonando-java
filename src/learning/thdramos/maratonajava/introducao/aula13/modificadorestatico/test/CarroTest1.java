package learning.thdramos.maratonajava.introducao.aula13.modificadorestatico.test;

import learning.thdramos.maratonajava.introducao.aula13.modificadorestatico.dominio.Carro;

public class CarroTest1 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("Mercedes",275);
        Carro c3 = new Carro("Audi",290);

        Carro.setVelocidadeLimite(180);
        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
