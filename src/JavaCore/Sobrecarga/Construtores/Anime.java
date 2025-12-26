package JavaCore.Sobrecarga.Construtores;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String Studio;

    /* Construtores vão ser o que vai construir/inicializar os seus objetos da sua classe */

    public Anime(String nome, String tipo, int episodios, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    // Sobrecarga de construtores

    public Anime(String nome, String tipo, int episodios, String genero, String studio){
        this(nome, tipo, episodios, genero);
        this.Studio = studio;
    }

    public Anime(){

    }

    // --------------------------------------------------------- //
    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo;}

    public int getEpisodios() { return episodios; }
    public void setEpisodios(int episodios) { this.episodios = episodios; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
}
