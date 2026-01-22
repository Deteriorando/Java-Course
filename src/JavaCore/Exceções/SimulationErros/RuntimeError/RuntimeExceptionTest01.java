package JavaCore.Exceções.SimulationErros.RuntimeError;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        AbreConexao();
    }

    private static String AbreConexao() {
        try {
            System.out.println("Abrindo o arquivo.");
            System.out.println("Escrevendo o arquivo");
            return "Conexão aberta";
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            //Finally vai sempre ser execultado independe da implementação.
            System.out.println("Fechando o arquivo do SO");
        }
        return null;
    }

    private static void AbreConexao2() {
        //uso bem raro do try finally, mas é possivel!
        try {
            System.out.println("Abrindo o arquivo.");
            System.out.println("Escrevendo o arquivo");
        } finally {
            //Finally vai sempre ser execultado independe da implementação.
            System.out.println("Fechando o arquivo do SO");
        }
    }
}
