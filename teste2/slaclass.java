package teste2;

public class slaclass implements sla{
    private boolean ligado;
    private boolean desligado;
    
    public slaclass() {
        this.ligado = false;
        this.desligado = true;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getDesligado() {
        return desligado;
    }

    public void setDesligado(boolean desligado) {
        this.desligado = desligado;
    }

    @Override
    public void ligar() {
       if(getDesligado() == false ){
        System.out.println("Ligando");
       }
        
        
    }

    @Override
    public void desligar() {
        if(getLigado() == false){
            System.out.println("Desligando");
        }
        
    }
    
    
    
}
