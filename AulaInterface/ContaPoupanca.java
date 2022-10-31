package AulaInterface;

public class ContaPoupanca implements Conta{

    private double saldoPolpanca;
    private double limite;
    private int dataAniversario;

    public double getSaldoPolpanca() {
        return saldoPolpanca;
    }

    private void setSaldoPolpanca(double saldoPolpanca) {
        this.saldoPolpanca = saldoPolpanca;
    }

    public double getLimite() {
        return limite;
    }

    private void setLimite(double limite) {
        this.limite = limite;
    }

    public int getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(int dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public void depositar(double valor) {
        if (valor >= 0){
            this.setSaldoPolpanca(this.getSaldoPolpanca()+valor);
            this.setDataAniversario(31);
        }else{
            System.out.print("Não foi possivél depositar !!");
        }
        
    }

    @Override
    public void sacar(double valor) {
        if((this.getSaldoPolpanca()-valor) >= 0 && (valor >= 0)){
            this.setSaldoPolpanca(this.getSaldoPolpanca()-valor);
        }else{
            System.out.print("Saldo insuficiente !!");  
        }
        
    }
    
}
