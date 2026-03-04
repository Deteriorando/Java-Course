package JavaCore.POO.Interface.Testes;

import JavaCore.POO.Interface.Dominio.DataBaseLoader;
import JavaCore.POO.Interface.Dominio.DataLoader;
import JavaCore.POO.Interface.Dominio.FileLoader;

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
