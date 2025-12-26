package JavaCore.BlocoIncializador.InicializadorStatico;

public class Anime {
    private String nome;
    private static int[] episodios;

    // A diferença do bloco de inicialização com o estático é que ele só execulta apenas uma vez.
    static {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(){
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
