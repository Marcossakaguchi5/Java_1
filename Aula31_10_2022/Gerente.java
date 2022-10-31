package Aula31_10_2022;

public class Gerente extends Funcionario{
    private int codGerente;

    public int getCodGerente() {
        return codGerente;
    }

    public void setCodGerente(int codGerente) {
        this.codGerente = codGerente;
    }
    
    @Override
    public void bonificacao(double valor){
        this.setSalario(this.getSalario()+valor);
        System.out.println("Salario com bonificação: "+this.getSalario());
    }
}
