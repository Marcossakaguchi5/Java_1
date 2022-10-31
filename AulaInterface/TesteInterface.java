package AulaInterface;

public class TesteInterface {
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.depositar(500);
        //cc.sacar(1000);
        cp.depositar(500);
        //cp.sacar(1000);

        GeradorExtratos ge = new GeradorExtratos();
        ge.geraExtrato(cp);
        ge.geraExtrato(cc);
    }
}
