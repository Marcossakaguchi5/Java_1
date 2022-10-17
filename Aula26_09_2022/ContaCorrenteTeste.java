package Aula26_09_2022;

public class ContaCorrenteTeste {
    public static void main(String[]args){
        ContaCorrente cc = new ContaCorrente(1000);
        ContaCorrente cc2 = new ContaCorrente(5000, 500);

        System.out.println("======= Teste PIX =======");
        System.out.println("Saldo Conta CC: "+cc.saldo);
        System.out.println("Saldo Conta CC2: "+cc2.saldo);
        cc.pix(cc2, 50);
        System.out.println("Saldo Conta CC: "+cc.saldo);
        System.out.println("Saldo Conta CC2: "+cc2.saldo);
        cc2.pix(cc, 20, true);
        System.out.println("Saldo Conta CC: "+cc.saldo);
        System.out.println("Saldo Conta CC2: "+cc2.saldo);

        /* ================================ TESTE DO RETORNO DO INVESTIMENTO ================================
        System.out.println("Retorno do investimento: "+cc.calculaRendimento());
        System.out.println("Retorno do investimento (Taxa): "+cc.calculaRendimento(15.35));
        System.out.println("Retorno do investimento (Taxa & Tempo): "+cc.calculaRendimento(8.5, 15));

        System.out.println("Retorno do investimento: "+cc2.calculaRendimento());
        System.out.println("Retorno do investimento (Taxa): "+cc2.calculaRendimento(15.35));
        System.out.println("Retorno do investimento (Taxa & Tempo): "+cc2.calculaRendimento(8.5, 15));*/

        /*cc.metodoNormal();
        cc.metodoNormal(5);*/
    }
}
