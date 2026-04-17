package learning.thdramos.maratonajava.javacore.aula14.modificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    {
        episodios = new int[25];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        System.out.println("Dentro do bloco de inicialização não estático");
        for (int episodio: episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 1.");
    }
    static {
        System.out.println("Dentro do bloco de inicialização estático 2.");
    }
    static {
        System.out.println("Dentro do bloco de inicialização estático 3.");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){

    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
