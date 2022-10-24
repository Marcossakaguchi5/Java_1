package ExercicioAula17_10_2022;

public class Conteudo {
    private String titulo,sinopse; 
    private int classificacaoIndicativa, dataLancamento, duracao;

    public Conteudo(String titulo, String sinopse, int classificacaoIndicativa, int dataLancamento,
    int duracao) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.dataLancamento = dataLancamento;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public int getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(int dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    void toPlay(){
        System.out.println("Playing "+this.titulo);
    }
}
