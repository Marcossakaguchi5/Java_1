package AulaInterface;

public class ContaCorrente implements Conta {

    private double saldoContaCorrente;
    private double limite;

    public double getSaldoContaCorrente() {
        return saldoContaCorrente;
    }

    private void setSaldoContaCorrente(double saldoContaCorrente) {
        this.saldoContaCorrente = saldoContaCorrente;
    }

    public double getLimite() {
        return limite;
    }

    private void setLimite(double limite) {
        limite = 0.0;
        this.limite = limite;
    }

    @Override
    public void depositar(double valor) {
        if (valor >= 0){
            this.setSaldoContaCorrente(this.getSaldoContaCorrente()+valor);
        }else{
            System.out.print("Não foi possivél depositar !!");
        }
        
    }

    @Override
    public void sacar(double valor) {
        if(this.getSaldoContaCorrente() + this.getLimite() >= 0){
            if(this.getSaldoContaCorrente() >= valor){
                this.setSaldoContaCorrente(this.getSaldoContaCorrente()-valor);
                System.out.println("Saque feito !!");
            }else{
                double rest = valor - this.getSaldoContaCorrente();
                this.setSaldoContaCorrente(0.0);
                this.setLimite(this.getLimite()-rest);
                System.out.println("Saque feito !!");
            }
        }else{
            System.out.println("Saldo Insuficiente !!");
        }
        
    }

}
