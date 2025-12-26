package JavaCore.Construtores;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    /* Construtores vão ser o que vai construir/inicializar os seus objetos da sua classe */

    public Anime(String nome, String tipo, int episodios, String genero){ /* <- construtor é sem feito sem um parametro de retorno, e nem o void é incluido! */
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    // O construtor ele obriga a colocar valores, oque pode ser uma vantagem.

    // ---------------------------------------------------------
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
