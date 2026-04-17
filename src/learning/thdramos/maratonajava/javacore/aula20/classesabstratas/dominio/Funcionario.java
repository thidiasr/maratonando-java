package learning.thdramos.maratonajava.javacore.aula20.classesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        CalculaBonus();
    }

    public abstract void CalculaBonus();

    @Override
    public void imprime() {
        System.out.println("imprimindo...");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
