package ExercicioAula17_10_2022;

public class Serie extends Conteudo{
    int numTemporadas, numEp;

    public Serie(String titulo, String sinopse, int classificacaoIndicativa, int dataLancamento,
            int duracao, int numTemporadas, int numEp) {
        super(titulo, sinopse, classificacaoIndicativa, dataLancamento, duracao);
        this.numTemporadas = numTemporadas;
        this.numEp = numEp;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public int getNumEp() {
        return numEp;
    }

    public void setNumEp(int numEp) {
        this.numEp = numEp;
    }

    void toPlay(int ep, int temporada){
        super.toPlay();
        System.out.println("Temporada "+temporada+" | Episodio: "+ep);
    }
}