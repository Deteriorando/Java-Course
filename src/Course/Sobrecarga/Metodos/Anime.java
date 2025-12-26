package Course.Sobrecarga.Metodos;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    /* A Sobrecarga de metodos acontece, quando os tipos dos parametros são diferente, ou com mais parametros com o mesmo nome do metodo. */
    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    // Sobrecarga de metodos acontece aqui.
    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios); // <- Chamo o metodo e depois que executar ele volta pra linha onde estava.
        this.genero = genero;
    }

    public void imprimir(){
        System.out.println(this.tipo);
        System.out.println(this.episodios);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
