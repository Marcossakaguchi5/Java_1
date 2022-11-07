package Aula07112022.Task;

public class Teste {
    public static void main(String[] args){
        Funcionario f = new Funcionario();
        try{
            f.calcularSalario(-10);
        }catch(IllegalArgumentException e){
            System.out.println("Ouve um erro ");
            System.out.println(e);
        }
        System.out.println(f.toString());
    }
    String nome1 = new String("Candanguin Do Prey");
    String nome2 = "Candanguin Do Prey";


}
