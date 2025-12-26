package JavaCore.BlocoIncializador;

public class test {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()){
            System.out.println(episodio);
        }
    }
}
