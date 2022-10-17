package Aula26_09_2022;

class ContaCorrente {
    //Atributos
    double saldo;
    double limite;

    //Métodos construtor
    ContaCorrente(double saldo){
        this.saldo = saldo;
    }
    ContaCorrente(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }


    //Métodos de Rendimento: 
    double calculaRendimento(){
        return this.saldo*1.1;
    }
    double calculaRendimento(double taxa){
        return this.saldo*(1+(taxa/100));
    }
    double calculaRendimento(double taxa, int tempo){
        return this.saldo*Math.pow((1+(taxa/100)),(double)tempo);
    }
    //PIX:
    void pix(ContaCorrente destino, double valor){
        //verificar saldo da conta de origem
        if(this.saldo >= valor){
            destino.saldo += valor;
            this.saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente !!");
        }
    }
    void pix(ContaCorrente destino, double valor, boolean estornar){
        //verificar saldo da conta de origem
        if(this.saldo >= valor){
            destino.saldo += valor;
            this.saldo -= valor;
            System.out.println("PIX feito com sucesso !!");
        }else{
            System.out.println("Saldo insuficiente !!");
        }
        if(estornar == true){
            this.saldo += valor;
            destino.saldo -= valor;
            System.out.println("O PIX foi estornado !!");
        }
    }
    
    void pix(ContaCorrente destino, double valor, double limite){
        if(this.saldo >= valor && valor <= limite){
            destino.saldo += valor;
            this.saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente !!");
        }
    }

    void metodoNormal(){
        System.out.println("Esse é o método em seu formato normal.");
    }
    void metodoNormal(int a){
        System.out.println("Esse é o método com overload "+a);
    }


}
