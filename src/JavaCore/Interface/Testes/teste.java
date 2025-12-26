package JavaCore.Interface.Testes;

import JavaCore.Interface.Dominio.DataBaseLoader;
import JavaCore.Interface.Dominio.DataLoader;
import JavaCore.Interface.Dominio.FileLoader;

public class teste {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();
        dataBaseLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
