package learning.thdramos.maratonajava.introducao.aula7;

public class Aula7Arrays2 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '/u0000'  ' '
        // boolean false
        // String null

        String[] nomes = new String[4];

        nomes[0] = "Thiago";
        nomes[1] = "Julia";
        nomes[2] = "Rafaela";
        nomes[3] = "Bruna";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
