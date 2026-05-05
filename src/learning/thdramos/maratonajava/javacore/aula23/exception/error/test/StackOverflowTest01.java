package learning.thdramos.maratonajava.javacore.aula23.exception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }

}
