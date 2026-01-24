package JavaCore.Excecoes.SimulationErros.RuntimeError;


import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        // Multiplas exceções com try catch.
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
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
        } catch (Exception e){
            // Multicath em linha de código, feito para organizar.
            // Não pode ter exceções onde estão dentro da mesma linha de herança, apenas se não fizer parte da mesma linha.
            System.out.println("SQLException | FileNotFoundException");
            e = new RuntimeException(); // ≤ Existe, mas muito raro a sua utilização, e é apenas usado para capturar uma exceção
        }
    }

    private static void TalvezLanceExececao() throws SQLException, FileNotFoundException {

    }
}
