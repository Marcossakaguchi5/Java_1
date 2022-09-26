import java.util.Scanner;

public class Elevador{
    //Atributos:
    int andarElevador;
    int totalAndar;
    int capacidadeElevador;
    int pessoasElevador;

    //Métodos: 
    public Elevador(){
        Scanner imput = new Scanner(System.in);

        andarElevador = 0;
        pessoasElevador = 0;

        System.out.print("Digite o total de andares no predio: ");
        totalAndar = imput.nextInt();

        System.out.print("Digite a capacidade do elevador: ");
        capacidadeElevador = imput.nextInt();   
    }
    public void Entra(){
        if((pessoasElevador+1) <= capacidadeElevador){
            pessoasElevador += 1;
            System.out.println("A pessoa entrou no elavador !!");
        }else{
            System.out.println("Elevadoer cheio, a pessoa não pode entrar !!");
        }
    }
    public void Sai(){
        if(pessoasElevador != 0){
            pessoasElevador -= 1;
            System.out.println("A pessoa saiu do elavador !!");
        }else{
            System.out.println("Elevadoer vazio.");
        }
    }
    public void Sobe(){
        if((andarElevador+1) <= totalAndar){
            andarElevador += 1;
            System.out.println("O elavador subiu um andar\nAndar atual: "+andarElevador);
        }else{
            System.out.println("O elevador está no ultimo andar, não pode subir mais !!");
        }
    }
    public void Desce(){        
        if(andarElevador != 0){
            andarElevador -= 1;
            System.out.println("O elavador desceu um andar\nAndar atual: "+andarElevador);
        }else{
            System.out.println("Elevadoer no terreo, não pode descer mais !!");
        }
    }
}
