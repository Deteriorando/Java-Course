package JavaCore.ClassesUtilitarias.Wrappers;

import javax.xml.transform.Source;

public class WrappersView {
    public static void main(String[] args) {

        //Tipos Primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 10;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        // Wrappers
        // A Diferença é que podemos trabalhar com referência como objetos

        // Boxing / Auto-Boxing
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 10;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // Unboxing

        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));


    }
}
