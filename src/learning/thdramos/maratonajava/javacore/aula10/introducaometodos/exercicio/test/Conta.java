package learning.thdramos.maratonajava.javacore.aula10.introducaometodos.exercicio.test;

public class Conta {

    private double saldo; // só a classe pode acessar

    protected void alterarSaldo(double valor) { // subclasses podem usar
        saldo += valor;
    }

    public double getSaldo() { // qualquer classe pode consultar
        return saldo;
    }
}

