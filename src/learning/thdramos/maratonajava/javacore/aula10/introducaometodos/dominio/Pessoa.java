package learning.thdramos.maratonajava.javacore.aula10.introducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if(idade < 0 ){
            System.out.println("Idade inválida!");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

