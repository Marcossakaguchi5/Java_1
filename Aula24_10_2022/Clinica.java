package Aula24_10_2022;

public class Clinica {
   private String nomeClinica;
   private String endereco;

    public String getNomeClinica() {
        return nomeClinica;
    }
    public void setNomeClinica(String nomeClinica) {
        this.nomeClinica = nomeClinica;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    void realizarCirurgia(Animal a){
        System.out.println("Cirurgia realizada em "+a.getNome());
    }

}
