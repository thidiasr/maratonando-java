package learning.thdramos.maratonajava.javacore.aula21.interfaces.test;

import learning.thdramos.maratonajava.javacore.aula21.interfaces.dominio.DataBaseLoader;
import learning.thdramos.maratonajava.javacore.aula21.interfaces.dominio.FileLoader;

public class DataLoaderTest1 {
    static void main(String[] args) {
        DataBaseLoader databaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
    }
}
