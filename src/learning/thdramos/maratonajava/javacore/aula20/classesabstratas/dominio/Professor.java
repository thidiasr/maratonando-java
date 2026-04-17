package learning.thdramos.maratonajava.javacore.aula20.classesabstratas.dominio;

public class Professor extends Funcionario {
    public Professor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void CalculaBonus() {
        this.salario = this.salario + this.salario * 0.1;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
