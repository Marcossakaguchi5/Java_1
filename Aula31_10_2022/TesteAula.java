package Aula31_10_2022;

public class TesteAula {
    public static void main(String[] args){
        /*Funcionario f = new Funcionario();
        f.setSalario(1980.75);*/
        Gerente g = new Gerente();
        g.setSalario(7500.00);
        System.out.println("Salario do gerente: "+g.getSalario()+" R$");
        g.bonificacao(150);

    }
}
