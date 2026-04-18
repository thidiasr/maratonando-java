package learning.thdramos.maratonajava.javacore.aula21.interfaces.test;

import learning.thdramos.maratonajava.javacore.aula21.interfaces.dominio.DatabaseLoader;
import learning.thdramos.maratonajava.javacore.aula21.interfaces.dominio.DataLoader;
import learning.thdramos.maratonajava.javacore.aula21.interfaces.dominio.FileLoader;

public class DataLoaderTest1 {
    static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        DataLoader.retriveMaxDataSize();
        DatabaseLoader.retriveMaxDataSize();
    }
}
