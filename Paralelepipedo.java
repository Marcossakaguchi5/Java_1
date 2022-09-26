import java.util.Scanner;

public class Paralelepipedo{
    //Atributos:
    double altura;
    double largura;
    double profundidade;

    //Métodos:
    public Paralelepipedo(){
        Scanner im = new Scanner(System.in);

        System.out.print("Digite o valor da Altura: ");
        altura = im.nextDouble();
        System.out.print("Digite o valor da Largura: ");
        largura = im.nextDouble();
        System.out.print("Digite o valor da Profundidade: ");
        profundidade = im.nextDouble();
    }

    public void CalculaVolume(){
        double volume = (altura*largura*profundidade);
        System.out.println("O volume do Paralelepipedo é: "+volume);
    }

    public void CalculaFace(){
        Scanner imput = new Scanner(System.in);

        System.out.print("Digite qual lado do Paralelepipedo você cucular a area: ");
        int op = imput.nextInt();

        if((op == 1)||(op == 2)){
            double area = largura*altura;
            System.out.println("A area da face "+op+" é: "+area);
        }else if((op == 2)||(op == 4)){
            double area = profundidade * largura;
            System.out.println("A area da face "+op+" é: "+area);
        }
        else if ((op == 5)||(op == 6)){
            double area = profundidade * altura;
            System.out.println("A area da face "+op+" é: "+area);
        }else{
            System.out.println("Digite uma opção validade !!!");
        }
        
    }

    public void CalculaAreaTotal(){
        double areaTotal = (((largura*altura)*2)+((profundidade * largura)*2)+((profundidade * altura)*2));
        System.out.println("A area total do Paralelepipedo é :"+areaTotal);
    }
}