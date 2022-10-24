package ExercicioAula17_10_2022;

public class Filme extends Conteudo{
    private String distribuidora, diretor;
    
    public Filme(String titulo,  String sinopse, int classificacaoIndicativa, int dataLancamento,
            int duracao, String distribuidora, String diretor) {
        super(titulo, sinopse, classificacaoIndicativa, dataLancamento, duracao);
        this.distribuidora = distribuidora;
        this.diretor = diretor;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

}
