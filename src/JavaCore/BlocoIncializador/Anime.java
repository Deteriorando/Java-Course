package JavaCore.BlocoIncializador;

public class Anime {
    private String nome;
    private int[] episodios;
    /*  1 - Alocado espaço em memória do objeto
        2 - Cada atributo de classe é criado e inicializado com valores default ou que for passada.
        3 - Bloco de inicialição é execultado
        4 - Construtor é execultado
    * */

    {
        // Bloco de incialização
        // ele sempre é execultado

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
