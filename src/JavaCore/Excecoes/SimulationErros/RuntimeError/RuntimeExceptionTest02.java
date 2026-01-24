package JavaCore.Excecoes.SimulationErros.RuntimeError;


import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        // Multiplas exceções com try catch.
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e){
            // Se for capturar uma exceção mais generíca, sempre deixa ela por último para tratar!
            System.out.println("Dentro do RuntimeException");
        }

        try {
            TalvezLanceExececao();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            TalvezLanceExececao();
        } catch (SQLException | FileNotFoundException e){
            // Multicath em linha de código, feito para organizar.
            // Não pode ter exceções onde estão dentro da mesma linha de herança, apenas se não fizer parte da mesma linha.
            e.printStackTrace();
        }
    }

    private static void TalvezLanceExececao() throws SQLException, FileNotFoundException {

    }
}
